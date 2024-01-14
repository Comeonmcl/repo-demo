import java.util.ArrayDeque;
import java.util.Deque;

public class niBoLanbIAODaShi {

}
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer>stack=new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")||tokens[i].equals( "-")||tokens[i].equals("*")||tokens[i].equals("/")){
                 int number1=stack.pop();
                 int number2=stack.pop();
                 switch (tokens[i]){
                     case "+":stack.push(number1+number2);
                     case "-":stack.push(number1-number2);
                     case "*":stack.push(number1*number2);
                     case "/":stack.push(number1/number2);
                 }
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}