import java.util.Scanner;

public class PeaKlass {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		/*
		 eeldame, et kasutaja ei hakka s�steemiga jamama
		 ja sisestab andmed vastavalt k�situle
		 */
		Kasutaja kasutaja = new Kasutaja();
		while(true) {
			System.out.println("Sisesta oma nimi:");
			kasutaja.setNimi(sc.next());
			System.out.println("Sisesta vanus:");
			kasutaja.setVanus(sc.nextInt());
			System.out.println("Sisesta pikkus sentimeetrites:");
			kasutaja.setPikkus(sc.nextInt());
			System.out.println("Sisesta oma kaal:");
			kasutaja.setKaal(sc.nextDouble());
			System.out.println("Sisesta sugu (M/N):");
			kasutaja.setSugu(sc.next().toUpperCase().charAt(0));
		
			//retarded j�rjekord i know, lambist testin v�rki
			//Kasutaja kasutaja = new Kasutaja(vanus, pikkus, sugu, kaal, nimi);
			System.out.println(kasutaja);
			System.out.println("Kas andmed on �iged? (Y/N):");
			char x = sc.next().toUpperCase().charAt(0);
			if(x == 'Y') {
				break;
			}
			
		}
		System.out.println("Sinu l�plikud andmed:\n" + kasutaja);
		Kalkulaator arvuta = new Kalkulaator(kasutaja.getVanus(), kasutaja.getPikkus(), kasutaja.getSugu(), kasutaja.getKaal());
		// lihtsalt proovin, kuidas miski t��tab
		System.out.println("LAlaLA" + arvuta.arvutaBAV());
	}
}
