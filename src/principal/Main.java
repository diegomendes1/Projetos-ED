package principal;


public class Main {

	public static void main(String[] args) {
		Conversao conversao = new Conversao();
		int numero = conversao.converterBaseParaDecimal("00110011", 2);
		System.out.println(numero);
		
		//String numero = conversao.converterDecimalParaBase(51, 16);
		//System.out.println(numero);
	}

}
