/* Working With an Array of Objects
   Anderson, Franceschi
*/

public class AutoArray
{
  public static void main( String [] args )
  {
    // 1. instantiate cars array
    Auto [] cars = new Auto [3];

    // 2. instantiate Auto objects
    Auto sportsCar = new Auto( "Ferrari", 100, 15.0 );
    cars[0] = sportsCar;    // assign sportsCar to element 0
    cars[1] = new Auto( );  // default Auto object
    // cars[2] has not been instantiated and is null

    // call Auto methods
    System.out.println( "cars[0] is a " + cars[0].getModel( ) );

    Auto myCar = cars[1];
    System.out.println( "myCar has used " + myCar.getGallonsOfGas( )
                         + " gallons of gas" );

    // attempt to call method when Auto object is not instantiated
    System.out.println( "cars[2] is a " + cars[2].getModel( ) );
  }
}
