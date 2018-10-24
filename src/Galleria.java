import java.util.ArrayList;
import java.util.List;

public class Galleria {

	private List<Foto> galleria;
	// private Foto[] galleria = new Foto[100];
	static int indice = 0;

	public Galleria() {
		galleria = new ArrayList<>();
	}

	public void addFoto(Foto foto) {
		galleria.add(foto);
		indice++;
	}

	public Foto searchPhotoByTitolo(String titolo) {
		System.out.println(titolo);
		for (int i = 0; i < galleria.size(); i++) {
			if (titolo.equals(galleria.get(i).getTitolo())) {
				return galleria.get(i);
			}
		}
		return null;
	}

	public void contaTagAmico(String nome_cognome) {
		int cont = 0;
		System.out.println("Cerco foto di " + nome_cognome);
		for(int i = 0; i < galleria.size(); i++) {
			//System.out.println(galleria.get(i).getTag().getNome() + " " + galleria.get(i).getTag().getCognome());
			if(nome_cognome.equals(galleria.get(i).getTag().getNome() + " " + galleria.get(i).getTag().getCognome())) {
				cont++;
			}
		}
		System.out.println(nome_cognome + " è presente in " + cont + " foto.");
	}
	public void bestFriend(List<Utente> amici) {
		int max = 0;
		String result = null;
		for (int i = 0; i < amici.size(); i++) {
			int cont = 0;
			for(int k = 0; k < galleria.size(); k++) {
				if((amici.get(i).getNome() + " " + amici.get(i).getCognome()).equals(galleria.get(k).getTag().getNome() + " " + galleria.get(k).getTag().getCognome())) {
					cont++;
				}
			}
			if(cont > max) {
				result = amici.get(i).getNome() + " " + amici.get(i).getCognome();
			}
		}
		System.out.println("Utente con più tag " + result);
	}
}