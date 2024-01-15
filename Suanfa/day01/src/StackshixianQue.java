import java.util.ArrayDeque;
import java.util.Deque;

public class StackshixianQue {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

    }
}
class MyQueue {
    Deque<Integer>Stackin;
    Deque<Integer>Stackout;
    public MyQueue() {
    Stackin=new ArrayDeque<>();
    Stackout=new ArrayDeque<>();
    }

    public void push(int x) {
    Stackin.push(x);
    }

    public int pop() {
    if(Stackout.isEmpty()){
        inout();
    }
    return Stackout.pop();
    }

    public int peek() {
    if(Stackout.isEmpty()){
        inout();
    }
    return Stackout.peek();
    }

    public boolean empty() {
        return Stackin.isEmpty()&&Stackout.isEmpty();
    }
    public void inout () {
        while (!Stackin.isEmpty()){
            Stackout.push(Stackin.pop());
        }
    }
}