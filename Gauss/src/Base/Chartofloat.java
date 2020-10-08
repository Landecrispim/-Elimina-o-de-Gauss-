package Base;

public class Chartofloat {
	

	
	private int charint(char nun) {
		char[] intref = {'0','1','2','3','4','5','6','7','8','9'};
		for (int i = 0; i < 10; i++) {
			if (nun == intref[i]) return i;
		}
		return 0;
	}
	
	
	public float convert(String str) {
		float valor_convertido =0;
		int qtdInteiro=0,qtdDecimal=0;
		int index =1; 
		char at;
		boolean flag = true;
		
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) =='.') { flag = false; i++;}
			else if(flag) qtdInteiro++; else qtdDecimal++;			
		}
		
		for (int i = 0; i <qtdInteiro; i++) {
		valor_convertido+=charint(str.charAt(i))*Math.pow(10,qtdInteiro-i-1); 
		}
		
		for (int i = qtdInteiro+1; i <str.length(); i++) {
			valor_convertido+=charint(str.charAt(i))/Math.pow(10,index); 
			index++;
			}
		
		return valor_convertido;
	}
	
	

}
