/**
 * 
 */
package com.zubiri.hangman;

import java.util.ArrayList;

/**
 * @author Xabier
 *
 */
public class Word {

	private String word = "";

	public Word(String word) {

		this.word = word;

	}

	public String getWord() {

		return word;

	}

	public void setWord(String word) {

		if (!word.matches("^[a-z]+")) {

			this.word = word;

		}

	}

	public boolean letterMatch(String letter) {

		boolean letterMatch = false;

		for (int i = 0; i < word.length(); i++) {

			if (word.substring(i, i + 1).matches(letter.substring(0, 1)))
				;
			letterMatch = true;

		}

		return letterMatch;

	}

	public ArrayList<Integer> matchPositions(String letter) {

		ArrayList<Integer> positions = new ArrayList<Integer>();

		for (int i = 0; i < word.length(); i++) {

			if (word.substring(i, i + 1).matches(letter.substring(0, 1)))

				positions.add(i);
		}

		return positions;

	}

}
