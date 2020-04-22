package prueba;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import dominio.Color;
import dominio.Material;
import dominio.Categoria;
import dominio.Categoria.ParteSuperior;
import dominio.Prenda;

public class ArmarioTest {

	
	public Categoria remera = new Categoria(ParteSuperior.REMERA);
	public Color rojo;
	public Color gris;
	public Material tela;
	public Prenda remeraRoja;
	
	@Before
	public void initialize() {
				
		remeraRoja = new Prenda(remera, tela, rojo);
		remeraRoja.setColorSecundario(gris);
		
	}
	
		
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	

}
