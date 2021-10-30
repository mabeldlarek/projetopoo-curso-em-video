package br.maria.projeto.youtube;

public class Video implements AcoesVideo {
	private String titulo;
	private int visualizacoes;
	private int curtidas;
	private int descurtida;
	private int avaliacao;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.visualizacoes = 0;
		this.curtidas = 0;
		this.descurtida = 0;
		this.reproduzindo = false;
	}

	@Override
	public void play() {
		this.setReproduzindo(true);
		System.out.println("O vídeo está sendo reproduzido.");
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
		System.out.println("O vídeo está pausado.");
	}

	@Override
	public void like() {
		this.setCurtidas(getCurtidas()+1);
		
	}

	@Override
	public void deslike() {
		this.setDescurtida(getDescurtida()+1);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getVisualizacoes() {
		return visualizacoes;
	}

	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public int getDescurtida() {
		return descurtida;
	}

	public void setDescurtida(int descurtida) {
		this.descurtida = descurtida;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao = avaliacao/this.visualizacoes));
		this.avaliacao = nova;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video:" + titulo + "\nVisualizacoes:" + visualizacoes + "\nCurtidas:" + curtidas
				+ "\nDescurtidas:" + descurtida + "\nAvaliacao:" + avaliacao + "\nReproduzindo:" + reproduzindo;
	}
}
