
import java.util.Stack;

public class StackExercises {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed element: " + stack.pop());
        System.out.println("Remaining stack: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("\n--- String Reversal ---");

        String name = "Hello World";

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < name.length(); i++) {
            charStack.push(name.charAt(i));
        }

        String reversed = "";

        while (!charStack.isEmpty()) {
            reversed = reversed + charStack.pop();
        }

        System.out.println("Name: " + name);
        System.out.println("Reversed: " + reversed);


        System.out.println("\n--- Balanced Brackets ---");

        String balanced = "({[()]})";
        String unbalanced = "({[})";

        System.out.println(balanced + " : " + isBalanced(balanced));
        System.out.println(unbalanced + " : " + isBalanced(unbalanced));

    }

    public static boolean isBalanced(String str) {

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

                brackets.push(ch);

            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (brackets.isEmpty()) {
                    return false;
                }

                char top = brackets.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}
