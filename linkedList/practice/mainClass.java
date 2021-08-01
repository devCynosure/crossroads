class csdojoLinkedList{

  class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }

  public Node head = null;
  public Node tail = null;

  public void addNode(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
    }else{
      tail.next = newNode;
    }
    tail = newNode;
  }

  public void display(){
    if(head == null){
      System.out.println("List is empty.");
      return;
    }
    Node temp = head;
    while(temp!= null){
      System.out.println("Element : "+temp.data);
      temp = temp.next;
    }

  }

  public void countNodes(){
    int count = 0;
    if(head == null){
      System.out.println("Cout : "+ count);
      return;
    }
    Node temp = head;
    while(temp!= null){
      count++;
      temp = temp.next;
    }
    System.out.println("Number(s) of nodes is "+count);
  }
}
class mainClass{
  public static void main(String[] args){
    csdojoLinkedList sllist = new csdojoLinkedList();
    sllist.addNode(4);
    sllist.addNode(2);
    sllist.addNode(3);
    sllist.addNode(10);
    sllist.addNode(2);
    sllist.display();
    sllist.countNodes();
  }
}
