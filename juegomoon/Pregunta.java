import greenfoot.*; 
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
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
            }else if(cantDigitos==6 || cantDigitos==12 || cantDigitos==18){
                coordX-=300;
                coordY+=60;
            }
            
            cantDigitos++;
        }
        
        ArrayList<Boton> columna1 = new ArrayList<>();
        Boton boton11 = new Boton(1);
        myworld.addObject(boton11, coordX, coordY);
        columna1.add(boton11);
        
        Boton boton12 = new Boton(2);
        myworld.addObject(boton12, coordX, coordY +60);
        columna1.add(boton12);
        
        Boton boton13 = new Boton(3);
        myworld.addObject(boton13, coordX, coordY +120);
        columna1.add(boton13);
        
        Boton boton14 = new Boton(4);
        myworld.addObject(boton14, coordX, coordY +180);
        columna1.add(boton14);
        
        Boton boton15 = new Boton(5);
        myworld.addObject(boton15, coordX, coordY +240);
        columna1.add(boton15);
        
        ArrayList<Boton> columna2 = new ArrayList<>();
        Boton boton21 = new Boton(1);
        myworld.addObject(boton21, coordX+60, coordY);
        columna1.add(boton21);
        
        Boton boton22 = new Boton(2);
        myworld.addObject(boton22, coordX+60, coordY +60);
        columna1.add(boton22);
        
        Boton boton23 = new Boton(3);
        myworld.addObject(boton23, coordX+60, coordY +120);
        columna1.add(boton23);
        
        Boton boton24 = new Boton(4);
        myworld.addObject(boton24, coordX+60, coordY +180);
        columna1.add(boton24);
        
        Boton boton25 = new Boton(5);
        myworld.addObject(boton25, coordX +60, coordY +240);
        columna1.add(boton25);
        
        
        ArrayList<Boton> columna3 = new ArrayList<>();
        Boton boton31 = new Boton(1);
        myworld.addObject(boton31, coordX+120, coordY);
        columna1.add(boton31);
        
        Boton boton32 = new Boton(2);
        myworld.addObject(boton32, coordX+120, coordY +60);
        columna1.add(boton32);
        
        Boton boton33 = new Boton(3);
        myworld.addObject(boton33, coordX+120, coordY +120);
        columna1.add(boton33);
        
        Boton boton34 = new Boton(4);
        myworld.addObject(boton34, coordX+120, coordY +180);
        columna1.add(boton34);
        
        Boton boton35 = new Boton(5);
        myworld.addObject(boton35, coordX +120, coordY +240);
        columna1.add(boton35);
        
        
        ArrayList<Boton> columna4 = new ArrayList<>();
        Boton boton41 = new Boton(1);
        myworld.addObject(boton41, coordX+180, coordY);
        columna1.add(boton41);
        
        Boton boton42 = new Boton(2);
        myworld.addObject(boton42, coordX+180, coordY +60);
        columna1.add(boton42);
        
        Boton boton43 = new Boton(3);
        myworld.addObject(boton43, coordX+180, coordY +120);
        columna1.add(boton43);
        
        Boton boton44 = new Boton(4);
        myworld.addObject(boton44, coordX+180, coordY +180);
        columna1.add(boton44);
        
        Boton boton45 = new Boton(5);
        myworld.addObject(boton45, coordX +180, coordY +240);
        columna1.add(boton45);
        
        ArrayList<Boton> columna5 = new ArrayList<>();
        Boton boton51 = new Boton(1);
        myworld.addObject(boton51, coordX+240, coordY);
        columna1.add(boton51);
        
        Boton boton52 = new Boton(2);
        myworld.addObject(boton52, coordX+240, coordY +60);
        columna1.add(boton52);
        
        Boton boton53 = new Boton(3);
        myworld.addObject(boton53, coordX+240, coordY +120);
        columna1.add(boton53);
        
        Boton boton54 = new Boton(4);
        myworld.addObject(boton54, coordX+240, coordY +180);
        columna1.add(boton54);
        
        Boton boton55 = new Boton(5);
        myworld.addObject(boton55, coordX +240, coordY +240);
        columna1.add(boton55);
        
        ArrayList<Boton> columna6 = new ArrayList<>();
        Boton boton61 = new Boton(1);
        myworld.addObject(boton61, coordX+300, coordY);
        columna1.add(boton61);
        
        Boton boton62 = new Boton(2);
        myworld.addObject(boton62, coordX+300, coordY +60);
        columna1.add(boton62);
        
        Boton boton63 = new Boton(3);
        myworld.addObject(boton63, coordX+300, coordY +120);
        columna1.add(boton63);
        
        Boton boton64 = new Boton(4);
        myworld.addObject(boton64, coordX+300, coordY +180);
        columna1.add(boton64);
        
        Boton boton65 = new Boton(5);
        myworld.addObject(boton65, coordX +300, coordY +240);
        columna1.add(boton65);
        
        seleccionarBoton(columna1);
        
    
        
        
        
    }
    

    public void seleccionarBoton(ArrayList<Boton> columna){
        for (int i=0; i<=columna.size();i++){
            columna.get(i).setbotonClickeado();
        }
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

