package Base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Entrada {

	double a[][];
	double b[][];
	int ab[][];
	int sm;
	int LA, CA, LB, CB;
	boolean flag = true;
	String[][] matriz_de_str;
	String aux = new String();
	String aux1 = new String();
	Chartofloat conv = new Chartofloat();

	public void run() {
		try {
			Scanner ler = new Scanner(System.in);

			String nome = "C:\\Users\\lander\\eclipse-workspace\\Gauss\\in\\matrix50x50.txt";


			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			
			String linha = lerArq.readLine();

			for (int i = 0; i < linha.length(); i++) {

				if (linha.charAt(i) != ';' && flag) {
					aux += linha.charAt(i);
				} else {

					flag = false;

				}
				if (!flag) {
					aux1 += linha.charAt(i);
				}
			}

			CA = (int) conv.convert(aux1); // seta a quantidade de colunas da matriz
			LA = (int) conv.convert(aux);// seta a quantidade de linhas da matriz

			a = new double[LA][CA];
			b = new double[LA][1];
			matriz_de_str = new String[LA][CA];
			int k = 0;

			for (int i = 0; i < LA; i++) {
				linha = lerArq.readLine();
				k = 0;
				for (int j = 0; j < linha.length(); j++) {
					if (linha.charAt(j) != ';') {
						matriz_de_str[i][k] += linha.charAt(j);
					} else
						k++;
				}
			}

			for (int i = 0; i < LA; i++) {
				for (int j = 0; j < CA; j++) {
					a[i][j] = conv.convert(matriz_de_str[i][j]);
				}
			}

			

			arq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public double[][] getA() {
	
		return a;
	}
	public int getCA() {
		return CA;
	}

}
