/** CellPhone class
*   Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class CellPhone
{
  public final int MONTHS = 6;  // default number of months
  private String phoneNumber;
  private double [] cellBills;

  /** Default constructor
  *   creates cellBills with MONTHS elements
  */
  public CellPhone( )
  {
     phoneNumber = "";
     cellBills = new double [MONTHS];
  }

  /** Constructor
  *  @param  phoneNumber  cell phone number
  *  @param  cellBills   array of monthly bills
  */
  public CellPhone( String phoneNumber, double [] cellBills )
  {
    this.phoneNumber = phoneNumber;

    // instantiate array with same length as parameter
    this.cellBills = new double [cellBills.length];

    // copy parameter array to cellBills array
    for ( int i = 0; i < cellBills.length; i++ )
    {
      this.cellBills[i] = cellBills[i];
    }
  }

  /** Accessor for the phone number
  *   @return the phone number
  */
  public String getPhoneNumber( )
  {
    return phoneNumber;
  }

  /** Accessor for the cell phone bills
  *   @return  copy of cellBills array
  */
  public double [] getCellBills( )
  {
     double [] temp = new double [cellBills.length];
     for ( int i = 0; i < cellBills.length; i ++ )
     {
       temp[i] = cellBills[i];
     }
     return temp;
   }

   /**  Calculates total of all cell phone bills
   *    @return  total of all elements in cellBills array
   */
   public double calcTotalBills( )
   {
     double total = 0.0;  // initialize total to 0.0

     for ( int i = 0; i < cellBills.length; i++ )
     {
       total += cellBills[i];  // add current element to total
     }
     return total;
   }

   /** Finds the maximum bill
   *  @return largest value in cellBills array
   */
   public double findMaximumBill( )
   {
     double max = cellBills[0]; // assume first element is max

     for ( int i = 1; i < cellBills.length; i++ )
     {
        if ( cellBills[i] > max )
           max = cellBills[i];  // save new maximum
     }
     return max;
   }

   /** Returns printable version of CellPhone object
   *   @return phone number plus each month's bill
   */
   @Override
   public String toString( )
   {
     String returnValue = phoneNumber + "\n";
     DecimalFormat money = new DecimalFormat( "$##0.00" );
     for ( int i = 0; i < cellBills.length; i++ )
     {
        returnValue += money.format( cellBills[i] ) + "\t";
     }
     returnValue += "\n";

     return returnValue;
   }

   /**  Compares two CellPhone objects for equality
   *   @param c CellPhone object
   *   @return  true if objects are equal; false, otherwise
   */
   @Override
   public boolean equals( Object c )
   {
     if ( !( c instanceof CellPhone ) )
         return false;
     else
     {
         CellPhone objCP = ( CellPhone ) c;
         if ( !( phoneNumber.equals( objCP.phoneNumber ) ) )
           return false;

         if ( cellBills.length != objCP.cellBills.length )
           return false; // arrays are not the same length

         for ( int i = 0; i < cellBills.length; i++ )
         {
            if ( cellBills[i] != objCP.cellBills[i] )
              return false;
         }
         return true;
     }
   }
 }

