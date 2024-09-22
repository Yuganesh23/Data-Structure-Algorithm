package tasks;

public class StackList {

    // Node class to represent each element in the stack
	private class Node{
		char data;
		Node next;
		
		public Node(char data ) {
			this.data=data;
		}
	}
	
	private Node top;//top of the stack
	
	  // Constructor to initialize the stack
    public StackList() {
        this.top = null;
    }
    // Push method to add an element to the stack
    public  void push (char value) {
    	Node newNode= new Node(value);
    	newNode.next=top;// Set the new node's next to the current top
    	top=newNode;
    }
    // Pop method to remove and return the top element
     public char pop() {
    	 if (isEmpty()) {
             System.out.println("Stack is empty. Cannot pop.");
             return '\0'; // Return null character to indicate stack is empty
         }else {
        	 char poppedValue = top.data;// Get the data from the top node
        	 top=top.next;// Move the top to the next node
        	 return poppedValue;
         }
     }
     // Peek method to view the top element without removing it
     public char peek() {
         if (isEmpty()) {
             System.out.println("Stack is empty.");
             return '\0';
         } else {
             return top.data;
         }
     }

    
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

	public static void main(String[] args) {
		StackList sl=new StackList();
		
		sl.push('a');
		sl.push('b');
		sl.push('c');
		sl.push('d');
		sl.push('e');
		sl.push('f');
		sl.push('g');
		
        System.out.println("Top element: " + sl.peek());

        System.out.println("Popped element: " + sl.pop());
        System.out.println("Top element after pop: " + sl.peek());
		
	}

}
