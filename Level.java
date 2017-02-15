public class Level {

    // objects per level array
    private static final int[] objPerLvl = {20,30,40,50,75,100,250,500,750,1000};
    
    
    
    // return number of shapes for current level
    public int getNoOfShapes(int currentLevel)
    {
        return objPerLvl[currentLevel-1];
    }
    
    
    
    
    // constructor
    public Level()
    {
        
        
        
    }


}
