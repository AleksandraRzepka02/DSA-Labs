package gmit;

public class ParenthesesChecker {
	private static final String OPEN = "([{"; //Set of opening parenthesis characters.
	private static final String CLOSE = ")]}"; //Set of closing parenthesis characters, matches OPEN.
	
    public boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<Character>();
        boolean balanced = true;
        try {
            int index = 0;
            while (balanced && index < expression.length()) {
                char nextCh = expression.charAt(index);
                if (isOpen(nextCh)) {
                    s.push(nextCh);
                } else if (isClose(nextCh)) {
                    char topCh = s.pop();
                    balanced =
                        OPEN.indexOf(topCh) == CLOSE.indexOf(nextCh);
                }
                index++;
            }
        } catch (Exception ex) {
            balanced = false;
        }
        return (balanced && s.isEmpty());
    }

    private  boolean isOpen(char ch) {
        return OPEN.indexOf(ch) > -1;
    }

    private  boolean isClose(char ch) {
        return CLOSE.indexOf(ch) > -1;
    }

	
}
