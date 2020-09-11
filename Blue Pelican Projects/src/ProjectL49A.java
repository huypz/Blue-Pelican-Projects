import java.util.*;

public class ProjectL49A {
    public static void main(String[] args) {
        StackLL stck = new StackLL();
        System.out.println(stck.size()); //0
        stck.push(157.3);
        stck.push(22);
        stck.push(-18);
        double j = stck.pop();
        System.out.println(j); // -18.0
        System.out.println(stck.peek()); //22.0
        System.out.println(stck.pop()); //22.0
        System.out.println(stck.size()); //1
        stck.clear();
        System.out.println(stck.size()); //0
    }
}

interface StackIntrfc {
    void push(double d); //place d on top of the stack
    double pop(); //return top item in the stack and then remove from stack
    double peek(); //return the top item in the stack and leave the stack intact
    int size(); //returns the size (depth) of the stack
    void clear(); //remove all items from the stack
}

class StackLL implements StackIntrfc {
    private LinkedList list;

    public StackLL() {
        list = new LinkedList();
    }

    public void push(double d) {
        list.add(d);
    }

    public double pop() {
        return (Double) list.removeLast();
    }

    public double peek() {
        return (Double) list.getLast();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}