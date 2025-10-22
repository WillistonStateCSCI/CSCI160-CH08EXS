/* Sort Utility Class
*  Anderson, Franceschi
*/

public class Sorter
{
  /**  Uses Selection Sort to sort
  *      an integer array in ascending order
  *    @param the array to sort
  */
  public static void selectionSort( int [] array )
  {
    int temp; // temporary location for swap
    int max;  // index of maximum value in subarray

    for ( int i = 0; i < array.length - 1; i++ )
    {
      // find index of largest value in subarray
      max = indexOfLargestElement( array, array.length - i );

      // swap array[max] and array[array.length – i - 1]
      temp = array[max];
      array[max] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
  }

  /**  Finds index of largest element
  *    @param    size  the size of the subarray
  *    @param    array the array to search
  *    @return  the index of the largest element in the subarray
  */
  private static int indexOfLargestElement( int [] array, int size )
  {
    int index = 0;
    for ( int i = 1; i < size; i++ )
    {
       if ( array[i] > array[index] )
          index = i;
    }
    return index;
  }
}
