import greenfoot.*; 
import java.util.Random;
import java.util.List;
public class Pregunta extends Actor
{
    
    String posicionAstronauta;
    
    public void act()
    {
        borrar();
    }
    
    public Pregunta(int posicionAstronauta){
        this.posicionAstronauta = Integer.toString(posicionAstronauta);
    }
    
    public void borrar(){
        if (Greenfoot.isKeyDown("space")){
            MyWorld myworld = (MyWorld) getWorld();
            myworld.removerActor(this); 
        }
            
    }

    
    public void generarTableroDeNumeros(String num1, String num2, String posicionAstronauta)
    {
        MyWorld myworld = (MyWorld) getWorld();  
                
        int cantDigitos;
        int coordX; 
        int coordY;
        int punteroDeNumero;
        
        cantDigitos = 1; 
        coordX = 350;
        coordY = 80;
        
        String numerosPegados = num1 + num2 + posicionAstronauta;   
        
        while(cantDigitos<=18)
        
        {
            myworld.addObject(new NumeroBinario(Integer.parseInt(numerosPegados.substring(cantDigitos-1, cantDigitos))), coordX, coordY);
            if ((1 <= cantDigitos && cantDigitos < 6) ||
                (7 <= cantDigitos && cantDigitos < 12) ||
                (13 <= cantDigitos && cantDigitos < 18)){
                coordX+=60;
            }else if(cantDigitos==6 || cantDigitos==12){
                coordX-=300;
                coordY+=60;
            }
            
            cantDigitos++;
        }
        ColumnaSeleccion columna1 = new ColumnaSeleccion();
        myworld.addObject(columna1,200,200);
    }
    

    
    public void procesoPregunta(){
        int numCasilla;
        String entradaSeleccionada;
        
        MyWorld myworld = (MyWorld) getWorld(); 
        Astronauta astronauta = myworld.getObjects(Astronauta.class).get(0);
        Dado dado = myworld.getObjects(Dado.class).get(0);
        
        numCasilla = astronauta.getValor();
        
        entradaSeleccionada = "111111";
        
        
        preguntar(numCasilla, dado.getResultado(), entradaSeleccionada);
        
        
    }
    
    public int preguntar(int numCasilla,int valorDado, String cadenaEntrada) {
        String cadenaNumCasilla = String.format("%6s", Integer.toBinaryString(numCasilla)).replace(' ', '0');
        int num1 = Greenfoot.getRandomNumber(numCasilla);
        String cadenaNum1 = String.format("%6s", Integer.toBinaryString(num1)).replace(' ', '0');
        int num2 = Greenfoot.getRandomNumber(numCasilla);
        String cadenaNum2 = String.format("%6s", Integer.toBinaryString(num2)).replace(' ', '0');
        int dado = valorDado;
        generarTableroDeNumeros(cadenaNum1,cadenaNum2,cadenaNumCasilla); 
        
        int[][] matrizDeOperaciones = new int[4][6];
        matrizDeOperaciones[0] = guardarBinarioEnUnaFila(cadenaNum1);
        matrizDeOperaciones[1] = guardarBinarioEnUnaFila(cadenaNum2);
        matrizDeOperaciones[2] = guardarBinarioEnUnaFila(cadenaNumCasilla);
        matrizDeOperaciones[3] = guardarBinarioEnUnaFila(cadenaEntrada);

        int i = 0;
        boolean resultadoFinal = true;
        while (i < 6 && resultadoFinal) {
            resultadoFinal = verificarRespuestaPorColumnas(matrizDeOperaciones[0][i], matrizDeOperaciones[1][i],
                    matrizDeOperaciones[2][i], matrizDeOperaciones[3][i]);
            i++;
        }

        dado = resultadoFinal ? 1 : -1;
        return dado;
    }

    public static int[] guardarBinarioEnUnaFila(String numBinario) {
        int[] fila = new int[numBinario.length()];
        for (int i = 0; i < numBinario.length(); i++) {
            fila[i] = Character.getNumericValue(numBinario.charAt(i));
        }
        return fila;
    }

    public static boolean verificarRespuestaPorColumnas(int digitoNum1, int digitoNum2, int digitoNumC, int digitoOP) {
        boolean resultado = false;
        if (digitoOP == 1) {
            resultado = (digitoNum1 & digitoNum2) == digitoNumC;
        } else if (digitoOP == 2) {
            resultado = (digitoNum1 | digitoNum2) == digitoNumC;
        } else if (digitoOP == 3) {
            resultado = ((digitoNum1 & ~digitoNum2) | (~digitoNum1 & digitoNum2)) == digitoNumC;
        } else if (digitoOP == 4) {
            resultado = ~(digitoNum1 & digitoNum2) == digitoNumC;
        } else if (digitoOP == 5) {
            resultado = ~(digitoNum1 | digitoNum2) == digitoNumC;
        }
        return resultado;
    }
}

