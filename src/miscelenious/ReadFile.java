package miscelenious;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static String[] readFile(String filename ) throws IOException {
		FileReader fr = new FileReader(filename);
		// always wrap file reader in abuffer reader
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		String[] arr = {};
		while ((line = br.readLine()) != null) {
		    arr = line.split(" ");
			//System.out.println(line);
		}
		return arr;
	}

}
