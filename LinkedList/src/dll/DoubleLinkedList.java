package dll;
class node
{
	int data;
	node next,pre;
	static int size=0;
	node(int data)
	{
		this.data=data;
		this.next=null;
		this.pre=null;
		size++;
				
	}
}
public class DoubleLinkedList {
	node head,tail;
	void printDoublyLinkedList()
	{
		if(head == null )
			return;
		node i=head;	
	while(i!=null)
					{
						System.out.print(i.data+" -> ");
						i=i.next;
					}
		System.out.println(i);
		
	}
	void insertAtHead(node temp)
	{
		if(head==null)
		{
			head=temp;
			
			tail=temp;
		}
		
		head.pre=temp;
		temp.next=head;
		head=temp;
		
	}
	void insertAtEnd(node temp)
	{
		if(tail==null)
		{
			if(head==null)
				head=temp;
			tail=temp;
			return;
		}
		tail.next=temp;
		temp.pre=tail;
		tail=temp;
	}
	void inserAt(int n,node temp)
	{
		int i=1;
		node in=head;
		if(i==1)
		{
			this.insertAtHead(temp);
			return;
		}
		while(i<n)
		{
			in=in.next;
			i++;
		}
		if(in.next==null)
		{
			this.insertAtEnd(temp);
			return ;
		}
		temp.next=in.next;
		in.next=temp;
		temp.pre=in;
		
	}
	public static void main(String[] args) {

		DoubleLinkedList dll=new DoubleLinkedList();
		dll.printDoublyLinkedList();
		 dll.head=new node(10);
		dll.tail=dll.head;
		for(int i=1;i<=10;i++)
			dll.insertAtHead(new node(i));
		dll.printDoublyLinkedList();
		
		
	}

}
