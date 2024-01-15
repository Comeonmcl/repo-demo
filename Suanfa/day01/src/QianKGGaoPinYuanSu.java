import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class QianKGGaoPinYuanSu {
    public static void main(String[] args) {
        int[]nums={1,1,1,2,2,3};
        int k=2;
        Solution13 solution13=new Solution13();
        int[] arr = solution13.topKFrequent(nums, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
class Solution13 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((p1,p2)->p1[1]-p2[1]);
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(pq.size()<k){
                pq.offer(new int[]{entry.getKey(),entry.getValue()});
            }else{
                if(entry.getValue()>pq.peek()[1]){
                    pq.poll();
                    pq.offer(new int[]{entry.getKey(),entry.getValue()});

                }
                }
        }
        int[]result=new int[pq.size()];
        for(int i=pq.size()-1;i>=0;i--){
            result[i]=pq.poll()[0];
        }
        return result;
    }
}
