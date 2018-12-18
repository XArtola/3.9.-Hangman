/**
 * 
 */
package com.zubiri.hangman;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author ik013043z1
 *
 */
public class Hangman {
	
	
	private ArrayList<String> surnames = new ArrayList<String>();
	private String randomSurname="";
	
	public Hangman() {};
	public Hangman(ArrayList<String> surnames) {
		
		this.surnames = surnames;
		
	}
	
	public ArrayList<String> getSurnames(){
		
		return surnames;
		
	}
	
	public void setSurnames(ArrayList<String> surnames){
		
		this.surnames = surnames;
	}
	
	public void setRandomSurname(String randomSurname) {
		
		this.randomSurname = randomSurname;
	}
	
	public String getrandomSurname() {
		
		return randomSurname;
		
		
	}
	
	/**@author ik013043z1
	 * 
	 */
	
	public void generateRandomSurname() {
		
		this.randomSurname = surnames.get(new Random().nextInt(surnames.size()));
		
	}
	
	/**
	 * 
	 * @param letter
	 * @return
	 */
	
	public boolean validLetter(String letter) {
		
		boolean isValid = true;
		
		if (letter.length() != 1)
			isValid = false;
		else if(letter.matches("^[a-z]"))
			isValid = false;
		
		return isValid;
		
	}
	
	/**
	 * 
	 */
	
	public boolean letterMatch (char letter ) {
		
		boolean letterMatch = false;
		
		
		
	}
}
