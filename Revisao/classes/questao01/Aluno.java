import java.io.Serializable;

public class Aluno implements Serializable {
	private float MEDIA = 5;
	private String nome;
	private String matricula;
	private float notaProva1;
	private float notaProva2;
	private float notaTrabalho;

	public Aluno(String nome, String matricula, float n1, float n2, float t) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaProva1 = n1;
		this.notaProva2 = n2;
		this.notaTrabalho = t;
	}

	public Aluno(float n1, float n2, float t) {
		this.notaProva1 = n1;
		this.notaProva2 = n2;
		this.notaTrabalho = t;
	}

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public float media() {
		float media = (float) (((this.notaProva1 + this.notaProva2) * 2.5) + (this.notaTrabalho * 2)) / 10;

		return media;
	}

	public float avaliacaoFinal() {
		if (this.media() >= MEDIA) {
			return 0;
		} else {
			float falta = (float) (4 * MEDIA) - (float) ((0.8 * this.notaTrabalho) - (this.notaProva1 - this.notaProva2));
			return falta;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setNotaProva1(float nota) {
		this.notaProva1 = nota;
	}

	public float getNotaProva1() {
		return this.notaProva1;
	}

	public void setNotaProva2(float nota) {
		this.notaProva2 = nota;
	}

	public float getNotaProva2() {
		return this.notaProva2;
	}

	public void setNotaTrabalho(float nota) {
		this.notaTrabalho = nota;
	}

	public float getNotaTrabalho() {
		return this.notaTrabalho;
	}
}
