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

public void deleteNode(int data){
  System.out.println("Item to be deleted is : "+data);
    System.out.println("Head is : "+head.data +" Tail is : "+tail.data);
        if(head == null) {
                System.out.println("List is Empty..");
                return;
        }
        Node temp = head;
        Node prev = null;
        System.out.println("node not empty in deleteNode. " + temp.data);
        if(temp.data == data) {
          System.out.println("in head.");
                head = head.next;
                return;
        }
        prev = temp;
        temp = head.next;
        while(temp != null && temp.data != data) {
                prev = temp;
                temp = temp.next;
        }
        if(temp == null) {
                System.out.println("Item is not present in list");
                return;
        }
        else
        if(tail.data == data) {
          System.out.println("in tail. prev, tail " + prev + " "+ prev.data+" " + tail + " " + tail.data);
          System.out.println("in tail, tail.data  last " + data +" " + tail.data);
                tail = prev;
                tail.next = null;
                System.out.println("Tail exit. prev, tail " + prev + " "+ prev.data+" " + tail + " " + tail.data);
        }
        else{
          System.out.println("in Middle " + prev.next +" " + temp.next);
            prev.next = temp.next;
            System.out.println("Middle End. head, tail " + head +" " + tail);

        }
}
}

class mainClass {
public static void main(String[] args){
        int i=0;
        Random random = new Random();
        SLinkedList sl = new SLinkedList();
        while(i < 4) {
                sl.addNode(random.nextInt(4));
                sl.display();
                sl.deleteNode(random.nextInt(4));
                i++;
        }
}
}
