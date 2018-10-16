package Reverse;
// score 2/2
import java.util.Stack;

public class ReverseSentence {
    String reverse(String str) {
        if(str == null) {
            throw new IllegalArgumentException("string cannot be null");
        }
        char[] charArray = str.toCharArray();
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        for (char character : charArray) {
            if (character == ' ') {
                fillStack(stack, word.toString());
                word = new StringBuilder();
            } else {
                word.append(character);
            }
        }
        fillStack(stack, word.toString());
        return emptyStack(stack);
    }

    private void fillStack(Stack<String> stack, String word) {
        if (word.length() > 0) {
            stack.push(word);
        }
    }

    private String emptyStack(Stack<String> stack) {
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (stack.size() > 0) {
                reversed.append(' ');
            }
        }
        return reversed.toString();
    }
}
