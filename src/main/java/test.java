import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class test {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        deque.add(1);
        deque.add(2);
        deque.poll();
        System.out.println(Arrays.toString(deque.toArray()));
    }
}
