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

public void remove(int data){
        Node temp = head;
        Node prev = head;
        if(temp !=null && temp.data == data) {
                head = temp.next;
                return;
        }
        while(temp!= null && temp.data != data) {
                prev = temp;
                temp = temp.next;
        }
        if(temp == null) {
                System.out.println("List is empty");
                return;
        }
        if(temp == tail) {
                tail = prev;
                tail.next = null;
                return;
        }
        prev.next = temp.next;

}

public static void main(String[] args){
        SLinkedList sll = new SLinkedList();
        sll.show();
        sll.addElement(10);
        sll.addElement(7);
        sll.addElement(40);
        sll.show();
        sll.remove(10);
        sll.show();

}

}
