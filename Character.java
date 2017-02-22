public class Character
{
    public static void main(String[] args)
    {
        // particular menu button is pressed
        int easySelected = 1;
        int moderateSelected = 2;
        int hardSelected = 3;
        
        double x = 250;
        double y = 250;
        double size = 10;
        
        GameArena ga = new GameArena(500,500);
        
        // x pos, y pos, width, height, colour
        Rectangle shoe1 = new Rectangle((x+size),y,(size*3),size,"BROWN");
        Rectangle shoe2 = new Rectangle(x,(y-size),(size*3),size,"BROWN");
        
        // y going up = y + size *x where x is no. of pixels up
        // x going up = all zero
        // x going right = x + size * x where x is no. of pixels to right
        
        Rectangle pants1 = new Rectangle(x,(y-size*2),(size*3),size,"RED");
        Rectangle pants2 = new Rectangle(x,(y-size*4),(size*7),(size*3),"RED");
        Rectangle pants3 = new Rectangle((x-size*3.5),(y-size*2.5),(size*2),(size*2),"RED");
        
        Rectangle shoe3 = new Rectangle((x-size*4.5),(y-size*3),(size*2),(size*3),"BROWN");
        Rectangle shoe4 = new Rectangle((x-size*6),(y-size),size,(size*2),"BROWN");
        
        Rectangle leftHand1 = new Rectangle((x-size*4.5),(y-size*5.5),(size*2),(size*2),"#FFA64D");
        Rectangle leftHand2 = new Rectangle((x-size*6),(y-size*5),size,size,"#FFA64D");
        
        Rectangle rightHand1 = new Rectangle((x+size*3.5),(y-size*6),(size*2),(size*3),"#FFA64D");
        Rectangle rightHand2 = new Rectangle((x+size*5),(y-size*6),size,size,"#FFA64D");
        
        Rectangle body1 = new Rectangle(x,(y-size*6.5),(size*5),(size*4),"BROWN");
        Rectangle body2 = new Rectangle((x-size*3.5),(y-size*6.5),size,(size*2),"BROWN");
        
        Rectangle upperPants1 = new Rectangle(x,(y-size*8),size,size,"RED");
        Rectangle upperPants2 = new Rectangle((x+size*0.5),(y-size*7.5),size,(size*2),"RED");
        
        // add shoes, add fists, add pants, add body, add upper pants
        
        
        ga.addRectangle(shoe1);
        ga.addRectangle(shoe2);
        ga.addRectangle(shoe3);
        ga.addRectangle(shoe4);
        
        ga.addRectangle(leftHand1);
        ga.addRectangle(leftHand2);
        ga.addRectangle(rightHand1);
        ga.addRectangle(rightHand2);
        
        ga.addRectangle(pants1);
        ga.addRectangle(pants2);
        ga.addRectangle(pants3);
        
        ga.addRectangle(body1);
        ga.addRectangle(body2);
        
        ga.addRectangle(upperPants1);
        ga.addRectangle(upperPants2);
        while (true)
        {
            
        }
    }
}
