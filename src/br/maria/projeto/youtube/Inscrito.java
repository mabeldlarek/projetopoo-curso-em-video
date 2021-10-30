package br.maria.projeto.youtube;

public class Inscrito extends Pessoa {
	private String login;
	private int totAssistido;
	private Video videoAssistido;
	
	public Inscrito(String nome, int idade, String sexo, String login, int totAssistido) {
		super (nome,idade,sexo);
		this.login = login;
		this.totAssistido = totAssistido;
	}

	public void viuMaisUm()
	{
		this.setTotAssistido(this.getTotAssistido()+1);
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "O inscrito(a): " + nome + "\nIdade: "+ idade + "\nLogin:"+ login + "\nAssistiu: " + totAssistido + " videos\n" + ",cuja experiencia é:" + experiencia;
	}

	public Video getVideoAssistido() {
		return videoAssistido;
	}

	public void setVideoAssistido(Video videoAssistido) {
		this.videoAssistido = videoAssistido;
	}
}
