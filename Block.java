public class Block
{
    
    // fixed block width + heights
    private int width;
    private static final int[] blockHeights = {10, 20, 30, 40, 50};
    
    // shape variables
    private int height;
    private String colour;
    private double xPosition;
    private double yPosition;
    private int dx = 5;
    
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
    
    // returns the colour of the block
    public String getColour()
    {
        return colour;
    }
    
    // returns change in x value
    public int getDx()
    {
        return dx;
    }
    
    // sets new xPosition to xPos
    public void setXPosition(double xPos)
    {
        this.xPosition = xPos;
    }
    
    // sets new yPosition to yPos
    public void setYPosition(double yPos)
    {
        this.yPosition = yPos;
    }
    
    
    // constructor
    public Block(int width, int heightNum, int start, int gap, int yPos, String colour)
    {
        this.width = width;
        this.height = blockHeights[heightNum];
        this.xPosition = start + gap;
        this.yPosition = yPos;
        this.colour = colour;
    }

}
