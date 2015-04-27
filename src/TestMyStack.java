
public class TestMyStack {
	public static void main(String[] args) {
		
		//new an object of Mystack
	    MyStack stack1 = new MyStack();
	    
	    //add strings to the stack(stack1)
	    stack1.push("stack1");
	    stack1.push("stack2");
	    stack1.push("stack3");
	    
	    //copy the stack from stack1 to stack2
	    MyStack stack2 = (MyStack) (stack1.clone());
	    
	    //add string the the stack(stack2)
	    stack2.push("stack4");
	    stack2.push("stack5");
	    stack2.push("stack6");

	    //print the strings in the stacks
	    System.out.println(stack1.toString());
	    System.out.println(stack2.toString());
	    
	    //print the size of the stacks
	    System.out.println("the size of the copied stack:"+stack1.getSize());
	    System.out.println("the size of the stac (copied):"+stack2.getSize());
	    
	  }
}
