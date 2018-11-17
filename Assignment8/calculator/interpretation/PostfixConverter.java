package calculator.interpretation;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PostfixConverter {

    public String convert(String expression) {
        String[] operators = expression.split(" ");
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();
        map.put("%", 1);
        map.put("*", 2);
        map.put("+", 3);
        map.put("-", 3);

        for(String operator : operators) {
            if(map.containsKey(operator)){
                if(!stack.isEmpty() && map.get(stack.peek()) >= map.get(operator)) {
                    sb.append(stack.pop()).append(" ");
                    stack.push(operator);
                } else {
                    stack.push(operator);
                }
            } else {
                sb.append(operator).append(" ");
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }
}
