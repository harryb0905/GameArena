public class Block
{
    
    // fixed block width + heights
    private static final int width = 20;
    private static final int[] blockHeights = {10, 30, 40};
    
    // shape variables
    private int height;
    private String colour;
    private double xPosition;
    private double yPosition;
    private int dx;
    private int dy;
    
    // returns width of block
    public int getWidth()
    {
        return width;
    }
    
    // returns height of block
    public int getHeight()
    {
        return height;
    }
    
    // returns xPosition on screen
    public double getXPosition()
    {
        return xPosition;
    }
    
    // returns yPosition on screen
    public double getYPosition()
    {
        return yPosition;
    }
    
    // returns change in x value
    public int getDx()
    {
        return dx;
    }
    
    // returns change in y value
    public int getDy()
    {
        return dy;
    }
    
    // constructor
    public Block(int heightNum)
    {
        this.height = blockHeights[heightNum];
        
    }



}
