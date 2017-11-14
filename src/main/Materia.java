package main;

public class Materia {
	private String professor, nome;
	private int turno, horarios[];

	public Materia(String professor, String nome, int turno, int []horario) {
		super();
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


}
