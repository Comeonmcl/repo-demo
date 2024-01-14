import java.util.ArrayDeque;
import java.util.Deque;

/*给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。

在 S 上反复执行重复项删除操作，直到无法继续删除。

在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。*/
public class deleteChongFuYuanSU {

}
class Solution08 {
    public String removeDuplicates(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty())stack.push(s.charAt(i));
            else if(!stack.isEmpty()&&stack.peek()!=s.charAt(i))stack.push(s.charAt(i));
            else if(!stack.isEmpty()&&stack.peek()==s.charAt(i))stack.pop();
        }
        String news="";
        while (!stack.isEmpty()){
            news=stack.pop()+news;
        }
        return news;
    }
}
class Solution10 {
    public String removeDuplicates(String s) {
      StringBuffer sb=new StringBuffer();
      int top=-1;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(top<0){
                sb.append(c);
                top++;
            }else if(top>=0&&sb.charAt(top)!=c){
                sb.append(c);
                top++;
            }else if(top>=0&&sb.charAt(top)==c){
                sb.deleteCharAt(top);
                top--;
            }
        }
        return sb.toString();
    }
}