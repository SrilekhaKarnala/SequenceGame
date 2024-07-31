
    
/*
Alice and Bob are playing a game on a sequence a1,a2,...,an of length n . They move in turns and Alice moves first.  In the turn of each player, he or she should select an integer and remove it from the sequence. The game ends when there is no integer left in the sequence.  Alice wins if the sum of her selected integers is even; otherwise, Bob wins.  Your task is to determine who will win the game, if both players play optimally.
*/
import java.util.*;

public class SequenceGame {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements;

        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer for the number of elements.");
            sc.next(); 
        }
        numberOfElements = sc.nextInt();
        int sequence[] = new int[numberOfElements]; 
        int oddCount = 0;

        for (int i = 0; i < numberOfElements; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                sc.next(); 
            }
            sequence[i] = sc.nextInt();
            if (sequence[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println((oddCount == 0 || oddCount % 2 != 0) ? "ALICE" : "BOB");
    }
}
/*   Algorithm

* Read integer n (length of sequence) 
      * Initialize countOdd to 0 ,counteven is 0
*For each integer in the sequence: 
i.   Read integer ai 
                               ii.  If ai is odd, increment countOdd,else increment evencount 
      * If countOdd is 0 or countOdd is odd:
       i.   Print "Alice" 
Else: 
      i.   Print "Bob"
*/
