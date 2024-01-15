import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueshixianStack {
    public static void main(String[] args) {
        MyStack01 myStack01=new MyStack01();
        myStack01.push(1);
        myStack01.push(2);
        myStack01.push(3);
        System.out.println(myStack01.pop());
        System.out.println(myStack01.pop());
        System.out.println(myStack01.pop());
        System.out.println(myStack01.empty());
    }

}
class MyStack01 {//用两个队列实现栈
    Queue <Integer>queue1;
    Queue<Integer>queue2;
    public MyStack01() {
    queue1=new ArrayDeque<>();
    queue2=new ArrayDeque<>();
    }

    public void push(int x) {
     queue2.offer(x);
     while(!queue1.isEmpty()){
         queue2.offer(queue1.poll());
     }
     queue1=queue2;
     queue2=new ArrayDeque<>();
     }

    public int pop() {
     return queue1.poll();
    }

    public int top() {
      return queue1.peek();
    }

    public boolean empty() {
    return queue1.isEmpty();
    }
}
class MyStack02 {//用一个队列实现栈
    Queue<Integer>queue;
    public MyStack02() {
    queue=new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size=queue.size();
        while(size>1){
         queue.add(queue.poll());
         size--;
     }
    }

    public int pop() {
   return  queue.poll();
    }

    public int top() {
   return queue.peek();
    }

    public boolean empty() {
  return queue.isEmpty();
    }
}
