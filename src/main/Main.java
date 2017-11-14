package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = {0, 2, 3, 0, 1}, b = {1, 0, 3, 0, 2}, c = {3, 0, 1, 3, 0},  d = {1, 1, 1, 0, 0},
				e = {3, 2, 2, 0,  0},  f = {0, 0, 2, 2, 2 },  g = {0, 3, 3, 0, 1},
				h= {0, 1, 0, 2, 0},  i = {1, 0, 0, 1, 0}, j = {2, 0, 0, 3, 0},  k = {1, 1, 0, 0, 0},  l = {2, 2, 0, 0, 0},  m = {0, 3, 0, 1, 0} ;
		Materia[] materias = { new Materia("Isabella", "Calc II", Utils.MANHA, a),
				new Materia("Rui", "ResMat", Utils.MANHA, b),
				new Materia("Karla", "Calc II", Utils.MANHA, c),
				new Materia("Henry", "Estrutura de Dados", Utils.MANHA, d),
				new Materia("Olimpio", "Calc II", Utils.MANHA, e),
				new Materia("Isabella", "Calc I", Utils.MANHA, f),
				new Materia("Karla", "Calc III", Utils.MANHA, g),
				new Materia("Gaioto", "Eletricidade Basica", Utils.MANHA, h),
				new Materia("Afonso", "RPE", Utils.MANHA, i),
				new Materia("Olimpio", "Geometria Analitica", Utils.MANHA, j),
				new Materia("Vanessa", "Algebra linear", Utils.MANHA, k),
				new Materia("Vasco", "Algebra linear", Utils.MANHA, l),
				new Materia("Vanessa", "Geometria Analitica", Utils.MANHA, m)
		};

		String[] materiasDesejadas = {"Calc II", "Geometria Analitica", "Estrutura de Dados"};

		//Organizer o  = new Organizer(materias, new ArrayList<String>(Arrays.asList(materiasDesejadas)));
	//;	System.out.println("O: \n" + o);

	}

}
