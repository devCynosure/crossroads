public class SLinkedList{

public Node head = null;
public Node tail = null;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }
}

public addNode(int data){
  Node newNode = new Node(data);
    if(head == null){
      head = newNode;
    }else{
      tail.next = newNode;
    }
    tail = newNode;
    System.out.println("New node inserted ..");
}

public display(){
  Node temp;
  if(head == null){
    System.out.println("List is empty.");
    return;
  }
  temp = head;
  while(temp!=null){
    System.out.println("Element is : " + temp.data){
      
    }
  }
}
}

public class mainClass{
  public static void main(String[] args){
    int i=0;
    SlinkedList sl = new SlinkedList();
    while(i < 100){
    sl.addNode(i);
    i++;
  }
  }
}
