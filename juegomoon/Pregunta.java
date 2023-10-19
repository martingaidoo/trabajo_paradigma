import greenfoot.*; 
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Pregunta extends Actor
{
    String resultadoBotones;
    String posicionAstronauta;
    ArrayList<Boton> columna1;
    ArrayList<Boton> columna2;
    ArrayList<Boton> columna3;
    ArrayList<Boton> columna4;
    ArrayList<Boton> columna5;
    ArrayList<Boton> columna6;
    
    public Pregunta(int posicionAstronauta){
        this.posicionAstronauta = Integer.toString(posicionAstronauta);
        resultadoBotones = "000000";
    }
    
    public void act()
    {
        borrar();
        responder();
    }
    
    public void responder(){
        if (Greenfoot.isKeyDown("\n")){
            resultadoBotones();
        }
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
        
        columna1 = new ArrayList<Boton>();
        
        Boton boton11 = new Boton(1,1);
        myworld.addObject(boton11, coordX, coordY);
        columna1.add(boton11);
        
        Boton boton12 = new Boton(2,1);
        myworld.addObject(boton12, coordX, coordY +60);
        columna1.add(boton12);
        
        Boton boton13 = new Boton(3,1);
        myworld.addObject(boton13, coordX, coordY +120);
        columna1.add(boton13);
        
        Boton boton14 = new Boton(4,1);
        myworld.addObject(boton14, coordX, coordY +180);
        columna1.add(boton14);
        
        Boton boton15 = new Boton(5,1);
        myworld.addObject(boton15, coordX, coordY +240);
        columna1.add(boton15);
        
        columna2 = new ArrayList<Boton>();
        Boton boton21 = new Boton(1,2);
        myworld.addObject(boton21, coordX+60, coordY);
        columna2.add(boton21);
        
        Boton boton22 = new Boton(2,2);
        myworld.addObject(boton22, coordX+60, coordY +60);
        columna2.add(boton22);
        
        Boton boton23 = new Boton(3,2);
        myworld.addObject(boton23, coordX+60, coordY +120);
        columna2.add(boton23);
        
        Boton boton24 = new Boton(4,2);
        myworld.addObject(boton24, coordX+60, coordY +180);
        columna2.add(boton24);
        
        Boton boton25 = new Boton(5,2);
        myworld.addObject(boton25, coordX +60, coordY +240);
        columna2.add(boton25);
        
        
        columna3 = new ArrayList<Boton>();
        Boton boton31 = new Boton(1,3);
        myworld.addObject(boton31, coordX+120, coordY);
        columna3.add(boton31);
        
        Boton boton32 = new Boton(2,3);
        myworld.addObject(boton32, coordX+120, coordY +60);
        columna3.add(boton32);
        
        Boton boton33 = new Boton(3,3);
        myworld.addObject(boton33, coordX+120, coordY +120);
        columna3.add(boton33);
        
        Boton boton34 = new Boton(4,3);
        myworld.addObject(boton34, coordX+120, coordY +180);
        columna3.add(boton34);
        
        Boton boton35 = new Boton(5,3);
        myworld.addObject(boton35, coordX +120, coordY +240);
        columna3.add(boton35);
        
        
        columna4 = new ArrayList<Boton>();
        Boton boton41 = new Boton(1,4);
        myworld.addObject(boton41, coordX+180, coordY);
        columna4.add(boton41);
        
        Boton boton42 = new Boton(2,4);
        myworld.addObject(boton42, coordX+180, coordY +60);
        columna4.add(boton42);
        
        Boton boton43 = new Boton(3,4);
        myworld.addObject(boton43, coordX+180, coordY +120);
        columna4.add(boton43);
        
        Boton boton44 = new Boton(4,4);
        myworld.addObject(boton44, coordX+180, coordY +180);
        columna4.add(boton44);
        
        Boton boton45 = new Boton(5,4);
        myworld.addObject(boton45, coordX +180, coordY +240);
        columna4.add(boton45);
        
        columna5 = new ArrayList<Boton>();
        Boton boton51 = new Boton(1,5);
        myworld.addObject(boton51, coordX+240, coordY);
        columna5.add(boton51);
        
        Boton boton52 = new Boton(2,5);
        myworld.addObject(boton52, coordX+240, coordY +60);
        columna5.add(boton52);
        
        Boton boton53 = new Boton(3,5);
        myworld.addObject(boton53, coordX+240, coordY +120);
        columna5.add(boton53);
        
        Boton boton54 = new Boton(4,5);
        myworld.addObject(boton54, coordX+240, coordY +180);
        columna5.add(boton54);
        
        Boton boton55 = new Boton(5,5);
        myworld.addObject(boton55, coordX +240, coordY +240);
        columna5.add(boton55);
        
        columna6 = new ArrayList<Boton>();
        Boton boton61 = new Boton(1,6);
        myworld.addObject(boton61, coordX+300, coordY);
        columna6.add(boton61);
        
        Boton boton62 = new Boton(2,6);
        myworld.addObject(boton62, coordX+300, coordY +60);
        columna6.add(boton62);
        
        Boton boton63 = new Boton(3,6);
        myworld.addObject(boton63, coordX+300, coordY +120);
        columna6.add(boton63);
        
        Boton boton64 = new Boton(4,6);
        myworld.addObject(boton64, coordX+300, coordY +180);
        columna6.add(boton64);
        
        Boton boton65 = new Boton(5,6);
        myworld.addObject(boton65, coordX +300, coordY +240);
        columna6.add(boton65);
        

    
        
    }
    

    public void seleccionarBoton(int numero) {
        
        ArrayList<Boton> columnaSeleccionada = null;
    
        // Determina la columna adecuada según el valor de 'numero'
        if (numero == 1) {
            columnaSeleccionada = columna1;
        } else if (numero == 2) {
 
            columnaSeleccionada = columna2;
        } else if (numero == 3) {

            columnaSeleccionada = columna3;
        } else if (numero == 4) {
            columnaSeleccionada = columna4;
        } else if (numero == 5) {

            columnaSeleccionada = columna5;
        } else if (numero == 6) {
            columnaSeleccionada = columna6;
        }
        
        if (columnaSeleccionada != null) {

            for (int i = 0; i < columnaSeleccionada.size(); i++) {
                columnaSeleccionada.get(i).setbotonClickeado();
            }
        }
        
    }

    
    public void resultadoBotones(){
        
        resultadoBotones = "";
        for (int i = 0; i < columna1.size(); i++) {
            if (columna1.get(i).getBotonClickeado()== true){
            resultadoBotones = resultadoBotones + (i+1);
            }
        }
        for (int i = 0; i < columna2.size(); i++) {
            if (columna2.get(i).getBotonClickeado()== true){
            resultadoBotones = resultadoBotones + (i+1);
            }
        }
        for (int i = 0; i < columna3.size(); i++) {
            if (columna3.get(i).getBotonClickeado()== true){
            resultadoBotones = resultadoBotones + (i+1);
            }
        }
        for (int i = 0; i < columna4.size(); i++) {
            if (columna4.get(i).getBotonClickeado()== true){
            resultadoBotones = resultadoBotones + (i+1);
            }
        }
        for (int i = 0; i < columna5.size(); i++) {
            if (columna5.get(i).getBotonClickeado()== true){
            resultadoBotones = resultadoBotones + (i+1);
            }
        }
        for (int i = 0; i < columna6.size(); i++) {
            if (columna6.get(i).getBotonClickeado()== true){
            resultadoBotones = resultadoBotones + (i+1);
            }
        }
        System.out.println(resultadoBotones);
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

