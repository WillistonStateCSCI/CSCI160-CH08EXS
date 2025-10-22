/** Seller class
*   Anderson, Franceschi
*/
import java.text.DecimalFormat;

public class Seller
{
  private String sellerName;
  private double rating;
  private int numberOfRatings;
  private static final DecimalFormat ONE_PLACE 
                        = new DecimalFormat( "0.0" );
  
  /** constructor
  * @param sellerName seller name
  */
  public Seller( String sellerName )
  {
    this.sellerName = sellerName;
  }
  
  /** calcRating method
  * @param newRatings  0 to many new ratings 
  * updates rating and numberOfRatings instance variables
  */
  public void calcRating( int... newRatings )
  {
    if ( newRatings != null && newRatings.length > 0 )
    {
      int totalNewRatings = 0;
      for ( int i = 0; i < newRatings.length; i++ )
        totalNewRatings += newRatings[i];
      
      rating = ( ( rating * numberOfRatings ) + totalNewRatings  )
                / ( newRatings.length + numberOfRatings ); 
      numberOfRatings += newRatings.length;
    }
    // else, no new ratings, so no change to instance variables
  }
  
  /* toString method
  * @return the seller name
  *         and rating (formatted to 1 decimal place)
  */
  public String toString( )
  {
    return sellerName + ": rating " + ONE_PLACE.format( rating );
  }
}
