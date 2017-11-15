package main;

public class Materia {
	private String professor, nome;
	private int turno, horarios[], id, peso = 0;

	public Materia(int id, String professor, String nome, int turno, int []horario) {
		super();
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.turno = turno;
		this.horarios = horario;
	}


	public String getProfessor() {
		return professor;
	}

	public String getNome() {
		return nome;
	}

	public int getTurno() {
		return turno;
	}

	public int[] getHorarios() {
		return horarios;
	}

	public int getId() {
		return this.id;
	}

	public int getPeso() {
		return peso;
	}

	public void addPeso(int peso) {
		this.peso += peso;
	}


	public String toString() {
		return String.format("%s com %s", this.nome, this.professor);
	}

}
