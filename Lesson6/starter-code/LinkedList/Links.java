public class Links extends Node {
    private Node head;
    private int size;
	public Links() {
		head = null;
		size = 0;
    } //constructor
    public void insertNode(int index, int data){
        if (index < 0)
            System.out.println("node cannot be inserted");
        else{
            int currentIndex = 1;
            Node current = head;
            while(current != null && index > currentIndex){
                current = current.getNext(); //hopping to the next place
                currentIndex++;
            }
            Node temp = new Node(data);
            if (index == 0){
                /* insert at the front.*/
                temp.setNext(head);
                head = temp;
            }
            else{
                /* insert in the middle or at the end? */
                temp.setNext(current.getNext());
                current.setNext(temp);
            }
            size++;

        }

    }
    public void displayNodes() {
        if(size < 1) {
            //index not valid
            System.out.println("list is empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.getData() + "->");
                current = current.getNext();
            }
            System.out.print("\n");
        }


    }
    public void removeNode(int data){
      Node current = head;
      if (current.getData() == data) {
        head = current.getNext();
      }
      else {
        while (current != null && current.getNext().getData != data) {
          current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
      }
      size--;
    }
    public boolean findNode(int data){
  		Node current = head;
      while(current != null){
        //System.out.println(current.getData());
        if (current.getData() == data)
          return true;
        else
          current = current.getNext();
      }
      return false;
  	}
    
}
