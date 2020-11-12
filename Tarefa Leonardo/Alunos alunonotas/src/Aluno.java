
public class Aluno {

	private String nome;
	private double notas;
	private String disc;
	
	public Aluno(String nome, String disc,double notas)
	{
		this.nome = nome;
		this.notas = notas;
		this.disc = disc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}
	
}
