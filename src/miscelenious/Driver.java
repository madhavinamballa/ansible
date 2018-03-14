package miscelenious;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\namburu\\workspace\\gitjavaproject\\carproject\\src\\miscelenious\\temp.txt";
		ReadFile rf = new ReadFile();
		//String[] input =rf.readFile(file);
		String[] input = rf.readFile(file);
		MainClass main = new MainClass(input);
		System.out.println(main.toString());
	}

}
