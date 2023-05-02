package br.edu.ufam.icomp.lab_encapsulamento;

public class Carro {
	protected String placa;
	
	public Carro(String novaPlaca) {
		this.setPlaca(novaPlaca);
		
	}
	
	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
		
	}
	
	public String getPlaca() {
		return placa;
	}

}
