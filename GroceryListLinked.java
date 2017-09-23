class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  /*
   * TEMPLATE
   * FIELDS:
   * 	this.head -- GroceryNode
   *	this.size -- int
   *
   * METHODS:
   * 	this.add(GroceryItem)      --boolean
   *   	this.remove(String)        --boolean
   *   	this.markAsBought(String)  --boolean
   *   	this.display()             --void
   *   	
   */
  
  //GroceryItem->boolean
  //Returs true when the item is added to the list
  public boolean add(GroceryItem item) {
	  GroceryNode node = new GroceryNode(item,head);
	  head = node;
	  size++;
    return true;
  }
  
  //String->boolean
  //Returns true if the item that matches the name given is removed
  public boolean remove(String name) {
	  if (this.size == 0) {
	      return false;
	    }
	    
	    GroceryItem item = new GroceryItem(name, 0);
	    GroceryNode current = this.head;
	    GroceryNode previous = current;
	    
	    while(current != null){

	      if (item.equals(current.data)){
	        previous.next = current.next;
	        current.next = null;
	    
	        this.size--;
	        return true;
	      }
	      
	      previous = current;
	      current = current.next;
	      
	    }
	    return false;
	  }
  
  //String->boolean
  //  
  public boolean markAsBought(String name) {
	  GroceryNode current = head;
	  boolean flag = false;
	    
	    while (current != null) {
	      if (current.data.equals(new GroceryItem(name, 0))) {
	        flag = true;
	        return flag;
	      }
	      current = current.next;
	    }
	    return flag;
	  }
  //->void
  //
  public void display() {
	  GroceryNode current = this.head;
	    while(current != null){
	      System.out.println(current.data);
	      current = current.next;
	    }
  }
  
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}