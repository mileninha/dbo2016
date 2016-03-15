public class Numero{
	public static void main(String[] args)	{
	
	String s = "ifrs";
	int vogais = 0;
	int consoante = 0;
	char[] letras = s.toCharArray();
	for (int i = 0; i < letras.length; i++) {
		if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
			vogais = vogais + 1;
		}
		if (letras[i] = 'b' || letras[i] = 'c' || letras[i] = 'd' || letras[i] = 'f' || letras[i] = 'g' || letras[i] = 'h' || letras[i] = 'j' || letras[i] = 'k' || letras[i] = 'l' || letras[i] = 'm' || letras[i] = 'n' || letras[i] = 'p' || letras[i] = 'q' || letras[i] = 'r' || letras[i] = 's' || letras[i] = 't' || letras[i] = 'u' || letras[i] = 'v' || letras[i] = 'w' || letras[i] = 'x' || letras[i] = 'y' || letras[i] = 'z'){
			consoante = consoante + 1;
		}
	}
	System.out.println("Vogais = " + vogais);
	System.out.println("Consoantes = " + consoante);
	}
}