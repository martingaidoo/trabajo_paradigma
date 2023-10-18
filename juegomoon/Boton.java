import greenfoot.*;  
public class Boton extends Actor
{
    private int valor;
    private boolean botonClickeado; 
    private int numColumna; 
    
    public Boton(int valor){
        this.valor = valor; //1 = and  2=or  3=xor  4=nand  5=nor ,
        
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
    
    public void setbotonClickeado(){
        botonClickeado = false;
    }
    
    
    }
