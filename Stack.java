package tasks;


public class Stack {
	
	 private int maxSize;    // size of the stack array
	 private char[] stackArray; // array to hold stack elements
     private int top;  // top of the stack
     
     public Stack (int size) {
    	 maxSize=size;
    	stackArray=new char[maxSize];
    	 top=-1;
     }
     //push method to add element
     public void push(char value) {
    	 if(isFull()) {
    		 System.out.println("Stack is full cannot push : "+value);
    	 }else {
    		 stackArray[++top]=value;
        }
    }
     
     //pop method to remove and return the top element 
     public char pop() {
    	 if(isEmpty()) {
    		 System.out.println("Stack is empty. Cannot pop.");
    		 return'\0';
    	 }else {
    		return stackArray[top--];
    	 }
     }

     // Peek method to see the top element
     public char peek() {
         if (isEmpty()) {
             System.out.println("Stack is empty.");
             return '\0';
         }else {
        	 return stackArray[top];
         }
     }
     //check if the stack is empty
     public boolean isEmpty() {
    	 return (top==-1);
     }
     
     //check if the stack is full
     public boolean isFull() {
    	 return(top==maxSize-1);
     }
	
	public static void main(String[] args) {


		Stack s = new Stack(5);
		
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');
		s.push('f');// Stack full, cannot push

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element after pop: " + s.peek());
	
		
		
	}

}
