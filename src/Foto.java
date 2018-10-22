public class Foto {
	
	private String titolo;
	private Utente tag;

	public Foto(String titolo) {
		this.titolo = titolo;
		tag = null;
	}
	
	public void tagAmico(Utente tag) {
		this.tag = tag;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Utente getTag() {
		return tag;
	}

	@Override
	public String toString() {
		return "Foto [titolo=" + titolo + ", tag=" + tag + "]";
	}
	
	
}
