
/*
Alice and Bob are playing a game on a sequence a1,a2,...,an of length n .
They move in turns and Alice moves first. 
In the turn of each player, he or she should select an integer and remove it from the sequence.
The game ends when there is no integer left in the sequence. 
Alice wins if the sum of her selected integers is even; otherwise, Bob wins.
 Your task is to determine who will win the game, if both players play optimally.
*/
import java.util.*;
public class Sequence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int codd=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            codd++;
        }
        if(codd==0 || codd%2!=0)
        System.out.println("ALICE");
        else
        System.out.println("BOB");
    
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
