public class Game
{
    public static void main(String[] args)
    {
        int noOfBlocks;
        int randHeight;
        double currentXPos;
        double currentDx;
        
        int currentLevel = 1;
        
        // particular menu button is pressed, these bools change
        boolean easySelected = false;
        boolean moderateSelected = false;
        boolean hardSelected = false;
        
        // starting pos
        int startX = 1000;
        
        // new game
        GameArena screen = new GameArena(1000,500);
        
        Level level = new Level();
        noOfBlocks = level.getNoOfBlocks(currentLevel);
        
    
//        // when user presses a button, start the game
//        if (easySelected)
//        {
//            Game newGame = new Game(1);
//        }
//        else if (moderateSelected)
//        {
//            Game newGame = new Game(2);
//        }
//        else if (hardSelected)
//        {
//            Game newGame = new Game(3);
//        }
        
        
        Block[] blocks = new Block[noOfBlocks];
        Block groundBlock = new Block(1000, 50, 500, 475);
        
        // ground block
        screen.addBlock(groundBlock);
        
        // generate heights and add to screen
        for (int i = 0; i < noOfBlocks; i++)
        {
            randHeight = (int) (Math.random() * (5));
            blocks[i] = new Block(20, randHeight, startX, 400, "WHITE");
            System.out.println("Block has width: " + blocks[i].getWidth() + " and height: " + blocks[i].getHeight());
            
            startX += 400;
            
            // add block to screen
            screen.addBlock(blocks[i]);
        }
        

        // make blocks move
        while (true)
        {
            for (int j = 0; j < noOfBlocks; j++)
            {
                // place all code in blcok file (not relevant to driver)
                
                
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
