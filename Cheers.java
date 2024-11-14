// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            int howManyCheers = Integer.parseInt(args[1]);
            int wordLength = word.length();
            int letterrCounter = 0;
            String forbidenLetters = "AEFHILMNORSX";
            while (letterrCounter < wordLength)
            {
                char c = word.charAt(letterrCounter);
                if (forbidenLetters.indexOf(c) == -1)
                {
                        System.out.println("Give me a  "+c+": "+c+"!");

                }
                else { System.out.println("Give me an "+c+": "+c+"!"); }
                letterrCounter++;
            }
            System.out.println("What does that spell?");
            int cheersCounter = 0;
            while (cheersCounter < howManyCheers)
            {
                System.out.println(word+"!!!");
                cheersCounter++;
            }
        }
}
