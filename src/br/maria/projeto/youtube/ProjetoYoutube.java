package br.maria.projeto.youtube;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[2];
		v[0] = new Video("Aula de POO.");
		v[0].like();
		System.out.println(v[0].toString());

		Inscrito i[] = new Inscrito[2];
		i[0]= new Inscrito("Maria", 19, "F","Mabel",0);
		i[0].viuMaisUm();
		System.out.println(i[0].toString());
		
		Visualizacao vis[] = new Visualizacao[2];
		vis[0] = new Visualizacao (i[0], v[0]);
		vis[0].avaliar(8);
			
		System.out.println(v[0].toString());
		System.out.println(i[0].toString());		
	}
}
