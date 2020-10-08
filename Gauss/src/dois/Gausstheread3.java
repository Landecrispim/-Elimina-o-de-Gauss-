package dois;

public class Gausstheread3 {
	private static double[][] matriz;
	private int nt;
	private int aux2;
	private int linha;
	private int coluna;
	private int index;
	private double divisor;

	public Gausstheread3(double[][] entrada, int nt, int aux2) {
		matriz = entrada;
		linha = 0;
		// coluna = 0;
		index = 0;
		this.nt = nt;
		this.aux2 = aux2;
		//System.out.println(aux2);

	}

	public void eliminate() {
		coluna = 0;
		for (linha = 0; linha < matriz.length; linha++) {
			operacao1();

			if (matriz[linha][coluna] != 1.0) {
				divisor = matriz[linha][coluna];
				Operacao2a op2a = new Operacao2a(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2b op2b = new Operacao2b(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2c op2c = new Operacao2c(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2d op2d = new Operacao2d(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2e op2e = new Operacao2e(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2f op2f = new Operacao2f(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2g op2g = new Operacao2g(matriz, nt, aux2, linha, coluna, divisor);
				Operacao2h op2h = new Operacao2h(matriz, nt, aux2, linha, coluna, divisor);
				op2a.start();
				op2b.start();
				op2c.start();
				op2d.start();
				op2e.start();
				op2f.start();
				op2g.start();
				op2h.start();
				try {
					op2a.join();
					op2b.join();
					op2c.join();
					op2d.join();
					op2e.join();
					op2f.join();
					op2g.join();
					op2h.join();
					

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			

			for (int i = 0; i < matriz.length; i++) {
				if (i != linha && matriz[i][coluna] != 0) {
					Operacao3a op3a = new Operacao3a(matriz, nt, aux2, linha, coluna, i);
					Operacao3b op3b = new Operacao3b(matriz, nt, aux2, linha, coluna, i);
					Operacao3c op3c = new Operacao3c(matriz, nt, aux2, linha, coluna, i);
					Operacao3d op3d = new Operacao3d(matriz, nt, aux2, linha, coluna, i);
					Operacao3e op3e = new Operacao3e(matriz, nt, aux2, linha, coluna, i);
					Operacao3f op3f = new Operacao3f(matriz, nt, aux2, linha, coluna, i);
					Operacao3g op3g = new Operacao3g(matriz, nt, aux2, linha, coluna, i);
					Operacao3h op3h = new Operacao3h(matriz, nt, aux2, linha, coluna, i);
					op3a.start();
					op3b.start();
					op3c.start();
					op3d.start();
					op3e.start();
					op3f.start();
					op3g.start();
					op3h.start();
					try {
						op3a.join();
						op3b.join();
						op3c.join();
						op3d.join();
						op3e.join();
						op3f.join();
						op3g.join();
						op3h.join();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			}

			coluna++;
		}

	}

	private void operacao1() {

		while (matriz[linha][coluna] == 0.0) {
			boolean flag = false;
			int i = linha;
			while (!flag && i < matriz.length) {
				if (matriz[i][coluna] != 0.0) {
					double[] temp = matriz[i];
					matriz[i] = matriz[linha];
					matriz[linha] = temp;
					flag = true;
				}
				i++;
			}
			if (matriz[linha][coluna] == 0.0) {
				coluna++;
			}
		}

	}



	public String toString() {
		String text = "";
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[i].length; j++) {
				text += this.matriz[i][j] + ", ";
			}
			text += "\n";
		}
		return text;
	}

}
