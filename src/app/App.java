package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,b;
		System.out.println("Ingrese un número entero");
		n=s.nextInt();
		System.out.println("Ingresa la base");
		b=s.nextInt();
		System.out.println(n+" en base "+ b+" es: "+base(n,b));
	}
	
	public static String base(int n, int b)
	 {
		char[]digitos= new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		 if(n != 0)
		 {
			return base(n/b,b)+ digitos[n%b];
		 }else{
		 return "0";
		 }
	 }
}
