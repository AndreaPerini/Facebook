import java.util.Scanner;

public class Facebook {

	private static Scanner sc = new Scanner(System.in);
	private static Utente profilo = new Utente("Lorenzo", "Avallone", 17);
	private static Amici amici = new Amici();
	private static Galleria galleria = new Galleria();
	private static String newName, newSurname, newTitolo, tag;
	private static int scelta, newEta;

	private static void addAmico() {
		System.out.println("Inserisci il nome.");
		newName = sc.next();
		System.out.println("Inserisci il cognome.");
		newSurname = sc.next();
		System.out.println("Inserisci l'età.");
		newEta = sc.nextInt();
		amici.addAmico(new Utente(newName, newSurname, newEta));
	}

	private static void addFoto() {
		System.out.println("Inserisci titolo foto.");
		newTitolo = sc.next();
		galleria.addFoto(new Foto(newTitolo));
	}

	private static void tagFriend() {
		System.out.println("Inserisci il nome.");
		newName = sc.next();
		System.out.println("Inserisci il cognome.");
		newSurname = sc.next();
		newName = newName + " " + newSurname;
		System.out.println("Inserisci il tag.");
		tag = sc.next();
		galleria.searchPhotoByTag(tag).tagAmico(amici.searchAmico(newName));
	}

	public static void main(String[] args) {
		do {

			System.out.println("Bentornato " + profilo.getNome() + " " + profilo.getCognome()
					+ " \nCosa vuoi fare?\n1) Aggiungere un amico\n2) Aggiungere una foto");
			scelta = sc.nextInt();
			switch (scelta) {

			case 1:
				addAmico();
				break;

			case 2:
				addFoto();
				break;

			case 3:
				tagFriend();
				break;

			default:
				scelta = 0;
				break;
			}
		} while (scelta != 0);
	}

}