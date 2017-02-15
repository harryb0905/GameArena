public class Shape
{
    
    // fixed block width + heights
    private static final int widthBlock = 20;
    private static final int[] blockHeights = {10, 30, 50};
    
    // shape variables
    private int height;
    private String colour;
    private double xPosition;
    private double yPosition;
    private int dx;
    private int dy;
    
    // returns standard width
    public int getWidthBlock()
    {
        return widthBlock;
    }
    
    // returns easiest height
    public int getEasyHeightBlock()
    {
        return easyHeightBlock;
    }
    
    // returns normal height
    public int getNormalHeight()
    {
        return normalHeightBlock;
    }
    
    // returns hardest height
    public int getHardHeightBlock()
    {
        return hardHeightBlock;
    }
    
    // constructor
    public Shape(int heightNum)
    {
        this.height = blockHeights[heightNum];
        
    }



}
