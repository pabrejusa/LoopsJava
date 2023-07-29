//Parte 2: Bucles Do While
//Cree una nueva clase de Java con un método principal (para que pueda ejecutar su código) llamado Fibonacci
//
//Los números de Fibonacci son un problema informático tradicional: "cada número es la suma de los dos anteriores, empezando por 0 y 1".
//
//El comienzo de la secuencia es así:
//
//0 1 1 2 3 5 8 13 21 34 55 89 ...
//
//Agregue la siguiente importación para poder capturar la entrada del usuario n
//
//  import java.util.Scanner;
//Implementar un bucle Do While que calcule Fibonacci(n)
//
//norte	Fibonacci(n)
//0	0
//1	1
//2	1
//3	2
//4	3
//5	5
//6	8
//7	13
//...	...
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0);
		System.out.println(1);
        int num1= 0;
		int num2= 1;
			do {
				int res = (num1 + num2); 
				System.out.println(res);
				num1 = num2;
				num2 = res;
			} while (num1 <=100);

	}//main

}//Fibonacci
