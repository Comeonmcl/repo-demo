import java.util.Arrays;
import java.util.Scanner;

public class reverseeee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1 = Solution06.reverseWords(s);
        System.out.println(s1);
    }
}
class Solution06 {
    public static  String reverseWords(String s) {
        //去除多余空格
        char[] sc = s.toCharArray();
        int slow=0;
        int fast=0;
        while(fast<sc.length){
            if(sc[fast]!=' '){
                if(slow>0){
                    sc[slow++]=' ';
                }
                while(sc[fast]!=' '){
                    sc[slow++]=sc[fast++];
                }
            }
            fast++;
        }
        //整个反转字符
        StringBuilder sb=new StringBuilder(Arrays.toString(sc));
        s = sb.reverse().toString();
        System.out.println(s);
        for (int i = 0; i < sc.length; i++) {
            System.out.println(sc[i]);
        }
        //反转每一个单词
        int start=0;
        for (int i=0;i<slow;i++){
            if(sc[i]==' '){
                reverseeachword(start,i,sc);
                start=i;
            }

        }
        StringBuilder sbb=new StringBuilder();
        for (int i = 0; i < slow; i++) {
            sb.append(sc[i]);
        }
        String string = sbb.toString();
        return string;
    }

    private static void reverseeachword(int start, int i,char[]sc) {
        for(i=i-1;start<i;start++,i--){
            char temp=sc[start];
            sc[start]=sc[i];
            sc[i]=temp;
        }
    }
}
