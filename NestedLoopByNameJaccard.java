package Data;

import java.util.ArrayList;
import java.util.List;

public class NestedLoopByNameJaccard {

	private static double threshold = 0.75;
	private static int q = 3;

	public static void main(String[] args) {

		// Load both datasets
		BookQ7[] books1 = CSVLoader2.bookLoader2("data\\Book1.csv");
		BookQ7[] books2 = CSVLoader2.bookLoader2("data\\Book2.csv");

		List<String> result = new ArrayList<String>();
		BookQ7 book1 = null, book2 = null;
		int id1 = 0, id2 = 0;
		String title1 = null, title2 = null;
		long start = System.currentTimeMillis();
		// Iterate over first dataset
		for (int i = 0; i < books1.length ; i++) {
			book1 = books1[i];
			id1 = book1.GetID();
			title1 = book1.GetTitle();
			// Nested iteration comparing values from 1st dataset with 2nd
			for (int j = 0; j < books2.length ;j++) {
				book2 = books2[j];
				id2 = book2.GetID();
				title2 = book2.GetTitle();
				double sim = Similarity.CalcuJaccard(title1, title2, q);
				if (sim > threshold) {
					result.add(id1 + "_" + id2);
				}
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Time=" + time + "ms");
		System.out.println("number of matches=" + result.size());

		Measurement.LoadBenchmark();
		Measurement.CalcuMeasure(result);
	}
}
