package dois;

public class Operacao2h extends Thread{
	private static double[][] matriz;
	private int nt;
	private int aux2;
	private int linha;
	private int coluna;
	double divisor;

	
	public Operacao2h(double[][] matriz,int nt, int aux2,int linha, int coluna,double divisor2 ) {
		// TODO Auto-generated constructor stub
		this.matriz=matriz;
		this.nt=nt;
		this.aux2=aux2;
		this.linha=linha;
		this.coluna=coluna;	
		this.divisor = divisor2;
		//run();
		
	}
	
	public void run() {
		try {
			int th =7;
			 divisor = matriz[linha][coluna];
			//System.out.println("run d");

			for (int i = th*aux2; i < matriz[linha].length ; i++) {
				matriz[linha][i] = matriz[linha][i] / divisor;
			}
		} catch (Exception e) {
			System.out.println("erro runnable d");
		}
	}
	
	
	
	
	
}
