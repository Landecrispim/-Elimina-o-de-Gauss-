package dois;

public class Operacao2a extends Thread{
	private static double[][] matriz;
	private int nt;
	private int aux2;
	private int linha;
	private int coluna;
	double divisor;

	
	public Operacao2a(double[][] matriz,int nt, int aux2,int linha, int coluna,double divisor2 ) {
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
			int th =0;
			//System.out.println("run a");
			 divisor = matriz[linha][coluna];
			for (int i = th*aux2; i < (th+1)*aux2 || i < matriz[linha].length ; i++) {
				matriz[linha][i] = matriz[linha][i] / divisor;
			//	System.out.println("matriz[linha][i] = "+ matriz[linha][i]);
			}
		} catch (Exception e) {
			System.out.println("erro runnable a");
			
		}
	}
	
	
	
	
	
}
