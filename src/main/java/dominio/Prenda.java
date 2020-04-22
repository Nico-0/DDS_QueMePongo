package dominio;

public class Prenda {

	public Categoria categoria;
	public Material material;
	public Color color;
	public Color colorSecundario;
	
	public String getCategoria() {
		return categoria.toString();
	}
	public String getMaterial() {
		return material.toString();
	}
	public String getColor() {
		return color.toString();
	}
		
}
