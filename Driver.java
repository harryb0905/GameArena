public class Driver
{
    public static void main(String[] args)
    {
        // particular menu button is pressed, these bools change
        boolean easySelected = true;
        boolean moderateSelected = false;
        boolean hardSelected = false;
        
        int easy = 1;
        int moderate = 2;
        int hard = 3;
    
        // when user presses a button, start the game
        if (easySelected)
        {
            Game newGame = new Game(easy);
        }
        else if (moderateSelected)
        {
            Game newGame = new Game(moderate);
        }
        else if (hardSelected)
        {
            Game newGame = new Game(hard);
        }
        
    }
}
