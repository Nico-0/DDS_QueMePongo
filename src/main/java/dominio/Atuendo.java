package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atuendo {

	public List<Prenda> prendas = new ArrayList<Prenda>();	
	
	//falta que haya solo una prenda de cada categoria
	
	public String getAtuendo() {
				
		//excepcion para que hayan sido definidos los tres requerimientos
		return "Mi lista de atuendo quedo de tipo: "+ prendas.stream().map(prenda -> prenda.getCategoria()).collect(Collectors.toList()) + 
				", de material: "+ prendas.stream().map(prenda -> prenda.getMaterial()).collect(Collectors.toList()) +
				", y de color"+ prendas.stream().map(prenda -> prenda.getColor()).collect(Collectors.toList());
	}

}
