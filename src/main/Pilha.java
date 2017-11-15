package main;

import java.util.ArrayList;

public class Pilha {
	private Materia[][] matriz;
	public static final int OCUPADO = -1, PUSHED = 1;
	ArrayList<Materia> added = new ArrayList<Materia>();

	public Pilha() {
		// LINHA EH O HORARIO; COLUNA, O DIA
		matriz = new Materia[4][5];

		for (Materia[] materia : matriz) {
			for (Materia mat : materia) {
				mat = null;
			}
		}
	}

	public Pilha(ArrayList<Materia> materias) {
		this();
		this.added = materias;
		for (Materia materia : materias) {
			 int[] horarios = materia.getHorarios();
			 for(int dia = 0; dia < horarios.length; dia++) {
				 if(horarios[dia] != 0)
					 matriz[horarios[dia]][dia] = materia;
			 }
		}
	}

	public int push(Materia m) {
		int[] horarios = m.getHorarios();
		int horario;
		for (int dia = 0; dia < horarios.length; dia++) {
			horario = horarios[dia];
			if (this.matriz[horario][dia] != null) {
			//	System.out.println("DENIED " + m.getId() + " FOR BEING FULL" + m );
				return OCUPADO;
			}
		}

		/// TODO: COLOCAR NA MATRIZ
		for (int dia = 0; dia < horarios.length; dia++) {
			horario = horarios[dia];
			if (horario != 0)
				matriz[horario][dia] = m;
		}
		//System.out.println("Added " + m.getId() + m);
		added.add(m);
		return PUSHED;
	}

	private int pesoQtde() {
		int res = 0;
		for (Materia[] materias : matriz) {
			for (Materia materia : materias) {
				if(materia != null)
					res += 10;
			}
		}

		return res;
	}

	private int pesoBuraco() {
		int res = 0;
		for(int i = 0; i < matriz[2].length; i++) {
			if(matriz[2][i] != null)
				res += 1;
		}

		return res;
	}

	public int getPeso() {

		return pesoQtde() + pesoBuraco();
	}

	public boolean isEmpty() {
		for (Materia[] materias : matriz) {
			for (Materia m : materias) {
				if (m != null)
					return true;
			}
		}
		return false;
	}

	public void pop(Materia m) {
		for (Materia[] materias : matriz) {
			for (Materia materia : materias) {
				if (m.getId() == materia.getId())
					materia = null;
			}
		}
	}

	public Materia pop() {
		if (!added.isEmpty()) {
			/**
			 * for (Materia[] materias : matriz) for (Materia materia : materias) if
			 * (materia != null) if (materia.getNome().equals(getLastAdded() .getNome())) {
			 * System.out.println("POPPED " + materia); materia = null; }
			 */
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] != null) {
						if (matriz[i][j].getNome().equals(getLastAdded().getNome()))
							matriz[i][j] = null;
					}
				}
			}
			this.added.remove(added.size() - 1);
		}
		return null;

	}

	public ArrayList<Materia> getList(){
		return this.added;
	}

	private Materia getLastAdded() {
		return this.added.get(added.size() - 1);
	}


	public boolean exists(String nome) {
		if (nome != null)
			for (Materia[] materias : matriz)
				for (Materia materia : materias)
					if (materia != null)
						if (materia.getNome().equals(nome))
							return true;

		return false;
	}

	public String toString() {
		StringBuilder helper = new StringBuilder();
		for (Materia[] materias : matriz) {
			for (Materia materia : materias) {
				if (materia != null)
					helper.append(materia.getNome() + "\t|");
				else
					helper.append(" \t|");
			}
			helper.append("\n");
		}
		return helper.toString();
	}
}
