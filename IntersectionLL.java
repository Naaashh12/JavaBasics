
public class IntersectionLL {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    
    public static Node findlast(Node head) {
        
        Node temp= head;
        while(head.next != null) {
            temp= head.next;
            head=head.next;
        }
        return temp;
    }
    public static Boolean isIntersection(Node head1, Node head2){

        Node temp1=findlast(head1);
        Node temp2=findlast(head2);
       
        while(head1.next != null) {
            //temp1= head1.next;
            if(temp2.next.data ==head1.data) {
               // exists=true;
               return true;
            }
        }

        while(head2.next != null) {
            //temp2=head2.next;
            if(temp1.next.data==head2.data) {
                //exists=true;
                return true;
            }
        }

        return false;
        
        
    }

    public static void main (String[] args) {
        Node head1,head2;
       head1= new Node(1);
       head1.next= new Node(2);
       head1.next.next= new Node(3);
       head1.next.next.next= new Node(6);

       head2 = new Node(4);
       head2.next= new Node(5);
       head2.next.next= new Node(6);
       head2.next.next.next= new Node(7);

       System.out.println(isIntersection(head1, head2));
    
    
    }
    
}
