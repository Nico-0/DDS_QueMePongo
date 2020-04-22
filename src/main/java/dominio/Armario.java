package dominio;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;


public class Armario {

	public List<Prenda> prendas = new ArrayList<Prenda>();	
	
	
	public void agregarPrenda(Categoria categoria, Material material, Color color) throws FalloAgregar{
		
		try {
		prendas.add(new Prenda(categoria, material, color));
		}
		catch(FalloPrecondicion e){
			throw new FalloAgregar("Fallo al agregar esa prenda");
		}

	}
	
	
	
	/*
	public String getAtuendo() {

		return "Mi lista de atuendo quedo de tipo: "+ prendas.stream().map(prenda -> prenda.getCategoria()).collect(Collectors.toList()) + 
				", de material: "+ prendas.stream().map(prenda -> prenda.getMaterial()).collect(Collectors.toList()) +
				", y de color"+ prendas.stream().map(prenda -> prenda.getColor()).collect(Collectors.toList());
	}
	*/
}
