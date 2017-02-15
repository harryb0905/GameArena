public class Driver
{
    
    public static void main(String[] args)
    {
        int currentLevel = 1;
        int noOfBlocks;
        int randHeight;
        double currentXPos;
        double currentDx;
        
        // TBC
        int start = 500;
        int gap = 300;
        
        
        GameArena screen = new GameArena(1000,500);
        Level level = new Level();
        
        noOfBlocks = level.getNoOfBlocks(currentLevel);
        Block[] blocks = new Block[noOfBlocks];
        Block groundBlock = new Block(1000, 50, 500, 475, "WHITE");
        
        // ground block
        screen.addBlock(groundBlock);
        
        System.out.println("Shapes to be used on level " + currentLevel + " is: " + noOfBlocks);
        
        // generate heights and add to screen
        for (int i = 0; i < noOfBlocks; i++)
        {
            randHeight = (int) (Math.random() * (5));
            blocks[i] = new Block(20, randHeight, start, gap, 400, "YELLOW");
            System.out.println("Block has width: " + blocks[i].getWidth() + " and height: " + blocks[i].getHeight());
            
            start += 400;
            
            // add block to screen
            screen.addBlock(blocks[i]);
            
        }
        
        
        
        
        // make blocks move
        while (true)
        {
            for (int j = 0; j < noOfBlocks; j++)
            {
                
                // get the xPosition of the block
                currentXPos = blocks[j].getXPosition();
                
                // get the dx value of the block
                currentDx = blocks[j].getDx();
                
                // update the current x position of the block to existing pos + new x
                currentXPos -= currentDx;
                
                // set xPosition of each block to new position
                blocks[j].setXPosition(currentXPos);
                
            }
            
            // pause the window
            screen.pause();
        
            
        }
        
        

    }
    
    
    
}


