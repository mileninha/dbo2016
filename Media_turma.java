class Media_turma{
	public static void main (String args[]){
		int np, idade = 0, c = 1;
		float	media, soma = 0;
		
		System.out.print("Digite o numero de alunos:");
		np = Integer.parseInt(System.console().readLine());
		while(c <= np) {
			System.out.print("Digite a idade de uma pessoa:");
			idade = Integer.parseInt(System.console().readLine());
			soma = soma + idade;
			c++;
		}
		media = soma/np;
		System.out.println("A média da turma é: " + media);
	}
}