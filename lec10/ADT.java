import java.util.Queue;
import java.util.ArrayDeque;

public class ADT {
    private Queue<Integer> q;
    private Student s;

    public ADT() {
       s = new Student();
       //q = new Queue<Integer>();
       q = new ArrayDeque<Integer>(); 
    }
}
