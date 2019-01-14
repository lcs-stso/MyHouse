
/**
 * Create an image of a house.
 *
 * @author S.Tso
 * @version January 11,2019
 */
public class Myhouse
{
    //fields a.k.a.
    // instance variables - replace the example below with your own
    //ACESS_MOIFIER TYPE NAME
    private Square base;
    private Triangle roof;
    private Square door;
    private Square window;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
   
    /**
     * Constructor for objects of class Myhouse
     */
    public Myhouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle ();
        door = new Square ();
       
        window = new Square ();
        window1 = new Square ();
        window2 = new Square ();
        window3 = new Square ();
        window4 = new Square ();
        
    }

    /**
     * Draw the house 
 
     */
    public void drawhouse()
    {
        // Arrange each object 
        
        //Set up the base (ctrl-Space) 
        base.makeVisible();
        base.moveVertical(130);
        base.moveHorizontal(40);
        base.changeSize(130);
        base.moveHorizontal(-20);
        base.changeColor("green");
        
        //Set up the roof 
        roof.makeVisible();
        roof.changeColor("yellow");
        roof.changeSize(100,170);
        roof.moveHorizontal(100);
        roof.moveVertical(65);
        
        //Set up the door 
        door.makeVisible();
        door.changeSize(40);
        door.moveVertical(210);
        door.moveHorizontal(60);
        
        
        
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
