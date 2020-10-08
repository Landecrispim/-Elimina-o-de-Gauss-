package um;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Base.Entrada;
import Base.Gauss;

public class sequencial {

	public static void main(String[] args) throws IOException {
		long tempoInicial = System.currentTimeMillis();
		// TODO Auto-generated method stub
		Entrada in = new Entrada();
		in.run();
		Gauss fun = new Gauss(in.getA());
		fun.eliminate();
		System.out.println("o metodo executou em " + (System.currentTimeMillis() - tempoInicial));
		System.out.print(fun.toString());
		FileWriter fw = new FileWriter(new File("C:\\Users\\lander\\eclipse-workspace\\Gauss\\in\\saida.txt"));
		fw.write(fun.toString());
		fw.close();
		




	}

}
