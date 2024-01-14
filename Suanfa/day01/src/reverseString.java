import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        Solution12 solution=new Solution12();
        String s1 = solution.reverseWords(s);
        System.out.println(s1);
    }
}
class Solution12 {
    public  String reverseWords(String s) {
        //去除多余的空格
        String remove = remove(s);
        //反转
        StringBuilder sb=new StringBuilder(remove);
        sb.reverse();
        //每个单词进行反转
        remove=reverseeachword(sb.toString());
        return remove;
    }

    private String reverseeachword(String s) {
        char[] c = s.toCharArray();
        int fast=0;
        int slow=0;
        while(fast<s.length()){
            while(fast<s.length()&&c[fast]!=' ')fast++;
            reverseword(c,slow,fast);
            fast++;
            slow=fast;
        }
        return new String(c);
    }

    private void reverseword(char[] c, int i, int j) {
        for(j=j-1;i<j;i++,j--){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }
    }

    public static  String remove(String s){
        char [] arr=s.toCharArray();
        int slow = 0;
        int fast = 0;
        for(;fast<arr.length;fast++){
            if(arr[fast]!=' '){
                if(slow!=0){
                    arr[slow++]=' ';
                }
                while(fast<arr.length&&arr[fast]!=' '){
                    arr[slow++]=arr[fast++];
                }
            }
        }
        char [] newarr=new char[slow];
        for (int i = 0; i < slow; i++) {
            newarr[i]=arr[i];
        }
       // System.out.println(new String(arr));
        return  new String(newarr);
    }
}