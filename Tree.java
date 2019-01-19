
/**
 * Creates an instance of a Tree.
 *
 * @author S.Tso
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square lowerBase;
    private Square lowerBase2; 
    private Triangle upperpart;
    private Triangle upperpart1;
    private Triangle upperpart2;
    
    private Square lowerBase3;
    private Square lowerBase4; 
    private Triangle upperpart3;
    private Triangle upperpart4;
    private Triangle upperpart5;
    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        lowerBase = new Square();
        lowerBase2 = new Square();
        upperpart = new Triangle();
        upperpart1 = new Triangle();
        upperpart2 = new Triangle();
        
        lowerBase3 = new Square();
        lowerBase4 = new Square();
        upperpart3 = new Triangle();
        upperpart4 = new Triangle();
        upperpart5 = new Triangle();
        // actually draw the tree
        drawTree(x, y);
       
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        //Pinetree 
        lowerBase.makeVisible();
        lowerBase.moveVertical(525);
        lowerBase.changeColor("black");
        lowerBase.moveHorizontal(x);
        lowerBase.moveVertical(y);
        
        lowerBase2.makeVisible();
        lowerBase2.changeColor("black");
        lowerBase2.moveVertical(500);
        lowerBase2.moveHorizontal(x);
        lowerBase2.moveVertical(y);
        
        upperpart.makeVisible();
        upperpart.changeColor("green");
        upperpart.changeSize(50, 80);
        upperpart.moveVertical(490);
        upperpart.moveHorizontal(25);
        upperpart.moveHorizontal(x);
        upperpart.moveVertical(y);
        
        upperpart1.makeVisible();
        upperpart1.changeColor("green");
        upperpart1.changeSize(50, 80);
        upperpart1.moveVertical(450);
        upperpart1.moveHorizontal(27);
        upperpart1.moveHorizontal(x);
        upperpart1.moveVertical(y);
        
        upperpart2.makeVisible();
        upperpart2.changeColor("green");
        upperpart2.changeSize(50, 80);
        upperpart2.moveVertical(420);
        upperpart2.moveHorizontal(25);
        upperpart2.moveHorizontal(x);
        upperpart2.moveVertical(y);
        // translate the tree to the specified location
        
        //Pinetree1 
        lowerBase3.makeVisible();
        lowerBase3.moveVertical(525);
        lowerBase3.changeColor("black");
        lowerBase3.moveHorizontal(100);
        lowerBase3.moveHorizontal(x);
        lowerBase3.moveVertical(y);
        
        lowerBase4.makeVisible();
        lowerBase4.changeColor("black");
        lowerBase4.moveVertical(500);
        lowerBase4.moveHorizontal(100);
        lowerBase4.moveHorizontal(x);
        lowerBase4.moveVertical(y);
        
        upperpart3.makeVisible();
        upperpart3.changeColor("blue");
        upperpart3.changeSize(50, 80);
        upperpart3.moveVertical(490);
        upperpart3.moveHorizontal(125);
        upperpart3.moveHorizontal(x);
        upperpart3.moveVertical(y);
        
        upperpart4.makeVisible();
        upperpart4.changeColor("blue");
        upperpart4.changeSize(50, 80);
        upperpart4.moveVertical(450);
        upperpart4.moveHorizontal(127);
        upperpart4.moveHorizontal(x);
        upperpart4.moveVertical(y);
        
        upperpart5.makeVisible();
        upperpart5.changeColor("blue");
        upperpart5.changeSize(50, 80);
        upperpart5.moveVertical(420);
        upperpart5.moveHorizontal(125);
        upperpart5.moveHorizontal(x);
        upperpart5.moveVertical(y);
    }
    
}