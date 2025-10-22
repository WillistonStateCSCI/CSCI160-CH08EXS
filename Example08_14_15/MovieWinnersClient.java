/** Client for the MovieWinners class
    Anderson, Franceschi
*/
import java.util.Scanner;

public class MovieWinnersClient
{
  public static void main( String [ ] args )
  {
    // instantiate the winningIDs array
    MovieWinners winningIDs = new MovieWinners( );

    // prompt for the member ID
    Scanner scan = new Scanner( System.in );
    System.out.print( "Enter the member's ID "
                      + "or 0 to stop > " );
    int searchID = scan.nextInt( );

    while ( searchID != 0 )
    {
      // determine whether member is a winner
      System.out.println( winningIDs.getPrize( searchID ) );

      System.out.print( "\nEnter the next member's ID "
                         + "or 0 to stop > " );
      searchID = scan.nextInt( );
    }

    System.out.println( "\nThe winners were "
                         + winningIDs.toString( ) );
   }
}
