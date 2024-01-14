import java.util.Scanner;

public class kmpsuanfa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String needle=sc.next();
     //   String s=sc.next();
        Solution03 solution03=new Solution03();
        int[] next = solution03.getNext(needle);
        for (int i = 0; i < next.length; i++) {
            System.out.println(next[i]);
        }
       // System.out.println(solution03.strStr(s, needle));
    }
}
class Solution03 {
    public int strStr(String haystack, String needle) {
        int[] next = getNext(needle);
        char[]has=haystack.toCharArray();
        char[]nle=needle.toCharArray();
        int j=0,i=0;
        for (; i < has.length; i++) {
           while(j>0&&has[i]!=nle[j]){
               j=next[j-1];
           }
            if(has[i]==nle[j])j++;
           if(j==nle.length){
               return i-nle.length+1;
           }
        }
        return -1;
    }
    public int [] getNext(String needle){
        char[] nle=needle.toCharArray();
       int [] next=new int[needle.length()];
       int j=0;
       next[0]=0;
       for(int i=1;i<needle.length();i++){
           while(j>0&&nle[j]!=nle[i]){
               j=next[j-1];
               }
           if(nle[j]==nle[i]){
               j++;
           }
           next[i]=j;
       }
      return next;
    }
}
