package gmit;

import java.util.*;
import java.io.*;

/* The Dictionary class has been altered to provide a choice of two data structures to use
 * for a word search - an array list and a hash table.
 */
public class Dictionary {
	private List<Word> wordList = new ArrayList<Word>(); //Instance variable of type List (an interface)
	private Map<StrangeString, Word> wordMap = new HashMap<StrangeString, Word>(); //Instance variable of type Map (also an interface...)
	private final String DICTIONARY_FILE = "dictionary.txt"; //A string instance variable
	
	public void load() throws Exception{ //If anything goes wrong, throw the exception to the calling method. Very lazy indeed!
		try {
			FileInputStream fstream = new FileInputStream(DICTIONARY_FILE); //Wrap the file name in an input stream
			DataInputStream in = new DataInputStream(fstream); //Allows us to read primitive data types (ints, chars, floats) from a stream
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //Buffers the data input stream
			
			String next;
			while ((next = br.readLine()) != null) { //Loop through each line in the dictionary file
				 Word word = new Word(next); //Create a new Word object using the next word in the dictionary
				 wordList.add(word); //Add the word to our array list
				 wordMap.put(new StrangeString(next), word); //Also add the word to the hash map
			}
			in.close(); //Good manners to close any in/out streams.
		} catch (Exception e) {
			throw new Exception("[ERROR] Encountered a problem reading the dictionary. " + e.getMessage());		
		}
	}
	
	public int size(){
		return wordList.size();
	}
	
	public Word[] getSortedWords(){
		return (Word[]) wordList.toArray(new Word[wordList.size()]);
	}
	
	public Map<StrangeString, Word> getWordMap(){
		return wordMap;
	}
}
