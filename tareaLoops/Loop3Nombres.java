////Parte 3: Para bucles
//Use el ciclo for para crear un programa que le pida al usuario que ingrese un nombre y luego imprima cada una de las letras del nombre
//Sugerencia Puede utilizar las siguientes funciones de cadena:
//
//length() -> devuelve el número total de caracteres de una cadena dada
//chartAt(i) -> devuelve el carácter en la posición dada ( i ) de una cadena

import java.util.Scanner;

public class Loop3Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String name = console.next();
        int res = name.length();
        
        	for (int letra = 0; letra < res; letra ++) {
        		System.out.println(name.charAt(letra));
        	}//for
	
	
		console.close();
        //TODO implement this code
    }//main

	}//Loop3Nombres


