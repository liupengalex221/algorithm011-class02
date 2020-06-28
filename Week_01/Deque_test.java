
import java.util.Deque;
import java.util.LinkedList;


public class Deque_test {
    public static void main(String[] args) {
        Deque<String> q = new LinkedList<String>();
        q.addFirst("a");
        q.addFirst("b");
        q.addFirst("c");
        System.out.println(q);
        String  str=q.getFirst();
        System.out.println(str);
        System.out.println(q);
        while (q.size()>0) {
            System.out.println(q.removeFirst());
        }
        System.out.println(q);




    }
}
