import java.util.Scanner;

public class CharQueueTester {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		CharQueue letterQueue = new CharQueue();		
		int input = -1;
		while(input != 0)
		{
			System.out.println(letterQueue);
			System.out.println("1) Enqueue");
			System.out.println("2) Dequeue");
			System.out.println("0) Quit");
		
			input = sc.nextInt();
			if(input == 1)
			{
				System.out.println("Type a letter");
				String n = sc.next();
				char c = n.charAt(0);
				letterQueue.enqueue(c);
			}
			else if(input == 2)
			{
				System.out.println("Dequeued: " + letterQueue.dequeue());
			}
		}
	
	}

}
