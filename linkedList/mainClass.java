import java.util.Random;

class SLinkedList {

public Node head = null;
public Node tail = null;

class Node {
int data;
Node next;

Node(int data){
        this.data = data;
}
}

public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null) {
                head = newNode;
        }else{
                tail.next = newNode;
        }
        tail = newNode;
        System.out.println("New node inserted..");
}

public void display(){
        Node tmp;
        if(head == null) {
                System.out.println("List is empty.");
                return;
        }
        tmp = head;
        while(tmp!=null) {
                System.out.println("Element is : " + tmp.data);
                tmp = tmp.next;
        }
}


}

class mainClass {
public static void main(String[] args){
        int i=0;
        Random random = new Random();
        SLinkedList sl = new SLinkedList();
        while(i < 100) {
                sl.addNode(random.nextInt(150));
                i++;
        }
        sl.display();

}
}
