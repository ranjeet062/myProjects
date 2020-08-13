import java.util.Stack;

public class StackSort {
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(-5);
		s.push(10);
		s.push(-3);
		s.push(0);
		s.push(20);
		System.out.println("Original Stack: "+s);
		System.out.println(s);
		Stack<Integer> s1 =new Stack<>();
		s1.push(-5);
		s1.push(10);
		s1.push(-3);
		s1.push(0);
		s1.push(20);
		Stack<Integer> sortStackInTempStack = sortStackInTempStack(s);
		System.out.println(sortStackInTempStack);
		System.out.println("Original Stack: "+s1);
		sortStack(s1);
		System.out.println("Sorted Stack: "+s1);
	}
	
	private static void sortStack(Stack s)
	{
		
		if(!s.isEmpty())
		{
			int temp = (int) s.pop();
			 sortStack(s);
			 sortedInsert(s,temp);
		}
	}
	private static void sortedInsert(Stack<Integer> s, int temp)
	{
		if(s.isEmpty() || temp < s.peek())
		{
			s.push(temp);
			return;
		}
		int val = s.pop();
		sortedInsert(s, temp);
		s.push(val);
		
	}
	private static Stack<Integer> sortStackInTempStack(Stack s)
	{
		Stack<Integer> tempStack = new Stack<>();
		while(!s.isEmpty())
		{
			int temp = (int) s.pop();
			 	while(!tempStack.isEmpty() && tempStack.peek() < temp)
			 	{
			 		s.push(tempStack.pop());
			 	}
			 tempStack.push(temp);
		}
		return tempStack;
		
	}

}
