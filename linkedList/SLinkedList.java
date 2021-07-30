public class SLinkedList {
public Node head = null;
public Node tail = null;
class Node {
int data;
Node next;

Node(int data){
        this.data = data;
}
}

public void addElement(int data){
        Node newNode = new Node(data);
        if(head == null) {
                head = newNode;
        }else{
                tail.next = newNode;
        }
        tail = newNode;
}

public void show(){

        if(head == null) {
                System.out.println("List is Empty");
                return;
        }
        Node temp = head;
        while(temp!= null) {
                System.out.println("Data : " + temp.data);
                temp = temp.next;
        }
}

public static void main(String[] args){
        SLinkedList sll = new SLinkedList();
        sll.show();
        sll.addElement(10);
        sll.addElement(7);
        sll.addElement(40);
        sll.show();

}

}
