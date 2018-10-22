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

	public Foto searchPhotoByTag(String tag) {
		System.out.println(tag);
		for (int i = 0; i < galleria.size(); i++) {
			System.out.println(galleria.get(i).toString());
			if (tag.equals(galleria.get(i).getTitolo())) {
				System.out.println("Ritorno");
				return galleria.get(i);
			}
		}
		return null;
	}
}