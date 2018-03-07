/**
 * Author:	Sam Cooney
 * Project:	MyTestPMG
 * Date:	Sept. 13, 2017
 * I assert that the program I am submitting is the result of my own efforts. 
 */

import java.util.StringTokenizer;	// Importing StrTok class.
import java.util.Random;			// Importing Random class.

public class MyTestPGM {

	public static void main(String[] args) {
		StringTokenizer strTok = new StringTokenizer("Hello World.\n");	// Create new strtok object.
		Random gen = new Random();	// Create new random object.
		
		boolean moreTokens = strTok.hasMoreTokens();	// Using StrTok class.
		System.out.println(moreTokens + "\n");			// Using StrTok class.
		int numb = gen.nextInt(25);	// Random number generation.
		System.out.println(numb);	// Random number generation.
		numb = gen.nextInt(6)+1;	// Random number generation.
		System.out.println(numb);	// Random number generation.
		numb = gen.nextInt(100)+10;	// Random number generation.
		System.out.println(numb);	// Random number generation.
	}

}
