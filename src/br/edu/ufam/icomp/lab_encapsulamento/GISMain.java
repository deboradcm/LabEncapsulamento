package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
	public static void main (String args[]) {
		CarroLuxuoso carro1 = new CarroLuxuoso("2345");
		CarroLuxuoso carro2 = new CarroLuxuoso("15678");
		Celular celular1 = new Celular(5,4,78);
		Celular celular2 = new Celular(7,9,35);
		
		Localizavel vetorLocalizaveis[] = new Localizavel [4];
		vetorLocalizaveis[0] = carro1;
		vetorLocalizaveis[1] = carro2;
		vetorLocalizaveis[2] = celular1;
		vetorLocalizaveis[3] = celular2;
		
		
	
		
		
		for (var i = 0; i< vetorLocalizaveis.length; i++) {
			System.out.println(vetorLocalizaveis[i].getPosicao());
		}
		
	
		
		
	}

}
