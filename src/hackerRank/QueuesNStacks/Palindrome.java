package hackerRank.QueuesNStacks;

import java.util.LinkedList;
import java.util.Stack;

class Palindrome {
    //Write your code here
	Stack<Character> st = new Stack<Character>();
	LinkedList<Character> queue;
	void pushCharacter(char ch)
	    {
	    st.push(ch);
	}
	char popCharacter()
	    {
	    return (Character) st.pop();
	}
	Palindrome()
	{
	    queue = new LinkedList<Character>();
	}
	void enqueueCharacter(char ch)
	    {
	    queue.add(ch);
	}
	char dequeueCharacter()
	    {
	    return (Character) queue.remove();
	}
}
