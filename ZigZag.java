public class ZigZag {
    public static class Node {
        int data;
        Node next;
        public  Node(int data) {
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;

    public static Node findMid(Node head) {
        Node slow= head;
        Node fast = head;

        while(fast!=null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow;
    }

    public static void print(Node head) { // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void ZigZag() {
     
        Node mid = findMid(head);

       // Node LeftHead = head;

        Node prev= null;
        Node curr = mid.next;
        mid.next=null;
        Node next;

        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev= curr;
            curr=next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left!=null && right!=null) {
            //Zig-zig
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            //update
            left=nextL;
            right=nextR; 
        }
    }



public static void main(String[] args) {
        head= new Node(1);
        //head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next  = new Node(5);
        //head.next.next.next.next.next  = new Node(6);
        print(head);
        ZigZag();
        print(head);
}

}