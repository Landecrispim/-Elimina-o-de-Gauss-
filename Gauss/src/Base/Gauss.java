package Base;

/**
 * A GaussJordan object holds a two dimensional array representing a entrada
 * containing a system of equations. Contains methods for performing a
 * Gauss-Jordan Elimination and putting a entrada into Reduced linha Echelon Form
 *
 * @author Thomas Coe
 * @version 1.0 October 8th, 2013
 */
public class Gauss{

    private double[][] matriz;

    /**
     * Constructor for a GaussJordan object. Takes in a two dimensional double
     * array holding the entrada.
     *
     * @param entrada A double[][] containing the augmented entrada
     */
    public Gauss(double[][] entrada) {
        matriz = entrada;
    }

    /**
     * Runs a Gauss-Jordan elimination on the augmented entrada in order to put
     * it into reduced linha echelon form
     *
     */
    public void eliminate() {
        int coluna = 0;
        for (int linha=0; linha<matriz.length; linha++) {
            //if the number in the start column is 0, try to switch with another
            while (matriz[linha][coluna]==0.0){
                boolean flag = false;
                int i=linha;
                while (!flag && i<matriz.length) {
                    if(matriz[i][coluna]!=0.0){
                        double[] temp = matriz[i];
                        matriz[i]=matriz[linha];
                        matriz[linha]=temp;
                        flag = true;
                    }
                    i++;
                }
                //if after trying to switch, it is still 0, increase column
                if (matriz[linha][coluna]==0.0) {
                    coluna++;
                }
            }
			//System.out.println("run op1");

			//System.out.println(toString());

            //if the number isn't one, reduce to one
            if(matriz[linha][coluna]!=1.0) {
                double divisor = matriz[linha][coluna];
                for (int i=coluna; i<matriz[linha].length; i++) {
                    matriz[linha][i] = matriz[linha][i]/divisor;
                }
            }
			//System.out.println("run op2");

			//System.out.println(toString());

            //make sure the number in the start column of all other linhas is 0
            for (int i=0; i<matriz.length; i++) {
                if (i!=linha && matriz[i][coluna]!=0) {
                    double multiple = 0-matriz[i][coluna];
                    for (int j=coluna; j<matriz[linha].length; j++){
                        matriz[i][j] +=
                            multiple*matriz[linha][j];
                    }
                }
            }
			//System.out.println("run op3");

			//System.out.println(toString());

			coluna++;
        }
    }

    /**
     * Returns a String with the contents of the augmented entrada.
     *
     * @return A String representation of the augmented entrada
     */
    public String toString() {
        String text = "";
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                text+=matriz[i][j] + ", ";
            }
            text+="\n";
        }
        return text;
    }
}