package dominio;

public class ParteInferior implements Categoria {
	
	public enum _ParteInferior{
		POLLERA, PANTALON_JEAN, PANTALON_MAMA
	}

	public _ParteInferior parteInferior;
	
	public String queSoy() {
		
		return this.parteInferior.toString();
	}

}
