import java.util.ArrayList;
import java.util.List;

public class Amici {

	private List<Utente> amici = new ArrayList<>();
	// private Utente[] listaAmici = new Utente[100];
	private int indice;

	public Amici() {
		this.indice = 0;
	}

	public Utente searchAmico(String nome_cognome) {
		for (int i = 0; i < amici.size(); i++) {
			System.out.println(amici.get(i).toString());
			if (nome_cognome.equals(amici.get(i).getNome() + " " + amici.get(i).getCognome())) {
				System.out.println("Ritorno");
				return amici.get(i);
			}
		}
		return null;
	}

	public void addAmico(Utente utente) {
		amici.add(utente);
	}

}
