package basico.com;

public class Basico {

	public static String logico(int a, int b) {
		String resultado=null;
		if (a > b) {
			resultado= a+" Es mayor que "+b;
		}
		else {resultado= b+" Es mayor que "+a;}
		return resultado;
}
	public static void main ( String[] Args) {
		System.out.println(logico(4,5));
	}
}
