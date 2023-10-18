import greenfoot.*;  


public class Casillero extends Actor
{  //atributos
    private int valor;
    private int giro;
    
    public Casillero(int valor){
        this.valor = valor;   //el valor que va a tener dependiendo de la posicion
        this.giro = Greenfoot.getRandomNumber(6)+1; //genera un numero random para hacerlo girar 
    }
    public void act()
    {
        this.turn(giro); //hace girar los asteroides
    }
    
    
    
}
