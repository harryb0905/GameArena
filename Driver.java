public class Driver
{
    
    // private static int noOfShapes = 30;

    public static void main(String[] args)
    {
        int currentLevel = 1;
        int noOfShapes;
        
        GameArena screen = new GameArena(700,400);
        Level level = new Level();
        
        noOfShapes = level.getNoOfShapes(currentLevel);
        Shape[] shapes = new Shape[noOfShapes];
        
        System.out.println("Shapes to be used on level " + currentLevel + " is: " + noOfShapes);
        
        for (int i = 0; i < noOfShapes; i++)
        {
            
            shapes[i] = new Shape(Math.random() * (9), Math.random() );
            
        }
        
        
        
        
        
    }



}
