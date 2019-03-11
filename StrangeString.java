package gmit;

/* Normally, one would never create a hash map using instances of something like
 * StrangeString as a hash key! This class is being used only to demonstrate how the
 * hashCode() and equals() methods are used when searching a hash map. A poor choice 
 * of hash code will increase the number of collisions in a hash map. Using a constant as a 
 * hash code would be a disastrous choice, as it effectively flattens the hash map into a
 * linear list and increases the running time from a Uthopian O(1) to O(n). We will, of course :),
 * be testing this in the lab...
 */
public class StrangeString{
	private String word; //An instance variable
	
	public StrangeString(String s){ //Our constructor
		this.word = s;
	}
	
	public String getWord() { //An accessor method
		return word;
	}

	//The hashCode method is used to determine which hash map bucket an object is in
	public int hashCode() {
		return word.hashCode();
	}
	
	//The default implementation of equals() tests for the same Object ID. We are over-riding
	//this behaviour and testing that both objects share the exact same sequence of characters
	public boolean equals(Object obj) {
		if (obj instanceof StrangeString){
			StrangeString ss = (StrangeString) obj;
			return word.equals(ss.getWord());
		}else{
			return false;
		}
	}
}
