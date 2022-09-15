import java.util.*;
class Stack<T>
{
	final int MAX_LENGTH = Integer.MAX_VALUE - 1;
	T arr[] = (T[]) new Object[10];
	int top = -1;

	void push(T a) {
		arr[++top] = a;
	}

	T pop() {
		if(top>=0)
		return arr[top--];
		return null;
	}

	T peek() {
		return arr[top];
	}

	int size() {
		return top+1;
	}

}
public class StackImplementationUsingArray<T> {


public static void main(String[] args) {
	Stack <Integer> st=new Stack<>();
	st.push(1);
	st.push(100);
	System.out.println(st.size());
	System.out.println(	st.peek());
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());


}

}
