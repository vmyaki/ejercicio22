import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaramos variables
		int num1,num2,suma=0;
		
		//Pedir por teclado1
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		num1=teclado.nextInt();
		System.out.println("Introduce un número:");
		num2=teclado.nextInt();
			
		if(num1<num2) //Si el n1 es menor que el n2
		{
			while(num1<=num2) 
			{
				suma=suma+num1;
				num1++; // prueba comentario
			}
			
			System.out.println("La suma de los números es: "+suma);
		}
		else //Si el n1 es mayor que el n2
		{
			while(num1>=num2)
			{
				suma=suma+num1;
				num1--;
			}
			
			System.out.println("La suma de los números es: "+suma);
		}
		
		
	}

}
