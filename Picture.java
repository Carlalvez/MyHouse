public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square rectangle;
    private Person persona;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        rectangle = new Square();
        rectangle.changeColor("green");
        rectangle.moveHorizontal(-350);
        rectangle.moveVertical(140);
        rectangle.changeSize(1000);
        rectangle.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        persona = new Person();
        persona.moveHorizontal(100);
        persona.moveVertical(-40);
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            rectangle.changeColor("green");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            rectangle.changeColor("green");
        }
    }
    
    /**
     * Método moveSun añadido
     */
    public void moveSun()
    {
        if (sun != null)   // only if it's painted already...
        {
            sun.slowMoveVertical (100);
            sun.slowMoveVertical (20);
            persona.makeVisible ();
            persona.slowMoveHorizontal (150);
        }
    }
}
