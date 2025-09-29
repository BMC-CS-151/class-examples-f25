import java.util.Stack;

public class PostfixCalculatorImpl {

    //Create a postfix calculator for multiplication 
    public static void main(String[] args) {

        //TODO 1: create a stack of Integers
        Stack<Integer> stack = new Stack<Integer>();

        //String postfix = "3 7 *";
        //String postfix = "3 4 * 5 *";
        String postfix = "3 4 5 * *";

        //1. if its a digit, add it to the stack 
        //2. if its an operator, evaluate! and push the result to the stack
        //3. if its a space, continue.

        for (int i=0; i<postfix.length(); i++) {
            System.out.println(i);

            char cur = postfix.charAt(i);

            // if cur >= 49 && cur <= 57
            if (Character.isDigit(cur)) {
                Integer digit = Integer.parseInt(String.valueOf(curChar));
                stack.push(digit);
            } else if (curChar == "*") {
                Integer op2 = stack.pop();
                Integer op1 = stack.pop();

                stack.push(op1 * op2);
            } else {
                continue;
            }
        } 

        System.out.println(stack);

    }

}
