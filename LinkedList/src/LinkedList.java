
class node {
	int data;
	node next;
	static int size = 0;

	node(int val) {
		this.data = val;
		this.next = null;
		size++;
	}
}

public class LinkedList {
	node head, tail;

	void insertAtHead(node a) {
		if (this.head == null) {
			head = a;
			tail = head;
			return;
		}
		a.next = this.head;
		this.head = a;
	}

	void insertAtTail(node temp) {
		if (head == null) {
			head = temp;
			tail = head;
			return;
		}
		tail.next = temp;
		tail = temp;

	}

	void insertAt(node temp, int n) {
		if (n == 0) {
			this.insertAtHead(temp);
			return;
		}

		int i = 1;
		node ni = head;

		while (i < n) {

			if (ni == null) {
				break;
			}

			ni = ni.next;
			i++;
		}
		if (ni == null) {
			System.out.println("please enter valid index");
			return;
		}
		if (ni.next == null) {
			this.insertAtTail(temp);
			return;
		}

		temp.next = ni.next;

		ni.next = temp;

	}

	void deleteAtBegin() {

		if (head != null)
			head = head.next;
		node.size--;

	}

	void deleteAtEnd() {

		node i = head;
		while (i.next != tail) {
			i = i.next;
		}
		i.next = null;
		// i.next=null;
		tail = i;
		node.size--;

	}

	void deleteAt(int n) {
		int i = 1;
		node in = head;
		if (n == 0) {
			this.deleteAtBegin();
			return;
		}
		while (i < n) {
			if (in.next == null)
				break;
			in = in.next;
			i++;
		}
		if (in.next == null)
			return;
		if (in.next == this.tail) {
			deleteAtEnd();
			return;
		}

		in.next = in.next.next;
		node.size--;
	}

	void printLinkedList() {
		if (head == null)
			return;
		node i = this.head;
		while (i != tail.next) {
			System.out.print(i.data + " -> ");
			i = i.next;
		}
		System.out.print(i);
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		l.tail = l.head;
		for (int i = 0; i < 5; i++) {

			l.insertAt(new node(i), i);

		}

		l.printLinkedList();
		System.out.println("\nsize:" + node.size);
		l.deleteAt(10);
		l.printLinkedList();

		System.out.println("\nsize:" + node.size);

	}

}
