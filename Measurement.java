package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Measurement {
	
	private static HashSet<String> benchmark = null;
	
	public static void LoadBenchmark() {
		benchmark = new HashSet<String>();
		try {
			File file = new File("data\\Book1and2_pair.csv");
			if (!file.exists())
				System.out.println("No file");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			String tokens[] = null;
			while ((line = reader.readLine()) != null) {
				// Split and rejoin line with underscore to match format of
				// that created in results of NestedLoopByNameJaccard
				tokens = line.split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1);
				String bmark = tokens[0] + "_" + tokens[1];
				benchmark.add(bmark);
			}
			reader.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void CalcuMeasure(List<String> result) {
		if (result.size() == 0) {
			System.out.println("Precision=0, Recall=0, Fmeasure=0");
			return;
		}
		
		int count = 0;
		Iterator<String> it = result.iterator();
		String pair = null;
		while (it.hasNext()) {
			pair = it.next();
			if (benchmark.contains(pair))
				count++;
		}
		
		if (count == 0) {
			System.out.println("Precision=0, Recall=0, Fmeasure=0");
			return;
		}
		
		double precision = (double) count / (double) result.size();
		double recall = (double) count / (double) benchmark.size();
		double fmeasure = 2 * precision * recall / (precision + recall);
		System.out.println("Number of matches between set and benchmark=" + count);
		System.out.println("Precision=" + precision + ", Recall=" + recall + ", Fmeasure=" + fmeasure);
	}
}
