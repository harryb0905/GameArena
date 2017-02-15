public class Driver
{
    
    public static void main(String[] args)
    {
        int currentLevel = 1;
        int noOfBlocks;
        int randHeight;
        
        GameArena screen = new GameArena(700,400);
        Level level = new Level();
        
        noOfBlocks = level.getNoOfBlocks(currentLevel);
        Block[] blocks = new Block[noOfBlocks];
        
        System.out.println("Shapes to be used on level " + currentLevel + " is: " + noOfBlocks);
        
        for (int i = 0; i < noOfBlocks; i++)
        {
            // heightNums: 1=easy height, 2=normal height, 3=hard height
            randHeight = (int) (Math.random() * (3));
            blocks[i] = new Block(randHeight);
            System.out.println("Block has width: " + blocks[i].getWidth() + " and height: " + blocks[i].getHeight());
            
        }
        
        
        
        
        
    }



}
