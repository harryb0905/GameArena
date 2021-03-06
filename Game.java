public class Game
{
    // constructor
    public Game(int currentLevel)
    {
        int noOfBlocks;
        int randHeightVal;
        int blocksOnScreen;
        int currentGap;
        int score = 0;
        
        double currentXPos = 0;
        double currentSpeed;
        
        boolean finished = false;
        
        // starting pos
        int startX = 1000;
        int startY = 400;
        
        // new game
        GameArena screen = new GameArena(1000,500);
    
        // level instance and variables
        Level level = new Level(currentLevel);
        
        currentLevel = level.getLevelType();
        noOfBlocks = level.getNoOfBlocks(currentLevel);
        currentGap = level.getGap(currentLevel);
        
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
        
        // add the character
        Bario barioCharacter = new Bario(100,448,6,screen);
        Rectangle collisionBox = barioCharacter.getCollisionBox();
        
        // make blocks move
        while (true)
        {
            for (int j = 0; j < noOfBlocks; j++)
            {
                // get the xPosition of the block
                currentXPos = blocks[j].getXPosition();
                
                // get the dx value of the block
                currentSpeed = blocks[j].getSpeed();
                
                // update the current x position of the block to existing pos + new x
                currentXPos -= currentSpeed;
                
                // set xPosition of each block to new position
                blocks[j].setXPosition(currentXPos);
                
                // check for collision
                if (collisionBox.didCollide(collisionBox, blocks[j]))
                {
                    finished = true;
                    break;
                }
                
                // increase score
                if (collisionBox.getXPosition() == blocks[j].getXPosition())
                    score++;
            }
            
            // move the bario character
            barioCharacter.move();
            if(screen.upPressed() || barioCharacter.jumping)
                barioCharacter.jump(12);
            
            // pause the window
            for(int i=0;i<3;i++)
                screen.pause();
               
            // xPos of last block is off screen, end
            if (currentXPos <= 0 || finished)
            {
                System.out.println("GAME FINISHED! YOU SCORED: " + score);
                break;
            }
        }
    }
}
