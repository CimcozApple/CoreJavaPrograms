/*
 * Problem Statement
Write a stack for Contact objects. Use exception handling to apply the following rules:
(Note: Create your Own Implementation for Stack. Do Not use existing collection.)
[Hint: You can use array based stack.]
i.	A pop must fail on an uninitialized stack and empty stack
ii.	A push must fail on an uninitialized stack and stack which is already full
iii.	A push must fail on a stack if the Contact object’s validation fails.
*/

package com.psl.training.assigment;

public class Stack {
	Contact[] arr= new Contact[5];
	int top=-1;
	public  void push(Contact obj) throws Exception{
		try 
		{		
			if(arr == null)
				throw new Exception("Stack in uninitialized");
			else if(top == arr.length)
				throw new Exception("Stack is full");
			else 
				obj.validate();
				arr[++top]=obj;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public Contact pop() throws Exception 
	{
		
		if (arr == null)
			throw new Exception("Stack in uninitialized");
		else if(top == -1)
			throw new Exception("Stack is empty");
		else
		return arr[top--];
		
	}

	public static void main(String[] args) throws Exception
	{
		Stack st = new Stack();
		Contact obj1 = new Contact();
		st.push(obj1);
		st.pop();
		
	}

}
