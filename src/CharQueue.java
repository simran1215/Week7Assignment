
public class CharQueue {
	int queueTop;
	char[] queue;
	
	public CharQueue()
	{
		queue = new char[10];
		queueTop = 0;
	}
	
	public void enqueue(char ch) throws RuntimeException
	{
		if(queueTop == queue.length) 
		{
			throw new RuntimeException("Queue overflow");
		}
		queue[queueTop] = ch;
		queueTop = queueTop + 1;
	}
	
	public char dequeue() throws RuntimeException
	{
		if(queueTop == 0)
		{
			throw new RuntimeException("Queue underflow");
		}
		char found = queue[0];
		for(int i=0;i<queueTop-1;i++)
		{
			queue[i] = queue[i+1];
		}
		queueTop--;
		return found;
	}
	
	@Override
	public String toString()
	{
		String output = "";
		for(int i=0;i<queueTop;i++)
		{
			output += queue[i];
		}
		return "Queue: " + output;
	}

}
