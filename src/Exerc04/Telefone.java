package Exerc04;

public class Telefone {
	private Integer ddd;
	private Integer numero;
	
	public String ExibirTelFormat(){
		String telFormat = ddd.toString() + numero.toString();
		telFormat = ("(")+telFormat.substring(1, 3)+")"+telFormat.substring(3,9)+"-"+
		telFormat.substring(9, 13);
		return telFormat;		
		
	}

}
