public class Metodos3{
	//metodo que recebe int e devolve int
	//			devolve	  recebe
	public static int dobro(int m)	{
		return m + m;
	}

	public static void main(String[] args) {
		
		int n = 2;
		int b = dobro(n);
		System.out.println(n); //2
		System.out.println(n == 2); //true
		System.out.println(b); //4
		System.out.println(b == 4); //true
		int q = (dobro(dobro(dobro(n))));
		System.out.println(q);
	}
}