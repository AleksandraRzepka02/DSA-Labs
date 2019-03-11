package gmit;

public class PalindromeFinder {
	private String inputString;
	private Stack<Character> charStack = new Stack<Character>();
	
    public PalindromeFinder(String str) {
        inputString = str;
        fillStack();
    }

    private void fillStack() {
        for (int i = 0; i < inputString.length(); i++) charStack.push(inputString.charAt(i));
        
    }

    private String buildReverse() {
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            // Remove top item from stack and append it to result.
            result.append(charStack.pop());
        }
        
        System.out.println("Reverse: " + result);
        return result.toString();
    }

    public boolean isPalindrome() {
        return inputString.equalsIgnoreCase(buildReverse());
    }

}
