import greenfoot.*; 
import java.util.List;
public class MyWorld extends World
{
    int correctas;
    int errores;
    private int scrollSpeed = 1;
    public MyWorld()
    {    
        super(1000, 600, 1); 
        correctas = 0;
        errores = 0;
        
        GreenfootImage fondo = new GreenfootImage("fondo.png");
        setBackground(fondo);
        Mars mars = new Mars();
        addObject(mars, 930,300);
        generarTablero();
        
        Astronauta astronauta = new Astronauta();
        addObject(astronauta, 38, 325);
        
        Dado dado = new Dado();
        addObject(dado, 870,85);
        
        showText("Correctas: " + correctas, 800, 400);
        showText("Errores: " + errores, 800, 500);
        
    }
    
    public void act(){
        scrollFondo();
    
    }
    
    private void generarTablero(){
        int cantCasilleros;
        int coordX; 
        int coordY; 
        cantCasilleros = 0; 
        coordX = 38;
        coordY = 325;
        
        while (cantCasilleros<64){
            addObject(new Casillero(cantCasilleros), coordX, coordY);
            //showText(Integer.toString(cantCasilleros), coordX,coordY);
            if ((-1 <= cantCasilleros && cantCasilleros < 2) ||
                (7 <= cantCasilleros && cantCasilleros < 9) ||
                (10 <= cantCasilleros && cantCasilleros < 12) ||
                (24 <= cantCasilleros && cantCasilleros < 29) ||
                (33 <= cantCasilleros && cantCasilleros < 35) ||
                (39 <= cantCasilleros && cantCasilleros < 41) ||
                (52 <= cantCasilleros && cantCasilleros < 54) ||
                (55 <= cantCasilleros && cantCasilleros < 57) ||
                (59 <= cantCasilleros && cantCasilleros < 62)) {
                coordX += 52;
            } else if ((2 <= cantCasilleros && cantCasilleros < 7) ||
                (29 <= cantCasilleros && cantCasilleros < 33) ||
                (41 <= cantCasilleros && cantCasilleros < 47) ||
                (49 <= cantCasilleros && cantCasilleros < 52)){
                coordY -= 52;
            }else if ((14 <= cantCasilleros && cantCasilleros < 16) ||
                (20 <= cantCasilleros && cantCasilleros < 22) ||
                (47 <= cantCasilleros && cantCasilleros < 49)){
                coordX -= 52;
            }else if ((9 <= cantCasilleros && cantCasilleros < 10) ||
                (12 <= cantCasilleros && cantCasilleros < 14) ||
                (16 <= cantCasilleros && cantCasilleros < 20) ||
                (22 <= cantCasilleros && cantCasilleros < 24) ||
                (35 <= cantCasilleros && cantCasilleros < 39) ||
                (54 <= cantCasilleros && cantCasilleros < 55) ||
                (57 <= cantCasilleros && cantCasilleros < 59) ||
                (62 <= cantCasilleros && cantCasilleros < 64)){
                coordY += 52;
            }    
            cantCasilleros++;
        }
    }
    
    public void generarPregunta(int posicion){
        Pregunta pregunta = new Pregunta(posicion);
        addObject(pregunta, 500, 300);
        pregunta.procesoPregunta();
           
    }
    
    
    public void removerActor(Actor cualquiera){
        removeObject(cualquiera);
    }
        
    public void sumarError(){
        errores = errores + 1;
        showText("Correctas: " + correctas, 800, 400);
        showText("Errores: " + errores, 800, 500);
    }
    
    public void sumarCorrecto(){
        correctas = correctas + 1;
        showText("Correctas: " + correctas, 800, 400);
        showText("Errores: " + errores, 800, 500);
    }
    
    private void scrollFondo()
    {
        GreenfootImage fondo = getBackground();
        int anchoMundo = getWidth();
        int x = fondo.getWidth() - scrollSpeed;
        
        if (x <= 0) {
            // Reiniciar la posición del fondo
            x = anchoMundo;
        }
        
        fondo.drawImage(fondo, x, 0);
        fondo.drawImage(fondo, x - fondo.getWidth(), 0);
    }
}
