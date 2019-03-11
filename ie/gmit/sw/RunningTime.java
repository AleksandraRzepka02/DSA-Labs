package ie.gmit.sw;

public class RunningTime {
	public static void main(String[] args) throws Exception{
		System.out.println("---------- CP2SD Lab 1: Space and Time Complexity ----------");
		Dictionary dictionary = new Dictionary();
		dictionary.load();
		System.out.println("Dictionary conains " + dictionary.size() +  " words.");
		
		String[] words = dictionary.getSortedWords();
		long startTime = System.nanoTime();
		
		isArrayOver100(words);
		//contains(words, "zebra");
		//binarySearch(words, "zebra");
		//containsDuplicates(words);
		System.out.println("Running time (ns): " + (System.nanoTime() - startTime));
		
	}
	
	//Running time: O(1)
	public static boolean isArrayOver100(String[] args) {
	    if (args.length > 100){
	    	return true;
	    }else{
	    	return false;
	    }
	}
	
	//Running time: O(N);
	public static boolean contains(String[] args, String value) {
	    for (int i = 0; i < args.length; i++) {
	        if (args[i] == value) return true;
	    }
	    return false;
	}
	
	//Running time: O(log N)
	/*
		A sorted array can be quickly searched using a binary search. The basic idea is to 
		speed up an array search by applying a divide and conquer strategy. The search 
		criterion is compared to the middle item of an array. If the search criterion is less than 
		the middle element, a binary search is recursively applied on the first half. Otherwise, 
		the second half of the array is recursively searched. The following method 
		implements a binary search of a String[] for a given search string key: 
	*/
	public static int binarySearch(String[] sorted, String key) { 
	    int first = 0; 
	    int upto  = sorted.length; 
	     
	    while (first < upto) { 
	        int mid = (first + upto) / 2;  // Compute mid point. 
	        if (key.compareTo(sorted[mid]) < 0) { 
	            upto = mid;       // repeat search in bottom half. 
	        } else if (key.compareTo(sorted[mid]) > 0) { 
	            first = mid + 1;  // Repeat search in top half. 
	        } else { 
	            return mid;       // Found it. Return position 
	        } 
	    } 
	    return -(first + 1);      // Failed to find key 
	}
	
	//Running time: O(n^2)
	public static boolean containsDuplicates(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (i == j)
                    break;
                if (args[i] == args[j])
                    return true;
            }
        }
        return false;
    }
}
