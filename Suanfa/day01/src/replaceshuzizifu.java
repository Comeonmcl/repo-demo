import java.util.Scanner;

public class replaceshuzizifu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ca = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ca.length; i++) {
            if(ca[i]>='0'&&ca[i]<='9'){
                sb.append("number");
            }else{
                sb.append(ca[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
