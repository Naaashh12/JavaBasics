public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static int size;
    public static Node head;
    public static Node tail;

    //add-first

    public void addFirst(int data) {
        //create-node
        Node newNode = new Node(data);
        size++;
        //adding
        if(head==null) {
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    
    //add-last 

    public void addLast(int data) {
        Node newNode= new Node(data);
        size++;
        if(head==null) {
            head=tail=newNode;
            return;
        }

        newNode.prev=tail;
        tail.next=newNode;
        tail=tail.next;
    }

    //remove-first

    public int removeFirst() {
        if(head==null) {
            System.out.println("Linked list is empty");
            return -1;
        }

        if(head.next==null) {
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head=head.next;
        head.prev=null;
        size--;
        return  val;
    }

    //remove-last

    public int removeLast() {
        if(head==null) {
            System.out.println("The Linked list in empty"  );
            return -1;  
        }
        if(head.next==null) {
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;

    }

    public void reverse() {
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void print() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
         System.out.println("null");
    }


    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        //System.out.println(dll.size);
        //dll.removeFirst();
        //dll.removeLast();
        dll.reverse();
        dll.print();
        //System.out.println(dll.size);
    }
}
