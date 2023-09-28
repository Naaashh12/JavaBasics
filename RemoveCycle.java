public class RemoveCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void Removecycle() {
        //step 1: Detect cycle
        Node slow = head;
        Node fast = head;
        boolean exists = false;
        while(fast!= null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                exists = true;
                break;
            }
        }
        if(exists == false) {
            return ;
        }
        
        //step 2:find last
        slow= head;
        Node prev= null;
        while(slow!=fast) {
            slow= slow.next;
            prev= fast;
            fast = fast.next;    
        }
        //step 3: set last as null
        prev.next=null;
    }
    public void print() { // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    head = new Node(1);
    Node temp  = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    System.out.println(isCycle());
    Removecycle();
    System.out.println(isCycle());
    }
    
}
