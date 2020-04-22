package dominio;

public class Calzado implements Categoria {
	
	public enum _Calzado{
		CROCS, BOTAS, ZAPATILLAS
	}

	public _Calzado calzado;
	
	public String queSoy() {
		
		return this.calzado.toString();
	}
}
