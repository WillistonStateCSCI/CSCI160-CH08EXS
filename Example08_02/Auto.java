/* Auto class
   Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class Auto
{
    // instance variables
    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    private static int countAutos = 0;  // static class variable

    // Constructors:
    //  initializes model to a blank String;
    //  milesDriven is auto-initialized to 0
    //        and gallonsOfGas to 0.0;
    // increments countAutos
    public Auto( )
    {
       model = "unknown";
       countAutos++;    // increment static count of Auto objects
    }

    // allows client to set beginning values for
    // model, milesDriven, and gallonsOfGas;
    // increments countAutos
    public Auto( String model,
                 int milesDriven,
                 double gallonsOfGas )
    {
       this.model = model;
       setMilesDriven( milesDriven );
       setGallonsOfGas( gallonsOfGas );
       countAutos++;    // increment static count of Auto objects
    }

    // Accessor Methods
    // returns current value of model
    public String getModel( )
    {
       return model;
    }

    // returns current value of milesDriven
    public int getMilesDriven( )
    {
       return milesDriven;
    }

    // returns current value of gallonsOfGas
    public double getGallonsOfGas( )
    {
      return gallonsOfGas;
    }

    // returns countAutos
    public static int getCountAutos( )
    {
      return countAutos;
    }

    // Mutator Methods:
    // allows client to set model
    public Auto setModel( String model )
    {
        this.model = model;
        return this;
    }

    // allows client to set value of milesDriven;
    // if new value is greate than or equal to 0
    public Auto setMilesDriven( int milesDriven )
    {
       if ( milesDriven >= 0 )
          this.milesDriven = milesDriven;
       return this;
    }

    // allows client to set value of gallonsOfGas;
    // if new value is greater than 0.0, assigns new value 
    public Auto setGallonsOfGas( double gallonsOfGas )
    {
      if ( gallonsOfGas >= 0.0 )
         this.gallonsOfGas = gallonsOfGas;
      return this;
    }

    // Calculates miles per gallon.
    // if no gallons of gas have been used, returns 0.0;
    // otherwise, returns miles per gallon
    //   as milesDriven / gallonsOfGas
    public double milesPerGallon( )
    {
      if ( gallonsOfGas != 0.0 )
           return milesDriven / gallonsOfGas;
      else
           return 0.0;
    }

    // toString: returns a String with values of instance variable
    @Override
    public String toString( )
    {
       DecimalFormat gallonsFormat = new DecimalFormat( "#0.0" );
       return "Model: " + model
             + "; miles driven: " + milesDriven
             + "; gallons of gas: "
             + gallonsFormat.format( gallonsOfGas );
    }

    // equals: returns true if fields of parameter object
    //         are equal to fields in this object
    @Override
    public boolean equals( Object o )
    {
      if ( ! (o instanceof Auto ))
         return false;
      Auto autoA = (Auto)o; 
      if ( model.equals( autoA.model )
           && milesDriven == autoA.milesDriven
           && Math.abs( gallonsOfGas - autoA.gallonsOfGas )
             < 0.0001 )
           return true;
      else
           return false;
    }
 }
