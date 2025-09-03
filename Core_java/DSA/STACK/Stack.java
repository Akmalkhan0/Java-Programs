import java.util.EmptyStackException;
import java.io.*;

public class Stack<A> {
	private Object[] elements;
	private int top;
	private static int capacity;

	public Stack(){
		this.capacity = 10;
		this.elements = new Object[capacity];
		this.top = 0;
	}

	public Stack(int capacity){
		if(capacity < 0){
			throw new IllegalArgumentException("Initial Capacity cannot be negative "+capacity);
		}
		this.capacity = capacity;
		this.elements = new  Object [capacity];
		this.top = 0;
	}
	
	public A push(A item){
		if(top == capacity){
			capacity = capacity*2;
			Object[] newA = new Object[capacity];
			for(int i = 0 ; i< top ; i++ ){
				newA[i] = elements[i];
			}
			elements = newA;
		}
		elements[top++] = item;
		return item;
	}

	public A pop() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		A item = (A) elements[--top];
		elements[top] = null;
		return item;
	}


	public A peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return (A) elements[top-1];
	}
	
	public boolean isEmpty(){
		return top == 0;
	}

	public int search(Object o){
		for(int i = top -1 ; i >= 0 ; i--){
			if(o == null){
				if(elements[i] == null){
					return (top-i);
				}
			}
			else if(o.equals(elements[i])){
				return (top-i);
			}
		}
		return -1;
	}
	
	public int size(){
		return top;
	}

	public int capacity(){
		return this.capacity;
	}

	public String toString(){
		if(isEmpty()){
			return " The Stack is Empty\n[]\n";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(int i = 0 ; i < top ; i++){
			sb.append(elements[i].toString());
			if(i<top-1){
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
 
