package gmit;

public class Word {
	private String word;

	public Word(String word) {
		this.word = word;
	}
	
	/* To illustrate the speed of a hash map, each time the method getWord() is 
	 * called, we will put the main thread of execution to sleep for 100 ms, ie
	 * 1/10 of a second. While this might should reasonable, there are 234,936
	 * words in our dictionary. Searching for "Zyzzogeton" in a list will take O(n) time:
	 * 			234936 x 100 = 23493600ms = 23493.6s  = > 6.5 hours!
	 * 
	 * Searching for the same word in a hash map will take O(1) time, i.e. < 1 second.
	 */
	public String getWord() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
