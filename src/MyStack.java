import java.util.ArrayList;

public class MyStack implements Cloneable{
	
	  //new ArrayList
	  private ArrayList<Object> list = new ArrayList<Object>();

	  //test if list is empty
	  public boolean isEmpty() {
	    return list.isEmpty();
	  }

	  //get list's size
	  public int getSize() {
	    return list.size();
	  }

	  public Object peek() {
	    return list.get(getSize() - 1);
	  }

	  //first in last out
	  public Object pop() {
	    Object o = list.get(getSize() - 1);
	    list.remove(getSize() - 1);
	    return o;
	  }

	  //add elements in array
	  public void push(Object o) {
	    list.add(o);
	  }

	  /** Override the toString in the Object class */
	   @Override public String toString() {
	    return "stack: " + list.toString();
	  }

	  public Object clone() {
	    try {
	      //perform a shallow copy
	      MyStack stack = (MyStack) super.clone();
	      //deep copy on list
	      stack.list = (ArrayList<Object>) this.list.clone();
	      return stack;
	    } catch (CloneNotSupportedException ex) {
	      return null;
	    }
	  }
}

