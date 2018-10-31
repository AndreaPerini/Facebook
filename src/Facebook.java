import java.util.Scanner;


public class Facebook {

	private static Scanner sc = new Scanner(System.in);
	private static Utente profilo = new Utente("Lorenzo", "Avallone", 17);
	private static Amici amici = new Amici();
	private static Galleria galleria = new Galleria();
	private static String newName, newSurname, newTitolo, titolo;
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
		newTitolo = sc.nextLine();
		galleria.addFoto(new Foto(newTitolo));
	}

	private static void tagFriend() {
		System.out.println("Inserisci il nome.");
		newName = sc.next();
		System.out.println("Inserisci il cognome.");
		newSurname = sc.next();
		newName = newName + " " + newSurname;
		System.out.println("Inserisci il titolo.");
		titolo = sc.next();
		galleria.searchPhotoByTitolo(titolo).tagAmico(amici.searchAmico(newName));
	}

	public static void main(String[] args) {
		do {

			System.out.println("Bentornato " + profilo.getNome() + " " + profilo.getCognome()
					+ " \nCosa vuoi fare?\n"
					+ "1) Aggiungere un amico.\n"
					+ "2) Aggiungere una foto.\n"
					+ "3) Taggare un amico.");
			scelta = sc.nextInt();
			sc.nextLine();
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
			case 4:
				System.out.println("Inserisci il nome.");
				newName = sc.next();
				System.out.println("Inserisci il cognome.");
				newSurname = sc.next();
				newName = newName + " " + newSurname;
				galleria.contaTagAmico(newName);
				break;
			case 5:
				galleria.bestFriend(amici.getList());
			default:
				scelta = 0;
				break;
			}
		} while (scelta != 0);
	}
}