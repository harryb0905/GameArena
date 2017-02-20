public class Game
{
    // main method
    public Game()
    {
        int noOfBlocks;
        int randHeightVal;
        int blocksOnScreen;
        
        // depends on selected value from main menu
        int currentLevel = 1;
        
        int currentGap;
        
        double currentXPos = 0;
        double currentDx;
        
        // starting pos
        int startX = 1000;
        int startY = 400;
        
        // new game
        GameArena screen = new GameArena(1000,500);
        
        
        
        
        // main menu instances - once button pressed, returns levelType int (1,2,3)
        
        ///// while (true) {}
        
        // click button, then display game
        
    
        
        
        // level instance and variables
        // currentLevel = menu.getLevelType(); SOMETHING LIKE THAT
        Level level = new Level(currentLevel);
        currentLevel = level.getLevelType();
        
        noOfBlocks = level.getNoOfBlocks(currentLevel);
        currentGap = level.getGap(currentLevel);
        
        System.out.println("GAP IS: " + currentGap);
        
        
        blocksOnScreen = noOfBlocks;
        
        // blocks
        Block[] blocks = new Block[noOfBlocks];
        Block groundBlock = new Block(1000, 50, 500, 475);
        
        // add ground block
        screen.addBlock(groundBlock);
        
        // generate heights and add to screen
        for (int i = 0; i < noOfBlocks; i++)
        {
            randHeightVal = (int) (Math.random() * (5));
            blocks[i] = new Block(20, randHeightVal, startX, startY, "WHITE");
            
            startX += currentGap;
            
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
            
            // check if you collide with a block, stop if necessary
            
            // xPos of last block is off screen, end
            if (currentXPos <= 0)
            {
                // finish
                System.out.println("GAME FINISHED! RETRY?");
                break;
            }
            
        }
    
    }
}
