import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ColumnaSeleccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColumnaSeleccion extends Actor
{

    public ColumnaSeleccion(){
        

    }
    
    public void act()
    {
        
        
    
    }
    
    public void generarBotones(int direccionX, int direccionY){
        World world = getWorld();
        world.addObject(new Boton(1), direccionX, direccionY);
        world.addObject(new Boton(2), direccionX, direccionY+ 60);
        world.addObject(new Boton(3), direccionX, direccionY+ 120);
        world.addObject(new Boton(4), direccionX, direccionY+180);
        world.addObject(new Boton(5), direccionX, direccionY+240);
    }
}
