public class Driver
{
    public static void main(String[] args)
    {
        // level difficulties = 1:easy, 2:moderate, 3:hard
        Game newGame;
        int difficulty = Integer.parseInt(args[0]);
        
        if (difficulty < 1 || difficulty > 3)
        {
            System.out.println("ERROR: Choose a difficulty from 1-3");
            System.exit(0);
        }
        else
        {
            newGame = new Game(Integer.parseInt(args[0]));
        }
    }
}
