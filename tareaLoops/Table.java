//Abra su IDE y cree una nueva clase de Java llamada Table
//Copie el siguiente código en su tabla de clase Java y verifique que funcione
//	import java.util.Scanner;
//
//	public class Table
//	{
//	    public static void main(String[] args)
//	    {
//	        Scanner console = new Scanner(System.in);
//	        int num;
//	        
//	        System.out.print("Enter any positive integer: ");
//	        num = console.nextInt();
//	                
//	        System.out.println("Multiplication Table of " + num);
//	        
//	       //TODO implement While loop to get print result
//	    }
//	}
//Implemente un bucle while que imprima la tabla de multiplicar del número de entrada dado.
import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        //TODO implement While loop to get print result
        int mult= 0;
        while (mult <= 10) {
        	 System.out.println();
        	System.out.println(num + "x" + mult + "=" + (num*mult));
        	mult ++;
        }//while
}//main

}//Table