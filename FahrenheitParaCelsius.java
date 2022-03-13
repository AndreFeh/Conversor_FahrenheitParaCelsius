package git;
import java.util.Scanner;

public class FahrenheitParaCelsius {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Qual a temperatura em F°: ");
			float fahrenheit = scan.nextFloat();
//			A base do Fahrenheit é 32 = 0 Graus Celsius
				float conversaoC = ((fahrenheit - 32)* 5/9);
			
				System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " F°" + "\n" + "Convertida em Graus: " + conversaoC +" C°");
	}
}
