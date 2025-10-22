/** DieCount2 Class
*   Anderson, Franceschi
*/

public class DieCount2
{
  public static void main( String [] args )
  {
     final int FACES = 7, NUMBER_OF_ROLLS = 500;

     // instantiate the counter array
     // which sets initial values to 0
     int [] rollCount = new int [FACES];

     // instantiate the Die
     Die d1 = new Die( );

     // roll the die 500 times
     for ( int i = 1; i <= NUMBER_OF_ROLLS; i++ )
     {
       int myRoll = d1.roll( );
       rollCount[myRoll]++;  // increment the counter for roll
     }

     // print count for each roll
     System.out.println( "Roll\tCount" );
     for ( int i = 1; i < rollCount.length; i++ )
     {
       System.out.println(  i  + "\t" + rollCount[i] );
     }
  }
}
