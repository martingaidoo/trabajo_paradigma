import greenfoot.*;  
public class Boton extends Actor
{
    private int valor;
    private boolean botonClickeado; 
    private int numColumna;
    
    public Boton(int valor, int numColumna){
        this.valor = valor; //1 = and  2=or  3=xor  4=nand  5=nor ,
        this.numColumna = numColumna; // numero de la columna la cual pertenece
        this.setImage("botonesSinSelec/" + valor + ".png");
        
        
    }

    public void act()
    {
        tocar();
        borrar();
        estado();
       
    }
    
    public void borrar() {
        if (Greenfoot.isKeyDown("space")) {
            World world = getWorld();
            world.removeObject(this);
        }
    }

    
    public void tocar(){
        if (Greenfoot.mouseClicked(this)){
            MyWorld myworld = (MyWorld) getWorld();
            Pregunta pregunta = myworld.getObjects(Pregunta.class).get(0);
            pregunta.seleccionarBoton(numColumna);
            botonClickeado = true;
            
        }
    }        
    public void estado(){
        if (botonClickeado){
        this.setImage("botonesSelec/" + valor + ".png");
        }
        else{
            this.setImage("botonesSinSelec/" + valor + ".png");
        }
    }
    
    
    
    public boolean getBotonClickeado(){
        return botonClickeado;
    }
    
    
    public void setbotonClickeado(){
        this.botonClickeado = false;
    }
    
}
