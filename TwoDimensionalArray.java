/** Program: Two Dimensional Array
 * File: TwoDimensionalArray.java
 * Summary: This program reads from a text file then displays the text into a two dimensional array.
 * Author: Pearl Jomalon
 * Date: October 19, 2018
 */

package twoDimensionalArray;

import java.io.*;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		String fileText = "";
		char[][] textArray;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("readFile"));
			
			String readLine = "";
			
			while ((readLine = br.readLine()) != null) {
				fileText += readLine;
				
				System.out.println(fileText);
			}
			br.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		textArray = loadArray(fileText);
		arrayOutput(textArray);
	}
	
	public static char[][] loadArray(String fileText) {
		char [][] textArray = new char[20][45];
		int count = 0;
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 45; j++) {
				if (count < fileText.length()) {
					textArray[i][j] = fileText.charAt(count);
					count++;
				}
				else {
					textArray[i][j] = '@';
				}
			}
		}
		return textArray;
	}
	
	private static void arrayOutput(char[][] textArray) {
		
		StringBuilder outputText = new StringBuilder();
		
		for(int i = 0; i < 45; i++) {
			for(int j = 0; j < 20; j++) {
				outputText.append(textArray[j][i]);
			}
		}
		System.out.println(outputText);
	}
}