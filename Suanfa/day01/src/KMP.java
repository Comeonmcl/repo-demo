import java.util.Scanner;

/*给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中
找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
如果 needle 不是 haystack 的一部分，则返回  -1 。*/
public class KMP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack= sc.next();
        String needle = sc.next();
        Solution02 solution=new Solution02();
        int i = solution.strStr(haystack, needle);
        System.out.println(i);
    }
}
class Solution02 {
    public int strStr(String haystack, String needle) {
          int j=0;
          int [] s=new int[needle.length()];
          s[0]=0;
          for(int i=1;i<needle.length();i++){
              while(needle.charAt(i)!=needle.charAt(j)&&j>0){
               j=s[j-1];
              }
              if(needle.charAt(i)==needle.charAt(j)){
                  j++;
              }
              s[i]=j;
          }

        char[] c = haystack.toCharArray();
          j=0;
        int i = 0;
        for (; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            while(haystack.charAt(i)!=needle.charAt(j)&&j>0){
                j=s[j-1];
            }
        }
        if(j==needle.length()-1)return i-needle.length()+1;
        return -1;
    }
}
