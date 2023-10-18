import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    private int valor;
    
    public Boton(int valor){
        this.valor = valor; //1 = and  2=or  3=xor  4=nand  5=nor ,
        
        if (valor == 1){
            this.setImage("and.png");
        }
        if (valor == 2){
            this.setImage("or.png");
        }
        if (valor == 3){
            this.setImage("xor.png");
        }
        if (valor == 4){
            this.setImage("nand.png");
        }
        if (valor == 5){
            this.setImage("nor.png");
        }
        
    }

    public void act()
    {
        tocar();
        borrar();
       
    }
    
    public void borrar() {
        if (Greenfoot.isKeyDown("space")) {
            World world = getWorld();
            world.removeObject(this);
        }
    }

    
    public void tocar(){
        if (Greenfoot.mouseClicked(this)) {
            
        }
    
    }
    
    }
