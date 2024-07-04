package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    //constr, bcoz size++ kiya hi neeche
    public LL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val); //first create a new node i.e. a new box first
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){ // if tail is empty, then insert a node first.. i.e. call insertFirst() method
            insertFirst(val);
            return; // don't call code sample below it if tail == nul
        }
        Node node = new Node(val); // first of all create a box.. i.e. a node
        tail.next = node; // this is not connected to anything, so connect it to tail
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){ // otherwise, start checking from head
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    // get the node which is second last
    public Node get(int index){
        Node node = head; // as wel will start from head
        for(int i = 0; i < index; i++){ // we will move ahead index times
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size -1){
            deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}