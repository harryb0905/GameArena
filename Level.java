public class Level {

    // blocks per level array (e,m,h)
    private static final int[] blocksPerLvl = {20,40,60};
    private int levelType;
    
    // block gaps for each level type (e,m,h)
    private static int[] gaps = {400,350,300};
    
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
    
    // returns the current gap
    public int getGap(int currentLevel)
    {
        return gaps[currentLevel-1];
    }
    
    // constructor
    public Level(int levelType)
    {
        this.levelType = levelType;
    }
}
