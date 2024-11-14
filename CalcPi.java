// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double finalPi = 0;
		int mehane = 1;
		double shever = 0;
		int plusOrMinus = 1;
		while (num > 0)
		{			
			shever = 1.0 / mehane;
			if (plusOrMinus % 2 == 0) {finalPi = finalPi - shever; }
			else                      {finalPi = finalPi + shever; }
			shever = 0;
			num = num - 1;
			plusOrMinus = plusOrMinus + 1;
			mehane = mehane + 2;
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+finalPi * 4);
	}
}
