/******* Advent of Code Day 02 Project 02   *************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02Project02Main {
	public static void main(String[] args) {
		
		ArrayList<String> boxIDList = new ArrayList<String>();
		int counter=0;
		int boxIDOne=0, boxIDTwo=0;
		int position=0;
	
		try {
			File myFile = new File("boxIDs.txt");
			Scanner inputFile = new Scanner(myFile);

			while (inputFile.hasNext()) {
				boxIDList.add(inputFile.nextLine());
			
			}

			inputFile.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("File IO error!");
		}
	
				
		for (int i = 0; i < boxIDList.size(); i++) {
			for (int j = 1; j < boxIDList.size(); j++) {
				char[] first  = boxIDList.get(i).toCharArray();
				char[] second = boxIDList.get(j).toCharArray();
				counter = 0;

				int minLength = Math.min(first.length, second.length);

				for(int k = 0; k < minLength; k++){
					if (first[k] != second[k]){	        
			            counter++;
			            position = k;
			        }
				}
				
				if (counter==1) {
					boxIDOne = i;
					boxIDTwo = j;
				}
			}
		}
		
		System.out.println("string one = " + boxIDList.get(boxIDOne) );
		System.out.println("string two = " + boxIDList.get(boxIDTwo) );
		System.out.println("position = " + position );
		
	}
}