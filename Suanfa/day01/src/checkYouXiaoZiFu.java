import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class checkYouXiaoZiFu {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    Solution07 solution07=new Solution07();

}
class Solution07 {
    public boolean isValid(String s) {
        Deque<Character>Stack=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') Stack.push(')');
            else if(s.charAt(i)=='[') Stack.push(']');
            else if(s.charAt(i)=='{') Stack.push('}');
            else if(!Stack.isEmpty()&&s.charAt(i)!=Stack.peek())return false;
            else if(Stack.isEmpty())return false;
            else Stack.pop();
        }
        return Stack.isEmpty();
    }
}
