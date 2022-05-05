// Two stack in a single array

import java.util.*;
 class Stack
{
	int arr [];
	int size;
	int B;
	int A;
    
	void Stack(int n)
	{
		size = n;
		arr = new int[n];
		B =n/2+1;
		A = n/2;
	}
	void Insert1(int x)
	{
		if(B>0)
		{
			B--;
			arr[B]=x;
			
		}
		else{
			System.out.print("Stack exeed limit"+"By element :"+x+"\n");
			return;
		}
	}
	void Insert2(int x){
		if(A<size-1){
			A++;
			arr[A]=x;
		}
		else{
			System.out.print("Stack Ovrflow"+"By element"+x+"\n");
			return;
		}
	}
	int delete1(){
		if(B<=size/2)
		{
			int x = arr[B];
			B++;
			return x;
		}
		else{
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	}
		
		int delete2()
		{
			if(A>= size/2+1){
				int x = arr[A];
				A--;
				return x;
				
			}
			else
			{
				System.out.print("Stack Underflow");
				System.exit(1);
			}
			return 1;
		}
	
}
	class ABC{
		
	
	
	public static void main(String args[])
	{
		Stack st = new Stack();
        st.Insert1(5);
        st.Insert1(10);
        st.Insert1(15);
        st.Insert1(11);
        st.Insert1(7);
       
		System.out.println("Poped element frm stack1"+ ":" +st.delete1()+"\n");
		 st.Insert1(40); 
		System.out.println("Poped element frm stack2"+ ":" +st.delete2()+"\n");
	
	}
}