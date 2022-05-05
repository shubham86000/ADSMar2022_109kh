//reverse a linked list
import java.util.*;
 class Node{
int data;
Node next;
Node(int data)
{
	this.data = data;
	this.next = null;
}
}
class Reverse{
	Node first = null;
	Node Last;
	Node prev;
	void add(int data){
		Node NewNode = new Node(data);
		if (first == null){
			first=NewNode;
			Last = first;
	}
	else{
		Last.next=NewNode;
		Last = NewNode;
	}
}
  void Reverse()
  {
	  if(first == null)
	  {
		  System.out.println("List is empty");
	  }
	  else{
		  Node curr = first;
		  prev = null;
		  while(curr!=null)
		  {
			  Node next1 = curr.next;
			  curr.next=prev;
			  prev = curr;
			  curr =next1;
		  }
	  }
  }
	  void display()
	  {
		  Node temp = prev;
		  while(temp!=null)
		  {
			  System.out.print(temp.data+" ");
			  temp = temp.next;
		  }
	  }
	  public static void main(String args[])
	  {
		  Reverse rev = new Reverse();
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter no");
		  int num = sc.nextInt();
		  for(int i=0;i<num;i++)
		  {
			  System.out.println("Enter no");
			  int k =sc.nextInt();
			  rev.add(k);
		  }
		  rev.reverse();
		  rev.display();
	  }


}