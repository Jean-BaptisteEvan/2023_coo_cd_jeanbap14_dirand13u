package main;

import java.io.IOException;
import java.util.Scanner;

import XML.ChargeurMagasin;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.ComparateurPiste;
import donnees.Magasin;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

	/**
	 * methode principale
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             en cas de probleme de lecture entree/sortie
	 */
	public static void main(String args[]) throws IOException {
		
		String repertoire = "musicbrainzSimple/";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();

		resultat.trier(new ComparateurPiste());
		System.out.println(resultat);



//		resultat.trierAriste();
//		System.out.println(resultat);
//
//		resultat.trierAlbum();
//		System.out.println(resultat);

	}

}
