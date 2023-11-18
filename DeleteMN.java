public class DeleteMN {

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

        /*public  void deletemn(int m , int n,Node head) {
            int countm =0; 
            int countn =0;
            Node temp= new Node(-1);
            while(head!=null) {
                while (countm != m) {
                    temp.next=head;
                    countm++;
                    head=head.next;
                    temp=temp.next;
                }

                while(countn!=n) {
                    removeFirst();
                    countn++;
                }
                countm=0;
            }
             //O(n)
            Node finalll = temp.next;
            while(finalll!=null) {
                System.out.print(finalll.data+ "->");
                finalll=finalll.next;
            }
            System.out.println();
        
            
        }*/

        public void deletemn(int m, int n) {
            int countm = 0;
            int countn = 0;
            Node currentNode = head;
            Node prevNode = null;
        
            while (currentNode != null) {
                while (countm < m && currentNode != null) {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                    countm++;
                }
        
                countm = 0;
        
                while (countn < n && currentNode != null) {
                    currentNode = currentNode.next;
                    countn++;
                }
        
                countn = 0;
        
                // Remove the nodes between prevNode and currentNode
                if (prevNode != null) {
                    prevNode.next = currentNode;
                } else {
                    // If prevNode is null, we are removing nodes from the beginning of the list
                    head = currentNode;
                }
            }
        
            // Print the modified linked list
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
        DeleteMN ll = new DeleteMN();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        int m =2;
        int n=2;
        ll.deletemn(m,n);
        }

    }