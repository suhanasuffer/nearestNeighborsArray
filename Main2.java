/*
Suhani Thakur
22070126115
AIML B2
*/

import java.io.*;

public class Main2 {
	public static void main(String[] args) throws IOException{
		UserInput inp = new UserInput();
		int size = inp.size();
		double[] inputArray = inp.array(size);
		double distance = Math.abs(inputArray[0] - inputArray[1]);
		
		int neighbourIndex1 = 0;
		int neighbourIndex2 = 1;
		
		for (int i = 0; i < size - 1; i++{
			double currentDistance = Math.abs(inputArray[i] - inputArray[i + 1]);
		
		if (currentDistance < distance){
            neighbourIndex1 = i;
            neighbourIndex2 = i + 1;
            distance = currentDistance;
  }
 }

  System.out.println("The Smallest Distance in the Array is: " + distance + "between " + inputArray[neighbourIndex1] + " and " + inputArray[neighbourIndex2]);
 }
}