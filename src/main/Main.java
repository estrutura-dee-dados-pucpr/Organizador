package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = {0, 2, 3, 0, 1}, b = {1, 0, 3, 0, 2}, c = {3, 0, 1, 3, 0},  d = {1, 1, 1, 0, 0},
				e = {3, 2, 2, 0,  0},  f = {0, 0, 2, 2, 2 },  g = {0, 3, 3, 0, 1},
				h= {0, 1, 0, 2, 0},  i = {1, 0, 0, 1, 0}, j = {2, 2, 2, 0, 0},  k = {1, 1, 0, 0, 0},  l = {2, 2, 0, 0, 0},  m = {0, 3, 0, 1, 0} ;
		Materia[] materias = { new Materia(0, "Isabella", "Clc", Utils.MANHA, a),
				new Materia(10,"Vasco", "RPE", Utils.MANHA, l),
				new Materia(0,"Rui", "GA", Utils.MANHA, b),
				new Materia(1,"Karla", "Clc", Utils.MANHA, c),
				new Materia(2,"Henry", "RPE", Utils.MANHA, d),
				new Materia(5,"Karla", "Clc", Utils.MANHA, g),
				new Materia(6,"Gaioto", "RPE", Utils.MANHA, h),
				new Materia(8,"Olimpio", "GA", Utils.MANHA, j),
				new Materia(3,"Olimpio", "Clc", Utils.MANHA, e),
				new Materia(9,"Vanessa", "RPE", Utils.MANHA, k),
				new Materia(11,"Vanessa", "GA", Utils.MANHA, m),
				new Materia(7,"Afonso", "RPE", Utils.MANHA, i),
				new Materia(4,"Isabella", "Clc", Utils.MANHA, f),
		};

		String[] profsBons = {"Olimpio", "Gaioto"};
		String[] profsRuins = {"Karla", "Afonso", "Rui"};
		Organizer o = new Organizer(materias, profsBons, profsRuins);
	//	o.prtMts();
		o.montaGrade();
		o.mostraGrades();
		//Organizer o  = new Organizer(materias, new ArrayList<String>(Arrays.asList(materiasDesejadas)));
	//;	System.out.println("O: \n" + o);

		o.mostraGrades();
	}

}
