public class Bario{
    Rectangle character[][]  = new Rectangle[4][39];
    private double x,y;
    private double size;
    private GameArena ga;

    private int curBario[] = {0,1,0,2};
    private int curBarioCounter = 0;

    //variables realated with the jumping method
    public boolean jumping = false;
    private int jumpCounter = 1;
    private double speed = -5;

    public void move(){
        if(!jumping){
            devisualise(curBario[curBarioCounter]);
            curBarioCounter++;
            if(curBarioCounter>3)
                curBarioCounter = 0;
            visualise(curBario[curBarioCounter]);
            for(int i = 0;i<7;i++)
                ga.pause();   
        }
        
    }

    public void visualise(int cur){
        for(int i = 0;i<character[cur].length;i++){
            ga.addRectangle(character[cur][i]);
        }
    }

    public void devisualise(int cur){
        for(int i = 0;i<character[cur].length ;i++){
            ga.removeRectangle(character[cur][i]);
        }
    }
    public void jump(double heigth){

        if(!jumping){
            devisualise(curBario[curBarioCounter]);
            visualise(3);
        }
        
        jumping = true;
        if(jumpCounter != heigth && jumpCounter != (heigth+1)){
                for(int i = 0;i<character[3].length;i++){
                    character[3][i].setYPosition(character[3][i].getYPosition() + speed);
                }
            }
            if(jumpCounter == heigth){
                speed *= -1;
            }
            if(jumpCounter == ((heigth*2)-1)){
                jumping = false;
                jumpCounter = 0;
                speed *= -1;
                devisualise(3);
                visualise(curBario[curBarioCounter]);
            }
            jumpCounter++;
        }

