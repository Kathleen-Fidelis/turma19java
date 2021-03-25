package Exemplo;

import java.util.Scanner;

public class TemperaturaFahrenheint {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double celsius;
		double fahrenheit;
		
		System.out.println("Digite a temperatura em Celsius");
		celsius = leia.nextDouble();
				
		fahrenheit = ((celsius * 1.8) + 32);
		
		System.out.println("A temperatura em graus Celsius é: " + celsius);
		System.out.printf("A temperatura em Fahrenheit é: %.2f  " + fahrenheit);
	}

}
