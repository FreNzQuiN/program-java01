import java.util.*;
import java.lang.*;

class Ideone{
	static Scanner scan = new Scanner(System.in);
	static int tmp;
	static String tmps;
	public static void main(String[] args) {
		programMulai();
		programInput();
		programSelesai();
	}
	static void programMulai() {
		System.out.println("===========================");
		System.out.println("== Program Hitung Bangun ==");
		System.out.println("===========================");
	}
	static void programInput() {
		System.out.println("1.\t Kubus");
		System.out.println("2.\t Balok");
		System.out.println("3.\t Silinder");
		System.out.println("Ingin menghitung bangun apa?");
		tmp = scan.nextInt();
		menentukanRuang();
	}
	static void menentukanRuang() {
		switch (tmp) {
		case 1:
			programKubus();
			break;
		case 2:
			programBalok();
			break;
		case 3:
		    programSilinder();
		    break;
		default:
			programGagal();
		}
	}
	static void programGagal() {
		System.out.println("Inputan tidak valid (1-3)");
		programUlang();
	}
	static void programUlang() {
		System.out.printf("Ingin mengulang? (Y/N) ");
		tmps=scan.next();
		System.out.println();
		if(tmps.equalsIgnoreCase("Y")) programInput();
	}
	static void programSelesai() {
		System.out.println("===========================");
		System.out.println("== TERIMAKASIH^^ SEE YOU ==");
		System.out.println("===========================");
	}
	static void programKubus() {
		System.out.printf("Masukkan panjang satu sisi: ");
		double x = scan.nextDouble();
		System.out.println();
		double volume = Math.pow(x,3), luasPermukaan= x*x*6;
		System.out.printf("Volume Kubus adalah\t: %.2f\n", volume);
		System.out.printf("Luas Permukaan Kubus adalah\t: %.2f\n",luasPermukaan);
		programUlang();
	}
	static void programBalok() {
		System.out.printf("Masukkan panjang ketiga sisi: ");
		double sisi[] = new double[3];
		for(int i=0; i<3; i++) sisi[i] = scan.nextDouble();
		double volume = sisi[0]*sisi[1]*sisi[2], luasPermukaan = 2*(sisi[0]*sisi[1])+2*(sisi[0]*sisi[2])+2*(sisi[1]*sisi[2]);
		System.out.println();
		System.out.printf("Volume Balok adalah\t\t: %.2f\n",volume);
		System.out.printf("Luas Permukaan Balok adalah\t: %.2f\n",luasPermukaan);
		programUlang();
	}
	static void programSilinder() {
		System.out.printf("Masukkan tinggi dan radius: ");
		double tinggi = scan.nextDouble(), radius = scan.nextDouble();
		double luasLingkaran = silinder.luasLingkaran(radius), keliling = silinder.kelilingLingkaran(radius*2);
		double volume = silinder.volume(radius,tinggi), luasPermukaan = silinder.permukaan(radius*2, tinggi);
		System.out.println();
		System.out.printf("Volume Silinder adalah\t\t: %.2f\n",volume);
		System.out.printf("Luas Permukaan Silinder adalah\t: %.2f\n",luasPermukaan);
		programUlang();
	}
}

class silinder {
	static double kelilingLingkaran(double dia){
		return Math.PI*dia;
	}
	static double luasLingkaran(double rad){
		return Math.PI*rad*rad;
	}
	static double permukaan(double dia, double tinggi){
		return Math.PI*dia*tinggi+2*Math.PI*dia;
	}
	static double volume(double rad, double tinggi){
		return (Math.PI*rad*rad)*tinggi;
	}
}
	
