package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Organizer {

	ArrayList<ArrayList<Materia>> mats;
	ArrayList<Pilha> aceitas = new ArrayList<Pilha>();
	int pesoAceitavel  = 70;
	public Organizer(Materia[] mats, String[] profsBons, String[] profsRuis) {
		ArrayList<ArrayList<Materia>> resp = new ArrayList<ArrayList<Materia>>();
		boolean achou = false;
		for (Materia toAdd : mats) {
			// System.out.println("Adding " + toAdd);
			for (String s : profsBons)
				if (toAdd.getProfessor().equals(s))
					toAdd.addPeso(10);
			for (String s : profsRuis)
				if (s.equals(toAdd.getProfessor()))
					toAdd.addPeso(-10);
			if (resp.isEmpty()) {
				resp.add(new ArrayList<Materia>());
				resp.get(0).add(toAdd);
			} else {
				for (int i = 0; i < resp.size(); i++) {
					if (resp.get(i).get(0).getNome().equals(toAdd.getNome())) {
						resp.get(i).add(toAdd);
						achou = true;
						break;
					}
				}
				if (!achou) {
					// System.out.println("NEW List");
					resp.add(new ArrayList<Materia>());
					resp.get(resp.size() - 1).add(toAdd);
					achou = false;
				}

			}
		}

		for (ArrayList<Materia> s : resp) {
			Collections.sort(s, new Comparator<Materia>() {
				@Override
				public int compare(Materia m1, Materia m2) {

					return m1.getPeso() > m2.getPeso() ? -1 : 1;
				}
			});
		}

		this.mats = resp;
	}

	public void prtMts() {
		for (ArrayList<Materia> arrayList : mats) {
			// System.out.println("New lsit");
			for (Materia materia : arrayList) {
				System.out.println(materia);
			}
		}
	}

	void monta(Materia a, Pilha p, int index) {
		if (p.isEmpty())
			p.push(a);
		ArrayList<Materia> test = mats.get(index);
		for (Materia materia : test) {
			if (!p.exists(materia.getNome()))
				if (p.push(materia) == Pilha.PUSHED) {
					monta(a, p, index + 1 < mats.size() ? index += 1 : index);
				}
		}
		//System.out.println("Achei solucao com peso " + p.getPeso());
		//System.out.println(p);
		// System.out.println("Popped " +p.pop());
		if(p.getPeso() > pesoAceitavel) {
			System.out.println("Aceitei: \n" + p);
			aceitas.add(new Pilha(p.getList()));
		}
		p.pop();
	}

	public void mostraGrades() {
	//	Collections.sort(aceitas, new Comparator<Pilha>() {
		//	@Override
		//	public int compare(Pilha m1, Pilha m2) {
		////		return m1.getPeso() > m2.getPeso() ? -1 : 1;
		//	}
		//});

		System.out.println("SOLUCOIES:\n\n");
		for (Pilha pilha : aceitas) {
			System.out.println(pilha+ "\n-------------------------------------------------");
		}
	}

	public void montaGrade() {
		System.out.println("MATS SIZE: " + mats.size());
		for (int j = 0; j < mats.size(); j++)
			for (int i = 0; i < mats.get(j).size(); i++) {
				monta(mats.get(j).get(i), new Pilha(), 0);
			//	System.out.println("TROQUEI\n---------------------------------");
			}
	}

}
