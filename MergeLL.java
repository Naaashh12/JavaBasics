public class MergeLL {
    public static class Node {
        int data;
        Node next;
        public   Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    private static Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node head1, Node head2) {
        Node merged = new Node(-1);
        Node temp = merged;
        while(head1!=null && head2!=null) {
            if(head1.data <= head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            } else {
                temp.next = head2;
                head2=head2.next;
                temp=temp.next;
            }

            if(head1!=null) {
                temp.next=head1;
                //head1=head1.next;
                //temp=temp.next;
            }

            if(head2!=null) {
                temp.next = head2;
                //head2=head2.next;
                //temp=temp.next;
            }

        }

        return merged.next;

    }
    

    public static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Finding mid
        Node mid = getmid(head); 
    
        Node righthead = mid.next;
        mid.next = null;
    
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
    
        return merge(newleft, newright);
    }
    
    public static void print(Node head) { // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

        public static void main(String[] args) {
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next  = new Node(1);
        print(head);
        head = mergesort(head);
        print(head);
    }
}
