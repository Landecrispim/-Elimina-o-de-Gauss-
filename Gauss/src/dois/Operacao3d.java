package dois;

public class Operacao3d extends Thread{
	private static double[][] matriz;
	private int nt;
	private int aux2;
	private int linha;
	private int coluna;
	int i;

	
	public Operacao3d(double[][] matriz,int nt, int aux2,int linha, int coluna,int i ) {
		// TODO Auto-generated constructor stub
		this.matriz=matriz;
		this.nt=nt;
		this.aux2=aux2;
		this.linha=linha;
		this.coluna=coluna;	
		this.i = i;
		//run();
		
	}
	
	public void run() {
		try {
			int th =3;
			//System.out.println("run 3c");
			double multiple = 0 - matriz[i][coluna];
			for (int j = coluna; j < matriz[linha].length; j++) {
				matriz[i][j] += multiple * matriz[linha][j];
			}
		} catch (Exception e) {
			System.out.println("erro runnable a");
			
		}
	}
	
	
	
	
	
}