    public Bario(double xp,double yp,double s,GameArena g){
        x = xp;
        y = yp;
        size = s;
        ga = g;
        character[0][0] = new Rectangle((x-size*1.5),y,(size*4),(size*1),"BROWN");
        character[0][1] = new Rectangle((x+size),(y-size),(size*3),size,"BROWN");
        character[0][2] = new Rectangle((x-size*1.5),(y-size*4.5),(size*8),(size*4),"BROWN");
        character[0][3] = new Rectangle((x-size*1.5),(y-size*4.5),(size*6),(size*6),"BROWN");
        character[0][4] = new Rectangle((x-size*0.5),(y-size*10),(size*6),(size*5),"#ffa64d");
        character[0][5] = new Rectangle(x,(y-size*10),(size*9),(size*3),"#ffa64d");  
        character[0][6] = new Rectangle((x+size*5),(y-size*10),size,size,"#ffa64d");
        character[0][7] = new Rectangle((x+size*3),(y-size*8),size,size,"#ffa64d");
        character[0][8] = new Rectangle(x,(y-size*13),(size*9),size,"RED");
        character[0][9] = new Rectangle((x-size),(y-size*14),(size*5),size,"RED");
        character[0][10] = new Rectangle((x+size),(y-size*11.5),size,(size*2),"BROWN");
        character[0][11] = new Rectangle((x-size*3),(y-size*12),(size*3),size,"#653b3b");
        character[0][12] = new Rectangle((x-size*3),(y-size*11),size,(size*3),"#653b3b");
        character[0][13] = new Rectangle((x-size*2),(y-size*10),size,size,"#653b3b");
        character[0][14] = new Rectangle((x-size*5),(y-size*10),size,(size*3),"#653b3b");
        character[0][15] = new Rectangle((x-size*4),(y-size*9),size,size,"#653b3b");
        character[0][16] = new Rectangle((x+size*2),(y-size*10),size,size,"#653b3b");
        character[0][17] = new Rectangle((x+size*2.5),(y-size*9),(size*4),size,"#653b3b");
        character[0][18] = new Rectangle((x-size*2),(y-size),(size*3),size,"RED");
        character[0][19] = new Rectangle((x-size*4),(y-size*2),size,size,"RED");
        character[0][20] = new Rectangle((x-size*5),(y-size*3),size,size,"RED");
        character[0][21] = new Rectangle((x+size*0.5),(y-size*3),(size*2),(size*3),"RED");
        character[0][22] = new Rectangle((x+size*1.5),(y-size*4),(size*2),(size*3),"RED");
        character[0][23] = new Rectangle((x-size*0.5),(y-size*5),(size*2),(size*3),"RED");
        character[0][24] = new Rectangle((x-size*2),(y-size*5),size,size,"RED");
        character[0][25] = new Rectangle((x-size),(y-size*7),size,size,"RED");
        character[0][26] = new Rectangle(x,(y-size*5),size,size,"YELLOW");
        character[0][27] = new Rectangle((x-size*1.5),(y-size*2.5),(size*2),(size*2),"#ffa64d");
        character[1][0] = new Rectangle((x+size),y,(size*3),size,"BROWN");
        character[1][1] = new Rectangle(x,(y-size),(size*3),size,"BROWN");
        character[1][2] = new Rectangle((x-size*4.5),(y-size*3),(size*2),(size*3),"BROWN");
        character[1][3] = new Rectangle((x-size*6),(y-size*1.5),size,(size*2),"BROWN");
        character[1][4] = new Rectangle((x-size*4.5),(y-size*5.5),(size*2),(size*2),"#FFA64D");
        character[1][5] = new Rectangle((x-size*6),(y-size*5),size,size,"#FFA64D");
        character[1][6] = new Rectangle((x+size),(y-size*2),(size*3),size,"RED");
        character[1][7] = new Rectangle(x,(y-size*4),(size*7),(size*3),"RED");
        character[1][8] = new Rectangle((x-size*3.5),(y-size*2.5),(size*2),(size*2),"RED");
        character[1][9] = new Rectangle((x+size*3.5),(y-size*6),(size*2),(size*3),"#FFA64D");
        character[1][10] = new Rectangle((x+size*5),(y-size*6),size,size,"#FFA64D");
        character[1][11] = new Rectangle(x,(y-size*6.5),(size*5),(size*4),"BROWN");
        character[1][12] = new Rectangle((x-size*3),(y-size*6.5),size,(size*2),"BROWN");
        character[1][13] = new Rectangle(x,(y-size*8),size,size,"RED");
        character[1][14] = new Rectangle((x+size*0.5),(y-size*7.5),size,(size*2),"RED");
        character[1][15] = new Rectangle((x-size*0.5),(y-size*11),(size*6),(size*5),"#ffa64d");
        character[1][16] = new Rectangle(x,(y-size*11),(size*9),(size*3),"#ffa64d");
        character[1][17] = new Rectangle((x+size*5),(y-size*11),size,size,"#ffa64d"); 
        character[1][18] = new Rectangle((x+size*3),(y-size*9),size,size,"#ffa64d");
        character[1][19] = new Rectangle(x,(y-size*14),(size*9),size,"RED");
        character[1][20] = new Rectangle((x-size),(y-size*15),(size*5),size,"RED");
        character[1][21] = new Rectangle((x+size),(y-size*12.5),size,(size*2),"BROWN");
        character[1][22] = new Rectangle((x-size*3),(y-size*13),(size*3),size,"#653b3b");
        character[1][23] = new Rectangle((x-size*3),(y-size*12),size,(size*3),"#653b3b");
        character[1][24] = new Rectangle((x-size*2),(y-size*11),size,size,"#653b3b");
        character[1][25] = new Rectangle((x-size*5),(y-size*11),size,(size*3),"#653b3b");
        character[1][26] = new Rectangle((x-size*4),(y-size*10),size,size,"#653b3b");
        character[1][27] = new Rectangle((x+size*2),(y-size*11),size,size,"#653b3b");
        character[1][28] = new Rectangle((x+size*2.5),(y-size*10),(size*4),size,"#653b3b");
        character[2][0] = new Rectangle((x-size*5),y,(size*3),size,"BROWN");
        character[2][1] = new Rectangle((x-size*6),(y-size*1.5),(size*3),(size*2),"BROWN");
        character[2][2] = new Rectangle((x+size*5.5),(y-size*3),(size*2),(size*3),"BROWN");
        character[2][3] = new Rectangle((x+size*6),(y-size*5),size,size,"BROWN");
        character[2][4] = new Rectangle((x-size*7),(y-size*6.5),(size*3),(size*2),"#ffa64d");
        character[2][5] = new Rectangle((x-size*7.5),(y-size*5),(size*2),size,"#ffa64d");
        character[2][6] = new Rectangle((x+size*0.5),(y-size*6.5),(size*10),(size*2),"BROWN");
        character[2][7] = new Rectangle((x-size*2),(y-size*7.5),(size*9),(size*2),"BROWN");
        character[2][8] = new Rectangle((x+size*6.5),(y-size*6.5),(size*2),(size*2),"#ffa64d");
        character[2][9] = new Rectangle((x+size*5),(y-size*7),size,size,"#ffa64d");
        character[2][10] = new Rectangle((x-size*4),(y-size*3),(size*3),(size*3),"RED");
        character[2][11] = new Rectangle((x+size*3),(y-size*3),(size*3),(size*3),"RED");
        character[2][12] = new Rectangle((x-size*0.5),(y-size*4),(size*8),(size*3),"RED");
        character[2][13] = new Rectangle((x+size*0.5),(y-size*6),(size*6),size,"RED");
        character[2][14] = new Rectangle((x-size*1.5),(y-size*7),(size*2),size,"RED");
        character[2][15] = new Rectangle((x+size*3),(y-size*7),size,size,"RED");
        character[2][16] = new Rectangle((x-size*2),(y-size*8),size,size,"RED");
        character[2][17] = new Rectangle((x+size*2),(y-size*8),size,size,"RED");
        character[2][18] = new Rectangle((x-size*6),(y-size*3),size,size,"RED");
        character[2][19] = new Rectangle((x-size*0.5),(y-size*11),(size*6),(size*5),"#ffa64d");
        character[2][20] = new Rectangle(x,(y-size*11),(size*9),(size*3),"#ffa64d");
        character[2][21] = new Rectangle((x+size*5),(y-size*11),size,size,"#ffa64d"); 
        character[2][22] = new Rectangle((x+size*3),(y-size*9),size,size,"#ffa64d");
        character[2][23] = new Rectangle((x+size),(y-size*12.5),size,(size*2),"BROWN");
        character[2][24] = new Rectangle((x-size*3),(y-size*13),(size*3),size,"#653b3b");
        character[2][25] = new Rectangle((x-size*3),(y-size*12),size,(size*3),"#653b3b");
        character[2][26] = new Rectangle((x-size*2),(y-size*11),size,size,"#653b3b");
        character[2][27] = new Rectangle((x-size*5),(y-size*11),size,(size*3),"#653b3b");
        character[2][28] = new Rectangle((x-size*4),(y-size*10),size,size,"#653b3b");
        character[2][29] = new Rectangle((x+size*2),(y-size*11),size,size,"#653b3b");
        character[2][30] = new Rectangle((x+size*2.5),(y-size*10),(size*4),size,"#653b3b");
        character[2][31] = new Rectangle(x,(y-size*14),(size*9),size,"RED");
        character[2][32] = new Rectangle((x-size),(y-size*15),(size*5),size,"RED");
        character[2][33] = new Rectangle((x+size*3),(y-size*5),size,size,"YELLOW");
        character[2][34] = new Rectangle((x-size),(y-size*5),size,size,"YELLOW");
        character[3][0] = new Rectangle((x-size*8),(y-size*4.5),(size*3),(size*2),"#ffa64d");
        character[3][1] = new Rectangle((x-size*8),(y-size*3),size,size,"#ffa64d");
        character[3][2] = new Rectangle((x+size*5.5),(y-size*13.5),(size*2),(size*2),"#ffa64d");
        character[3][3] = new Rectangle((x-size*2),(y-size*6),(size*11),(size*3),"BROWN");
        character[3][4] = new Rectangle((x-size*8),(y-size*6),size,size,"BROWN");
        character[3][5] = new Rectangle((x+size*5.5),(y-size*11),(size*2),(size*3),"BROWN");
        character[3][6] = new Rectangle((x+size*5),(y-size*9),size,size,"BROWN");
        character[3][7] = new Rectangle((x+size*4),(y-size*8),size,size,"BROWN");
        character[3][8] = new Rectangle((x+size*5.5),(y-size*3),(size*2),(size*3),"BROWN");
        character[3][9] = new Rectangle((x+size*6),(y-size*5),size,size,"BROWN");
        character[3][10] = new Rectangle((x-size*6.5),(y-size*1.5),(size*2),(size*2),"BROWN");
        character[3][11] = new Rectangle((x-size*5.5),(y-size*2.5),(size*2),(size*2),"BROWN");
        character[3][12] = new Rectangle((x-size*7.5),(y-size*0.5),size,(size*2),"BROWN");
        character[3][13] = new Rectangle((x-size*3.5),y,(size*4),size,"RED");
        character[3][14] = new Rectangle((x-size*2),(y-size),(size*7),size,"RED");
        character[3][15] = new Rectangle(x,(y-size*3),(size*9),(size*3),"RED");
        character[3][16] = new Rectangle((x+size),(y-size*5),(size*5),size,"RED");
        character[3][17] = new Rectangle((x-size),(y-size*6),size,size,"RED");
        character[3][18] = new Rectangle((x+size*3),(y-size*6),size,size,"RED");
        character[3][19] = new Rectangle((x-size*2),(y-size*7),size,size,"RED");
        character[3][20] = new Rectangle((x+size*2),(y-size*7),size,size,"RED");
        character[3][21] = new Rectangle((x-size*5),(y-size*3.5),size,(size*2),"RED");
        character[3][22] = new Rectangle(x,(y-size*4),size,size,"YELLOW");
        character[3][23] = new Rectangle((x+size*3),(y-size*4),size,size,"YELLOW");
        character[3][24] = new Rectangle((x-size*3),(y-size*4),size,size,"BROWN");
        character[3][25] = new Rectangle((x-size*0.5),(y-size*10),(size*6),(size*5),"#ffa64d");
        character[3][26] = new Rectangle(x,(y-size*10),(size*9),(size*3),"#ffa64d");
        character[3][27] = new Rectangle((x+size*5),(y-size*10),size,size,"#ffa64d"); 
        character[3][28] = new Rectangle((x+size*3),(y-size*8),size,size,"#ffa64d");
        character[3][29] = new Rectangle((x+size),(y-size*11.5),size,(size*2),"BROWN");
        character[3][30] = new Rectangle((x-size*3),(y-size*12),(size*3),size,"#653b3b");
        character[3][31] = new Rectangle((x-size*3),(y-size*11),size,(size*3),"#653b3b");
        character[3][32] = new Rectangle((x-size*2),(y-size*10),size,size,"#653b3b");
        character[3][33] = new Rectangle((x-size*5),(y-size*10),size,(size*3),"#653b3b");
        character[3][34] = new Rectangle((x-size*4),(y-size*9),size,size,"#653b3b");
        character[3][35] = new Rectangle((x+size*2),(y-size*10),size,size,"#653b3b");
        character[3][36] = new Rectangle((x+size*2.5),(y-size*9),(size*4),size,"#653b3b");
        character[3][37] = new Rectangle(x,(y-size*13),(size*9),size,"RED");
        character[3][38] = new Rectangle((x-size),(y-size*14),(size*5),size,"RED");
        visualise(curBario[curBarioCounter]);
    }
}
