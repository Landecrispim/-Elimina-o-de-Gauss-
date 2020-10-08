package dois;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Base.Entrada;


public class paralelo {

	

	public static void main(String[] args) throws IOException {
		long tempoInicial = System.currentTimeMillis();
		//"C:\\Users\\lander\\eclipse-workspace\\Gauss\\in\\saida.txt"
		Entrada in = new Entrada();
		in.run();
		int nt=8;//não alterar
		Gausstheread3 fun = new Gausstheread3(in.getA(),nt,(int) Math.ceil(in.getCA()/nt));
		fun.eliminate();
		System.out.println("o metodo executou em " +(System.currentTimeMillis() - tempoInicial));

		FileWriter fw = new FileWriter(new File("C:\\Users\\lander\\eclipse-workspace\\Gauss\\in\\saida.txt"));
		fw.write(fun.toString());
		fw.close();
		//System.out.println(fun.toString());
		//System.out.println("o metodo executou em " +(System.currentTimeMillis() - tempoInicial));

	}


}
