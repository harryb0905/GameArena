public class Level {

    // blocks per level array
    private static final int[] blocksPerLvl = {20,30,40,50,75,100,250,500,750,1000};
    
    // block frequency ranges per level
    private static int[] ranges = {1,1,2,2,3,3,4,4,5,5};
    
    
    // return number of blocks for current level
    public int getNoOfBlocks(int currentLevel)
    {
        return blocksPerLvl[currentLevel-1];
    }
    
    
    
    
    // constructor
    public Level()
    {
        
        
        
    }


}
