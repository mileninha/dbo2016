public class Calculo{
	public static int soma(int x, int y) {
		int r1 = x + y;
		return r1;
	}
	public static int sub(int x, int y) {
		int r2 = x - y;
		return r2;
	}
	public static int multip(int x, int y) { 
		int r3 = 0;
		int b = x;
		for (int i = 0; i < y; i++){
			r3 = r3 + b;
		}
		return r3; 
	}
	public static int divis(int x, int y) {
		int r4 = 0;
		int i = 0;
		for (i = x; i > 0; i -= y){
			r4++;
		}
		return r4;
	}
	public static int potenc(int x, int y) {
		for (int i = 0; i < y; i++) {
			for (int i = 0; i < y; i++){
			int r3 = 0;
			int b = x;
			r3 = r3 + b;
		}
		}
		}
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int r1 = soma(x, y);
		int r2 = sub(x, y);
		int r3 = multip(x, y);
		int r4 = divis(x, y);
		int r5 = potenc(x, y);

	System.out.println("SOMA = " + r1);
	System.out.println(r1 == 15);
	System.out.println("SUBTRACAO = " + r2);
	System.out.println(r2 == 5);
	System.out.println("MULTIPLICACAO = " + r3);
	System.out.println(r3 == 50);
	System.out.println("DIVISAO = " + r4);
	System.out.println(r4 == 2);
	System.out.println("POTENCIA = " + r5);
	System.out.println(r5 == 100000);
	}
}
// soma 
// subtração 
// multiplicação 
// divisao 
// potencia