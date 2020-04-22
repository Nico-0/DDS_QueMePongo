package dominio;

public class Prenda {

	public Categoria categoria;
	public Material material;
	public Color color;
	public Color colorSecundario;
	
	//Constructor para validacion por nulos (Al instanciar la clase por constructor, siempre va a estar en un estado valido la prenda)
	public Prenda(Categoria categoria, Material material, Color color ) throws FalloPrecondicion{  //constructor, mismo nombre que la clase, parametros al instanciar un objeto de clase
		
		if(categoria == null){
			throw new FalloPrecondicion("Falta categoria");
		}
		if(material == null){
			throw new FalloPrecondicion("Falta material");
		}
		if(color == null){
			throw new FalloPrecondicion("Falta color principal");
		}
		
		this.categoria = categoria;
		this.material = material;
		this.color = color;
				
	}
	
	//El constructor es la base, y para los opcionales uso un setter 
	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
	public String getCategoria() {
		return categoria.toString();
	}
	public String getMaterial() {
		return material.toString();
	}
	public String getColor() {
		return color.toString();
	}
	public String getColorSecundario() {
		return colorSecundario.toString();
	}
		
}
