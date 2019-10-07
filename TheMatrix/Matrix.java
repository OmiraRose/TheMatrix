import java.util.Scanner;
import java.io.*;
public class Matrix {

	 public static void main(String[] args) throws Exception {
	        
	        final int ROWS = 45;
	        final int COLUMNS = 20;
	        
	        //Open file.
	        File file = new File("test.txt");
	        
	        //Create array of fixed lengths to store chars from the string.
	        char[][] words = new char[ROWS][COLUMNS];
	        
	        //Scanner the file then store the text file into a string.
	        Scanner testFile = new Scanner(file);
	        String oldString = testFile.nextLine();
	        
	        oldString = fixLength(oldString, (ROWS * COLUMNS));

	        //Holds the value at which the index of the char that is need from the string is stored.
	        int place = 0;
	        //loop stores each char from oldString to the array.
	        for (int column = 0; column < COLUMNS; column++) {
	            for (int row = 0; row < ROWS; row++) {
	                words[row][column] = oldString.charAt(place);
	                place ++;
	            }
	        }
	        
	        
	        String newString = "";
	        
	        for(int row = 0; row < ROWS; row++) {
	            for(int column = 0; column < COLUMNS; column++) {
	                newString += words[row][column];
	            }
	        }
	        //Display gibberish string.
	        System.out.println(newString);
	        //Close the file.
	        testFile.close();
	    }
	    
	    //Fill what would be the unused space in the array with '-' should the string be too short.
	    //If the string is too large for the array, the string is cut short.
	    public static String fixLength(String in, int correctLength) {
	        String temp = "";
	        if (in.length() > correctLength) {
	            temp = in.substring(0, correctLength);
	            in = temp;
	            return in;
	        } else {
	            while(in.length() < correctLength) {
	                in = in.concat("-");
	            }
	            return in;
	        }

}
}
	
	


