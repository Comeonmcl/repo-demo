import java.nio.channels.SocketChannel;
import java.util.Scanner;

/*给定一个字符串 s，它包含小写字母和数字字符，请编写一个函数，将字符串中的字母字符保持不变，
而将每个数字字符替换为number。 例如，对于输入字符串 "a1b2c3"，函数应该将其转换为 "anumberbnumbercnumber"。*/
public class Stringreplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                sb.append("number");
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
