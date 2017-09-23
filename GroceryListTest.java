import junit.framework.TestCase;

public class GroceryListTest extends TestCase {
  GroceryListLinked list = new GroceryListLinked();
   GroceryItem a = new GroceryItem("Onions", 1);
   GroceryItem b = new GroceryItem("Salt", 2);
   GroceryItem c = new GroceryItem("Sugar", 3);
   GroceryItem d = new GroceryItem("Butter", 4);
   GroceryItem e = new GroceryItem("Cheese", 5);
   GroceryItem f = new GroceryItem("Ice Cream", 6);
   GroceryItem g = new GroceryItem("Cereals", 7);
   GroceryItem h = new GroceryItem("Noodles", 8);
   GroceryItem j = new GroceryItem("Ramyeon", 9);
   GroceryItem k = new GroceryItem("Chocolate", 10);
   GroceryItem l = new GroceryItem("Tomatoes", 11);
   GroceryItem i = new GroceryItem("Mayo", 12);
   
  public void testMArkAsBought(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
  
   
   assertTrue(list.markAsBought("Onions"));
   assertTrue(list.markAsBought("Salt"));
   assertFalse(list.markAsBought("Chocobutternut"));
  }
  
  public void testAddFirst(){
	assertTrue(list.add(a));
	assertTrue(list.add(b));
	assertTrue(list.add(c));
	assertTrue(list.add(d));
  }

  

  public void testRemoveFirstItem(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   assertTrue(list.remove(a.name));
  }

  public void testRemoveMid(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   assertTrue(list.remove(c.name));
  }

  public void testRemoveLast(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   assertTrue(list.remove(e.name));

  }
  
  	
  
  
}
