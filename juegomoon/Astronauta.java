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
        cambiarPosicion();// Add your action code here.
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    
       /**
     * El metodo cambiarPosicion, lo que hara es conseguir el objeto MyWorld, 
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void cambiarPosicion(){
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld) getWorld();
            Casillero casilla = myWorld.getObjects(Casillero.class).get(valor); // Obtener la instancia de Astronauta
            setLocation(casilla.getX(),casilla.getY());
            
        }
    }
}
