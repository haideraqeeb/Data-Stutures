/* This class contains funtions for Linked List
It has the following functions:-
1)Add elements in the front of the list
2)Add elements in the back of the list
3)Display the list
*/
class LinkedList{
    Node head;
    public LinkedList(){
        head = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void PushFront(int val){
        Node newnode = new Node(null,val);
        if (head == null)  //case for empty linked list
            head = newnode;
        else{
            newnode.setLink(head);  //old head is the link of the new head
            head = newnode;  //makes the new node as head
        }
    }
    public void PushBack(int val){
        Node newnode = new Node(null,val);
        if (head == null)
            head = newnode;
        else{
            Node last = head;
            while(last.next() != null){
                last = last.next();
            }
            last.data = val;
            newnode = last.next();
        }
    }
    public void display(){
        if (head == null)
            System.out.println("The linked list is empty");
        else{
            Node pointer = head;
            System.out.print(head.getData() + "--->");
            pointer = head.next();
            while(pointer.next() != null){
                System.out.print(pointer.getData() + "--->");
                pointer = pointer.next();
            }
            System.out.print(pointer.getData());
            System.out.println();
        }
    }
}