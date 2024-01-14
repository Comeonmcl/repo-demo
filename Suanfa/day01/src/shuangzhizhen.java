import java.util.Scanner;

public class shuangzhizhen {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int []c={3,2,2,3};
        int val=3;
        System.out.println(Solution05.removeElement(c, val));
    }
}
class Solution05 {
    public static  int removeElement(int[] nums, int val) {
         int slow=0;
         int fast=0;
         while(fast<nums.length){
             if(nums[fast]!=val){
                 nums[slow++]=nums[fast];
             }
             fast++;
         }
         return slow;
    }
}