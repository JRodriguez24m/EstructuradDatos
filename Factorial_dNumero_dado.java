package Factoria_dNumero_dado;
import java.util.*;

public class Main {
	public static int f(int num) {
		if (num==0) {
			return 1;
			
		}else {
			return num*f(num-1);
		}
	}
	public static int fact(int num) {
		int fa=1;
		for (int i = num; i > 0; i--) {
			fa=fa*i;
		}
		return fa;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Calcular Factorial.\r\nIngrese el número a calcular factorial: ");
		int num = sc.nextInt();
			
		System.out.println(" Resultado (iterativo): "+fact(num)+"\r Resultado (Recursivo): "+f(num));
		
	}
	
}
