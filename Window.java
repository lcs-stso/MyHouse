
/**
 * Create an image of window 
 *
 * @author S.Tso
 * @version January 14,2019
 */
public class Window
{
    private Square window;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
   
    /**
     * Constructor for objects of class window
     */
    public Window()
    {
        // initialise instance variables
        window = new Square();
        window1 = new Square();
        window2 = new Square();
        window3 = new Square();
        window4 = new Square();
        
        
        // Draw window
        drawWindow();
        
        
    }

    /**
     * Draw the house 
     */ 
    public void drawWindow()
    {
        //Set up the window 
        window.changeSize(45);
        window.makeVisible();
        window.changeColor("white");
        window.moveVertical(155);
        window.moveHorizontal(100);
        window1.makeVisible();
        window1.changeColor("blue");
        window1.changeSize(15);
        window1.moveVertical(160);
        window1.moveHorizontal(107);
        window2.makeVisible();
        window2.changeColor("magenta");
        window2.changeSize(15);
        window2.moveVertical(160);
        window2.moveHorizontal(123);
        window3.makeVisible();
        window3.changeColor("black");
        window3.changeSize(15);
        window3.moveVertical(177);
        window3.moveHorizontal(107);
        window4.makeVisible();
        window4.changeColor("blue");
        window4.changeSize(15);
        window4.moveVertical(177);
        window4.moveHorizontal(123);
        
    }
}
