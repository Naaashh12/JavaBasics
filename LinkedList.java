public class LinkedList {

    public static class Node {
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

        public  void addFirst(int data) {
            Node newnode = new Node(data);//Step 1: Created a newnode
            size++;
            if(head==null) {
                head=newnode;
                tail=newnode; //if there are no nodes the the newwest one becomes
                return;           //head and tail
            }
            newnode.next=head;//step 2 : newnode's next points to the existing head

            head=newnode;//step 3 : newnode becomes the head
        }

        public void addLast(int data) {
            Node newnode = new Node(data);//step 1 : Creating a new node
            size++;
            if(head==null) {
                head=newnode;
                tail=newnode; //if there are no nodes the the newwest one becomes
                return;           //head and tail
            }
            tail.next = newnode; //step 2: pointing the next if the tail to the newnode
            tail=newnode;      //newnode becomes the new tail
        }

        public void print() { //O(n)
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.data+ "->");
                temp=temp.next;
            }
            System.out.println();
        }

        public void add(int idx, int data) {
            if(idx==0) {
                addFirst(data);
                return;
            }
            Node newnode= new Node(data);
            size++;
            Node temp = head;
            int i =0;
            while(i<idx-1) {
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }

        public int removeFirst() {
            if(size==0) {
                System.out.println("LL is empty");
                return -1;
            }
            if(size==1) {
                int val = head.data;
                head=null;
                tail=null;
                return val;
            }

            int val = head.data;
            head=head.next;
            size--;
            return val;
        }
        public int removeLast() {
            if(size==0) {
                System.out.println("LL is empty");
                return -1;
            }
            if(size==1) {
                int val = head.data;
                head=null;
                tail=null;
                return val;
            }
            Node prev= head;
            for(int i =0; i<size-2;i++) {
                prev= prev.next;
            }
            int val = tail.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }

        public int itrsearch(int key) {
            Node temp = head;
            int i =0;
            while(temp!=null) {
                if(key==temp.data) {
                return i;
                }
            i++;
            temp = temp.next;
            }
            return -1;
        }
        public int helper(Node head, int key) {
            if(head==null) {
                return -1;
            }
            if(head.data==key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }

        public int recsearch(int key) {
            return helper( head, key);
        }
        
        public void reverse() {
            Node prev= null;
            Node curr=tail= head;
            Node next;
            while(curr!=null) {
                next= curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        
        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        public boolean findPalindrome() {
            if(head==null || head.next==null) {
                return true;
            }
            //step 1: Find middle
            Node mid=findMid(head);
            //step 2 : Reverse the 2nd half
            Node curr=mid;
            Node prev=null;
            Node next;
            while(curr!=null) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right = prev;
            Node left = head;
            //step 3 : Compare 1st and 2nd half
            while(right!=null) {
                if(left.data!=right.data) {
                    return false;
                }
                left= left.next;
                right=right.next;
            }
            return true;

        }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(2);
        //ll.addLast(1);
        ll.print();
        System.out.println(ll.findPalindrome());
        //ll.print();
        //ll.addFirst(3);
        //ll.print();
        //ll.addFirst(1);
        //ll.print();
        //ll.addFirst(2);
        //ll.print();
        //ll.addLast(3);
        //ll.print();
        //ll.addLast(2);
        //ll.print();
        //ll.addLast(1);
       // ll.print();
        //ll.add(2, 3);
        //ll.print();
        //System.out.println(ll.size);
        //ll.removeFirst();
        //ll.print();
        //System.out.println(ll.size);
        //ll.removeLast();
        //ll.print();
        //System.out.println(ll.size);
        //System.out.println(ll.itrsearch(4));
        //System.out.println(ll.itrsearch(10));
        //System.out.println(ll.recsearch(3));
        //ll.reverse();
        //ll.print();

    }
    
}
