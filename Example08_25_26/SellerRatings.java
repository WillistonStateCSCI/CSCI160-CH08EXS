/** SellerRatings - client for Seller
*   Anderson, Franceschi
*/

public class SellerRatings
{
  public static void main( String [] args )
  {
    Seller seller = new Seller( "Mary" );
    
    seller.calcRating( 4 );  // one value
    System.out.println( seller );

    seller.calcRating( 5, 5 );  // two values
    System.out.println( seller );

    int [] arrayOfRatings = { 4, 4, 5 };
    seller.calcRating( arrayOfRatings ); // array
    System.out.println( seller );
    
    seller.calcRating( );  // no values
    System.out.println( seller );   
  }
}