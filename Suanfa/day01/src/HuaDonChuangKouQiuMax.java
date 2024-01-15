import java.util.Deque;
import java.util.LinkedList;

public class HuaDonChuangKouQiuMax {
    public static void main(String[] args) {
        int[]nums={1,3,-1,-3,5,3,6,7};
        Solution11 solution10=new Solution11();
        int[] ints = solution10.maxSlidingWindow(nums, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
class Solution11 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==1)return nums;
        if(nums.length==2)return new int[]{Math.max(nums[0], nums[1])};
       int[]result=new int[nums.length-k+1];
       myque myque=new myque();
       int j=0;
       //先把前三个放进去
        for (int i = 0; i < k; i++) {
            myque.add(nums[i]);
        }
        result[j++]=myque.peek();
        for(int i=k;i<nums.length;i++){
            myque.poll(nums[i-k]);
            myque.add(nums[i]);
            result[j++]=myque.peek();
        }
        return result;
    }
}
class myque{
    Deque<Integer>deque=new LinkedList<>();
    public void poll(int val){
        if(!deque.isEmpty()&&deque.peek()==val){
            deque.poll();
        }
    }
    public void add(int val){
        while(!deque.isEmpty()&&val>deque.getLast()){
            deque.removeLast();
        }
        deque.add(val);
    }
    public int peek(){
        return deque.peek();
    }
}