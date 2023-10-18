import greenfoot.*;  

public class Dado extends Actor
{
    private int resultado = 3;
    private boolean teclaPresionada = false;
    
    
    public Dado(){
       updateImage();
    }

    public void act()
    {
        MyWorld myworld = (MyWorld) getWorld();
        
        if (Greenfoot.mouseClicked(this) && (getWorld().getObjects(Pregunta.class).size() == 0)) {
            resultado = Greenfoot.getRandomNumber(3);
            updateImage();
            cambiarPosicion();
            teclaPresionada = true;
        }
    }
    
    
    public void updateImage()
    {
        if (resultado == 0){
        GreenfootImage newImage = new GreenfootImage("dado1.jpg");
        setImage(newImage);}
        if (resultado == 1){
        GreenfootImage newImage = new GreenfootImage("dado2.jpg");
        setImage(newImage);}
        if (resultado == 2){
        GreenfootImage newImage = new GreenfootImage("dado3.jpg");
        setImage(newImage);} 
        if (resultado == 3){
        GreenfootImage newImage = new GreenfootImage("dado0.jpg");
        setImage(newImage);} 
    }
        

    public void cambiarPosicion(){
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld) getWorld();
            Astronauta astronauta = myWorld.getObjects(Astronauta.class).get(0); // Obtener la instancia de Astronauta
            astronauta.setValor(astronauta.getValor() + resultado + 1);
            
            MyWorld myworld = (MyWorld) getWorld();
            myworld.generarPregunta(astronauta.getValor());
            
        }
        

    }

    public int getResultado(){
        return resultado;
    }


}

