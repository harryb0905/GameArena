public class Level {

    // blocks per level array
    private static final int[] blocksPerLvl = {20,40,60};
    private int levelType;
    
    // block frequency ranges per level
    private static int[] ranges = {1,1,2,2,3,3,4,4,5,5};
    
    private static int[] gaps = {300,200,100};
    
    
    // return number of blocks for current level
    public int getNoOfBlocks(int currentLevel)
    {
        return blocksPerLvl[currentLevel-1];
    }
    
    // returns the current level type (e,m,h)
    public int getLevelType()
    {
        return levelType;
    }
    
    // constructor
    public Level(int levelType)
    {
        this.levelType = levelType;
    }
}
