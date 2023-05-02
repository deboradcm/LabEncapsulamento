package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular implements Localizavel{
	private int codPais;
	private int codArea;
	private int numero;
	
	public Celular(int novoCodPais, int novaArea, int novoNumero) {
		this.setCodPais(novoCodPais);
		this.setCodArea(novaArea);
		this.setNumero(novoNumero);
	}
	
	public final void setCodPais(int NovoCodPais){
		if ((NovoCodPais >= 1) && (NovoCodPais <= 1999)) {
			this.codPais = NovoCodPais;
		} else {
			this.codPais = -1;
		}
		
	}
	
	public int getCodPais(){
		return codPais;
		
	}
	
	public final void setCodArea(int codArea){
		if (codArea >= 10 && codArea <= 99) {
			this.codArea = codArea;
		} else {
			this.codArea = -1;
		}
		
		
	}
	
	public int getCodArea(){
		return codArea;
		
	}
	
	public final void setNumero(int numero){
		if (numero >= 10000000 && numero <= 999999999) {
			this.numero = numero;
		} else {
			this.numero = -1;
		}
		
	}
	
	public int getNumero(){
		return numero;
		
	}
	
	public Posicao getPosicao() {
		Random r = new Random();
		double latitude = -3.160000 + (-2.960000 - (-3.160000) ) * r.nextDouble();
		double longitude = -60.120000 + (-59.820000 - (-60.120000) ) * r.nextDouble();
		double altitude = 15.0 + (100.0 - (15.0) ) * r.nextDouble();
		Posicao posicao = new Posicao(latitude,longitude,altitude) ;
		return posicao;
	}
	
	public double getErroLocalizacao() {
		double erro = 50.0;
		return erro;
	}

}
