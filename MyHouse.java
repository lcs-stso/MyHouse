
/**
 * Create an image of a house.
 *
 * @author S.Tso
 * @version January 14, 2019
 */
public class MyHouse
{
    //fields a.k.a.
    // instance variables - replace the example below with your own
    //ACESS_MOIFIER TYPE NAME
    private Square base;
    private Triangle roof;
    private Square door;
    private Window window1;
    private Window window2;
    private Window window3;
    private Tree pineTree; 
    
    /**
     * Constructor for objects of class Myhouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle();
        door = new Square();
         
        
        drawHouse();
       
        window1 = new Window(0, 0);
        window2 = new Window(-50, 0);
      
        //Create the pinetree
        pineTree = new Tree(0,0);
        
    }

    /**
     * Draw the house 
 
     */
    public void drawHouse()
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
     
        
        
        
    }
}
