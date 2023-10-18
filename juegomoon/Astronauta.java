import greenfoot.*; 
public class Astronauta extends Actor
{
    GreenfootImage nuevaImage = new GreenfootImage("astronauta.png");
    private int valor;
    
    public Astronauta(){
        nuevaImage.scale(50,50);  
        setImage(nuevaImage);
        valor = 0;
    }
 
    public void act()
    {
        cambiarPosicion();
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void cambiarPosicion(){
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld) getWorld();
            Casillero casilla = myWorld.getObjects(Casillero.class).get(valor);  
            setLocation(casilla.getX(),casilla.getY());
            
        }
    }
}
