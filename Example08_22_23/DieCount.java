/** DieCount Class
*   Anderson, Franceschi
*/

public class DieCount
{
  public static void main( String [] args )
  {
     final int FACES = 6, NUMBER_OF_ROLLS = 500;

     // instantiate the counter array
     // which sets initial values to 0
     int [] rollCount = new int [FACES];

     // instantiate the Die
     Die d1 = new Die( );

     // roll the die 500 times
     for ( int i = 1; i <= NUMBER_OF_ROLLS; i++ )
     {
        int myRoll = d1.roll( );
        rollCount[myRoll - 1]++;  // increment the counter for roll
     }

     // print count for each roll
     System.out.println( "Roll\tCount" );
     for ( int i = 0; i < rollCount.length; i++ )
     {
        System.out.println( ( i + 1 ) + "\t" + rollCount[i] );
     }
  }
}
