import java.io.*;
import java.util.*;

public class UserInput {
	int size() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		return scan.nextInt();
	}
	
	double[] array(int size) throws IOException {
		double[] inputArray = new double[size];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

        System.out.println("Enter " + size + " Elements:");
		
		String array = br.readLine();
		String[] input = array.trim().split("\\s+");
		
		for(int i = 0; i < size; i++) {
              inputArray[i] = Double.parseDouble(input[i]);
 }
 
              return inputArray;
	}
}



		
 