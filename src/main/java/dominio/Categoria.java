package dominio;


public class Categoria {
	
	public enum ParteSuperior{
		REMERA_CORTA, REMERA_LARGA, MUSCULOSA, REMERA
	}
	public Categoria(ParteSuperior parte_superior) {
		
	}
	
	public enum ParteInferior{
		POLLERA, PANTALON_JEAN, PANTALON_MAMA
	}
	public Categoria(ParteInferior parte_inferior) {
		
	}
	
	public enum Calzado{
		CROCS, BOTAS, ZAPATILLAS
	}
	public Categoria(Calzado calzado) {
		
	}
	
	public enum Accesorio{
		PANUELO_VERDE, ANTEOJOS_SOL, SOMBRERO
	}
	public Categoria(Accesorio accesorio) {
		
	}

}
