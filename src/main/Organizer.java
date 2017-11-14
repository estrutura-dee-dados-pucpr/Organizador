package main;

public class Organizer {



	class Pilha {
		private Materia[][] matriz;
		public static final int OCUPADO = -1;
		public Pilha(int size) {
			//LINHA EH O HORARIO; COLUNA, O DIA
			matriz = new Materia[3][5];
		}

		public int push(Materia m){
			int[] horarios = m.getHorarios();
			int horario;
			for(int dia = 0; dia < horarios.length; dia++) {
				horario = horarios[dia];
				if(this.matriz[horario][dia] != null)
					return OCUPADO;
			}
			///TODO: COLOCAR NA MATRIZ

			return 0;
		}

		public void pop() {

		}

	}
}
