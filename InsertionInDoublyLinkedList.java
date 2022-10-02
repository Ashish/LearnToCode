// function to add node at any position in doubly linked list

void push_at(int newElement, int position) {     
  
  //1. allocate node to new element
  Node newNode = new Node(); 
  newNode.data = newElement;
  newNode.next = null;
  newNode.prev = null;

  //2. check if the position is > 0
  if(position < 1) {
    System.out.print("\nposition should be >= 1.");
  } else if (position == 1) {
    
    //3. if the position is 1, make new node as head
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  } else {
    
    //4. Else, make a temp node and traverse to the 
    //   node previous to the position
    Node temp = new Node();
    temp = head;
    for(int i = 1; i < position-1; i++) {
      if(temp != null) {
        temp = temp.next;
      }
    }
 
    //5. If the previous node is not null, adjust 
    //   the links
    if(temp != null) {
      newNode.next = temp.next;
      newNode.prev = temp;
      temp.next = newNode;  
      if(newNode.next != null)
        newNode.next.prev = newNode;
    } else {
      
      //6. When the previous node is null
      System.out.print("\nThe previous node is null.");
    }       
  }
}  
