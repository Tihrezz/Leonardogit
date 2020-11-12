
public class Aluno implements Comparable<Aluno> {

	private String nome;
	private Long  freq;
	
	public Aluno(String nome, Long  freq) {
		this.nome = nome;
		this.freq = freq;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long  getFreq() {
		return freq;
	}

	public void setFreq(Long  freq) {
		this.freq = freq;
	}

	@Override
	public int compareTo(Aluno o) {
		return this.getFreq().compareTo(o.getFreq());
	}
	
    public String toString() {
        return "Aluno [nome=" + nome + ", freq=" + freq + "]";
    }
	
	
}
