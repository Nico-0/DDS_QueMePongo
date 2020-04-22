package dominio;

public class ParteSuperior implements Categoria {
	
	public enum _ParteSuperior{
		REMERA_CORTA, REMERA_LARGA, MUSCULOSA
	}

	public _ParteSuperior parteSuperior;
	
	public String queSoy() {
		
		return this.parteSuperior.toString();
	}

}
