public class Driver
{
    
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
            // heightNums: 1=easy height, 2=normal height, 3=hard height
            shapes[i] = new Shape( (int) Math.random() * (3));
            
        }
        
        
        
        
        
    }



}
