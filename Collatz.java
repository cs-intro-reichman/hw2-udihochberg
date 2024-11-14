// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		String cOrV = args[1];
		int insideLoopCouter = 0;
		int outsideLoopCounter = 0;
		int newNum;
		if (cOrV.charAt(0)  == 'v')
		{
		for (int i = 1; i <= num; i++)
		{
			if (outsideLoopCounter != 0 ) {System.out.println("1 (" +(insideLoopCouter+1) +")");}
			insideLoopCouter = 0;
			newNum = i;
			while (outsideLoopCounter > -1)
			{
				System.out.print(newNum+" ");				
				if (newNum % 2 == 0) {newNum = newNum / 2;}
				else                 {newNum = (newNum * 3) + 1; }
				insideLoopCouter++;
				if (newNum == 1) {break; }
				outsideLoopCounter++;
			}
		}
	
		System.out.println("1 (" +(insideLoopCouter+1) +")");
	}
		System.out.println("Every one of the first " +num+" hailstone sequences reached 1.");
	}
}
