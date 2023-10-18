import greenfoot.*;  

public class NumeroBinario extends Actor
{
    private int valor;
    
    public NumeroBinario(int valor){
        this.valor = valor; 
        
        if (valor == 0){
        this.setImage("binario0.png");
        }
        if (valor == 1){
        this.setImage("binario1.png");
        }
        
    }
    
    public void act()
    {
        borrar();
    }
    
    public void borrar(){
        if (Greenfoot.isKeyDown("space")){
            MyWorld myworld = (MyWorld) getWorld();
            myworld.removerActor(this); 
        }
            
    }  
}
