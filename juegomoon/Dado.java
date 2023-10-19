import greenfoot.*;  

public class Dado extends Actor
{
    private int resultadoDado = 0;
    private boolean teclaPresionada = false;
    
    
    public Dado(){
       updateImage();
    }

    public void act()
    {
        MyWorld myWorld = (MyWorld) getWorld();
        Astronauta astronauta = myWorld.getObjects(Astronauta.class).get(0);
        
        if (Greenfoot.mouseClicked(this) && (getWorld().getObjects(Pregunta.class).size() == 0)) {
            resultadoDado = Greenfoot.getRandomNumber(4) ;
            updateImage();
            cambiarPosicion(resultadoDado);
            
            myWorld.generarPregunta(astronauta.getValor());
            teclaPresionada = true;
        }
    }
    
    public void updateImage()
    {
        if (resultadoDado == 0){
            GreenfootImage newImage = new GreenfootImage("dado0.png");
            setImage(newImage);
        }
        if (resultadoDado == 1){
            GreenfootImage newImage = new GreenfootImage("dado1.png");
            setImage(newImage);
        }
        if (resultadoDado == 2){
            GreenfootImage newImage = new GreenfootImage("dado2.png");
            setImage(newImage);
        } 
        if (resultadoDado == 3){
            GreenfootImage newImage = new GreenfootImage("dado3.png");
            setImage(newImage);
        } 
    }
        
    public void cambiarPosicion(int casillasMoverse){
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld) getWorld();
            Astronauta astronauta = myWorld.getObjects(Astronauta.class).get(0); // Obtener la instancia de Astronauta
            
            if ((astronauta.getValor() + casillasMoverse)>63){
                System.out.println("ganaste"); 
            }else{
                astronauta.setValor(astronauta.getValor() + casillasMoverse);
            }
            
        }
    }

    public int getResultado(){
        return resultadoDado;
    }


}

