package entyCollection;

import java.util.HashMap;
import java.util.Scanner;

public class Starter {

   static HashMap<Integer, String> plakalar = new HashMap<Integer, String>();
   static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		boolean aktifMi = true;
		do {
		System.out.println("Lütfen seçiniz: ");
		System.out.println("1. Yeni plaka - il girişi");
		System.out.println("2. Plaka arama");
		System.out.println("Çıkış için 3");
		int secim = scanner.nextInt();
		switch (secim) {
		case 1:
			 plakaGiris();
			break;
		case 2:
			plakaAra();
			break;  
		default:
			aktifMi = false;
			break;
		 }
		}while(aktifMi);
		
		System.out.println("Plaka kodunu giriniz: ");
		
		
		
		int kod = scanner.nextInt();
		System.out.println("il adını girin: ");
      plakalar.put(34, "İstanbul");
      plakalar.put(6, "Ankara");
      
	}

	private static void plakaAra() {
		// TODO Auto-generated method stub
		boolean devamEtsinMi = true;
		while (devamEtsinMi) {
			System.out.println("Aradığınız plaka (çıkmak için 0)");
			int girilenPlaka = scanner.nextInt();
			if (girilenPlaka != 0) {
				if (plakalar.containsKey(girilenPlaka)) {
				  String il =	plakalar.get(girilenPlaka);
				  System.out.println(String.format("%d plakalı ilimizin adı %s", girilenPlaka,il));
				}
				else {
					System.out.println("Böyle bir plaka kayıtlı değil!");
				}
			}
			else {
				devamEtsinMi = false;
			}
		}
	}

	private static void plakaGiris() {
		// TODO Auto-generated method stub
		boolean devamEtsinMi = true;
		while (devamEtsinMi) {
		    System.out.println("Plaka kodunu girin (çıkmak için 0 girin)");
		    int plaka = scanner.nextInt();
		    if (plaka !=0) {
		    	
				if (!plakalar.containsKey(plaka)) {
				   System.out.println("İlin adını girin");
				   
				   String ad = scanner.next();
				   //sözlüğe ekle:
				   plakalar.put(plaka, ad);				   
				   }else {
					  System.out.println("Bu plaka zaten girilmiş");
				}
			}
		    else {
		    	devamEtsinMi = false;
		    }
		}
		
	}

}
