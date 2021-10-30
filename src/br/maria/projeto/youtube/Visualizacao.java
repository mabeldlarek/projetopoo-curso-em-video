package br.maria.projeto.youtube;

public class Visualizacao {
	private Inscrito espectador;
	private Video filme;

	public Visualizacao(Inscrito espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.getEspectador().setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setVisualizacoes(this.filme.getVisualizacoes() + 1);
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota)
	{
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float porc)
	{
		int tot = 0;
		if (porc <= 20) {
			tot = 3;
		} else if (porc<=50) {
			tot=5;
		} else if (porc<=90) {
			tot = 8;
		} else {
			tot = 10;
		}
		
		this.filme.setAvaliacao(tot);
	}

	public Inscrito getEspectador() {
		return espectador;
	}

	public void setEspectador(Inscrito espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}
}
