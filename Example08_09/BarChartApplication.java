/* A bar chart application
   Anderson, Franceschi
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
 
public class BarChartApplication extends Application 
{
  final int LEFT_MARGIN = 35;         // starting x coordinate
  final int BASE_Y_BAR  = 150;        // bottom of the bars
  final int BASE_Y_VALUE = 175;       // bottom of the values
  final int BAR_WIDTH = 30;           // width of each bar
  final int SPACE_BETWEEN_BARS = 20;  // pixels between bars

  private double [ ] cellBills 
      = { 45.24, 54.67, 42.55, 44.61, 65.29, 49.75 }; 
  private String [ ] months 
      = { "March", "April", "May", "June", "July", "August" }; 

  @Override
  public void start( Stage stage ) 
  {
    // set up window title and size
    GraphicsContext gc = JIGraphicsUtility.setUpGraphics( 
                  stage, "Bar Chart", 350, 200 );
        
    gc.setFill( Color.NAVY );          // bars will be blue
    int xStart = LEFT_MARGIN;          // x value for first bar

    for ( int i = 0; i < cellBills.length; i++ )
    {
      gc.fillRect( xStart, BASE_Y_BAR - cellBills[i],
                   BAR_WIDTH, cellBills[i] );

      gc.fillText( Double.toString( cellBills[i] ),
                   xStart, BASE_Y_VALUE );

      // move to starting x value for next bar
      xStart += BAR_WIDTH + SPACE_BETWEEN_BARS;
    }               
  }    
    
  public static void main( String [] args ) 
  {
    launch( args );
  }    
}