package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(-1);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
    }
}
