//No sublime:
//pl(tab) --System.out.println...
//cls ---limpa o terminal
public class Plural {
	public static void main(String[] args) {
		String palavra = "pão";
		String plural = palavra + "s";
		//método endsWith de String
		if (palavra.endsWith("r")) {
			plural = palavra + "es";
		}
		if (palavra.endsWith("ão")) {
			plural = palavra.replace("ão", "ães");
		}
		System.out.println(plural);
	}
}