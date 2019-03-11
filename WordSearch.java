package gmit;

import java.util.*;
public class WordSearch {
	public static void main(String[] args) throws Exception{
		Dictionary dictionary = new Dictionary(); //Instantiate the dictionary
		dictionary.load(); //Load the dictionary into memory
		
		String searchTerm = "Aaronical"; //Specify the search word

		
		
		// 1) Using an indexed list is O(n)
		Word[] list = dictionary.getSortedWords(); //Get an indexed list of the words
		double start = System.currentTimeMillis(); //Start the clock
		
		for (int i = 0; i < list.length; i++) { //Loop over each word in the list until we find what we're looking for
			Word word = list[i];
			if (word.getWord().equalsIgnoreCase(searchTerm)){
				double searchTime = ((System.currentTimeMillis() - start)/1000); //Stop the clock and print out the result
				System.out.println("Found word " + searchTerm + " at index " + i +  " in " + searchTime);
				break;
			}
		}
		
		//2) Using a hash map os O(1)
		Map<StrangeString, Word> map = dictionary.getWordMap(); //Get a hash map of the words 
		start = System.currentTimeMillis(); //Reset the clock
		StrangeString ss = new StrangeString(searchTerm); //Wrap the search term in our custom object
		if (map.containsKey(ss)){ //Check if key exists in hash table. This is an O(1) operation
			Word word = map.get(ss); //Get the values associated with the key in the hash table. Also O(1)
			double searchTime = ((System.currentTimeMillis() - start)/1000); //Stop the clock
			System.out.println("Found word " + word.getWord() + " in " + searchTime); //Print result
		}else{
			System.out.println(searchTerm + " is not in the dictionary"); //Word is not in the hash table
		}
	}
}