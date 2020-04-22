package dominio;

public class Accesorio implements Categoria {

	public enum _Accesorio{
		PANUELO_VERDE, ANTEOJOS_SOL, SOMBRERO
	}

	public _Accesorio accesorio;
	
	public String queSoy() {
		
		return this.accesorio.toString();
	}
	
}
