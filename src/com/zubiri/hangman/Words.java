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
public class Words {
	
	
	private ArrayList<String> Word = new ArrayList<String>();
	

	private String randomWord="";
	
	public Words() {
		this.Word.add("lazkano");
		this.Word.add("intxausti");
		this.Word.add("artola");
		this.Word.add("alberdi");
		this.Word.add("lekubide");
		this.Word.add("ortiz");
		this.Word.add("gonzalez");
	};
	
	public Words(ArrayList<String> Word) {
		
		this.Word = Word;
		
	}
	
	public ArrayList<String> getWords(){
		
		return Word;
		
	}
	
	public void addWord(String _Word){
		this.Word.add(_Word);
	}
		
	public void setWord(ArrayList<String> word){
		
		this.Word = word;
	}
	
	public void setRandomWord(String randomWord) {
		
		this.randomWord = randomWord;
	}
	/*
	public String getrandomWord() {
		
		return randomWord;
		
		
	}
	*/
	/**@author ik013043z1
	 * 
	 */
	
	public String selectRandomWord() {
		
		return  Word.get(new Random().nextInt(Word.size()));
		
	}
	
	/**
	 * 
	 * @param letter
	 * @return
	 */
	
	public boolean validInput(String letter) {
		
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
	
	public boolean letterMatch(String letter) {
		
		boolean letterMatch = false;
		
		for(int i = 0; i < randomWord.length(); i++) {
			
			if(randomWord.substring(i, i+1).matches(letter.substring(0, 1)));
			letterMatch = true;
			
		}
		
		return letterMatch;
		
	}
	
	/**
	 * 
	 */
	
	public ArrayList<Integer> matchPositions(String letter){
		
		ArrayList<Integer> positions = new ArrayList();
		
		for (int i = 0; i< randomWord.length(); i++) {
			
			if(randomWord.substring(i,i+1).matches(letter.substring(0, 1)))
				
				positions.add(i);
		}
		
		return positions;
		
	}
}
