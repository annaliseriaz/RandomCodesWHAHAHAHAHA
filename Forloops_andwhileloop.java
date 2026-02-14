package labyu;
// walang pag-asa bwahahahahahaha// 
public class Forloops_andwhileloop {

	public static void main(String[] args) {
		finalexamnabukas(); 
	}
	
	public static void simulation_twodimeArray() { 
		int row, col;
		int [][] num = new int [4][4];
		int number = 4;
		
		//loop//
		for (row = 0; row < num.length; row++) {
			for (col = 0; col < num[row].length; col++) {
				num[row][col] = number;
				number--;
			}
			number += 5;
		}
		for (int m = num.length - 1; m >= 0; m--) {
			for (int n = 0; n < num[m].length; n++) {
				System.out.print(num[m][n] + "\t"); 
			}
		}
		System.out.println(); 
	}
	
	public static void arrayLang() {
		int [] fun = new int [5];
		fun[0] = 1; fun[1] = 2; fun[2] = 3; fun[3] = 4; fun[4] = 5;
		int j = 3;
		System.out.println(fun[j - 1]);
	}
	
	public static void simulationtwo_onedimeArray() {
		int r, c; 
		int[][]num = new int [4][4];
		int number = 4;
		//first loop//
		for (r = 0; r < num.length; r++) {
			for (c = 0; c < num[r].length; c++) {
				num[r][c] = number;
				number--;
			}
			number += 5;
		}
		//second loop//
		for (int a = num.length - 1; a >= 0; a--) {
			for (int b = 0; b < num[a].length; b++) {
				System.out.print(num[a][b] + "_"); 
			}
			System.out.println();
		}
	}
	
	public static void awtputnginteger() {
		int[] array = {2,4,6,8,1,3,5,7};
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			num += array[i];
			System.out.print(num); 
		}
	}
	
	public static void awtputngInteger() {
		int[] items = {2,7,3,5,8,9};
		int num = items[0];
		for (int i = 0; i < items.length; i++) {
			if (items[i] > num)
				num = items[i];
		}
		System.out.print(num);
	}
	
	public static void dobledw() {
		double[] x = new double[4];
		x[0] = 8.5; x[1] = 6.5; x[2] = 9.5; x[3] = 12.5;
		System.out.println(x[1 + 2]);
	}
	
	public static void simulationone_onedimeArray() {
		int[] a = {4,8,6,3,2};
		int[] b = new int [a.length + 1];
		int h = a[0];
		int sh = a[0]; 
		int j = 0;
		//loop again//
		for (int i = 0; i < a.length; i++) {
			if (a[i] > h) {
				h = a[i];
				j = 1;
			}
		}
		//second loop again whahahahaha//
		for (int i = 0; i < a.length; i++) {
			if (a[i] < h && a[i] > sh) {
				sh = a[i];
			}
		}
		//third loop yoko na pota//
		for (int i = 0; i < j; i++) {
			b[i] = a[i];
		}
		b[j] = sh;
		b[j + 1] = h - sh;
		//fourth loop arrrgghhhh//
		for (int i = j + 2; i < b.length; i++) {
			b[i] = a[i - 1];
		}
		//fifth loop arrggghhh yoko na!!!!!!!//
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " "); 
		}
	}
	
	public static void LoopniZoe() {
		for (int i = 1; i < 11; i++) {
			//output of the loop//
			System.out.println("Naulol sa programming"); }
	}
	
	public static void ulol() {
		for (int wanportri = 0; wanportri < 10; wanportri++) {
			//output of the loop//
			System.out.println("Crush kita kahit walang pag-asa sayo ULOL"); }
	}
	
	public static void loopniSirMarcPanot () {
		int number = 0;
		while (number < 2) {
			//output of the loop//
			System.out.println("Sir Marc Panot nambabagsak HAHAHAHAHAHAHAHA"); }
	}
	
	public static void LoopniSirMarcPanot() {
		for (int labyusirpanot = 0; labyusirpanot < 5; labyusirpanot++) {
			//output of the loop//
			System.out.println("labyu sir panot:)) from: 1BSIT-1"); }
	}
	
	public static void finalexamnabukas() {
		for (int shet = 20; shet > 5; shet--) { 
			//output of the loop//
			System.out.println("goodluck sa exam love!");
		}
		System.out.println("\nPano ka magogoodluck, wala naman nanalalambing");
	}
}
