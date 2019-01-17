
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
        // put your code here
        lowerBase.makeVisible();
        lowerBase.moveVertical(525);
        lowerBase.changeColor("black");
        lowerBase2.makeVisible();
        lowerBase2.changeColor("black");
        lowerBase2.moveVertical(500);
        
        upperpart.makeVisible();
        upperpart.changeColor("green");
        upperpart.changeSize(50, 80);
        upperpart.moveVertical(490);
        upperpart.moveHorizontal(25);
        
        upperpart1.makeVisible();
        upperpart1.changeColor("green");
        upperpart1.changeSize(50, 80);
        upperpart1.moveVertical(450);
        upperpart1.moveHorizontal(27);
        
        upperpart2.makeVisible();
        upperpart2.changeColor("green");
        upperpart2.changeSize(50, 80);
        upperpart2.moveVertical(420);
        upperpart2.moveHorizontal(25);
       
        // translate the tree to the specified location
        
        
    }
    
}