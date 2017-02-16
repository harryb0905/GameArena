public class Game
{
    public Game(int currentLevel)
    {
        // new game
        GameArena screen = new GameArena(1000,500);
        
        Level level = new Level();
        noOfBlocks = level.getNoOfBlocks(currentLevel);
        
    }

}
