

import org.junit.jupiter.api.Test;
import quemepongo.Atuendo;
import quemepongo.CategoriaNoSeCondiceConElTipoException;
import quemepongo.CategoriaPrenda;
import quemepongo.Prenda;

import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  @Test
  public void unaRemeraNoEsUnCalzado() {

    assertThrows(CategoriaNoSeCondiceConElTipoException.class,
    () ->new Prenda("remera", "algodon", CategoriaPrenda.CALZADO,"rojo")
    );

  }

  @Test
  public void unAnteojoEsUnAccesorio() {

    Prenda prenda = new Prenda("anteojo", "plastico", CategoriaPrenda.ACCESORIO,"negro");

    assertEquals(prenda.getCategoriaPrenda(), CategoriaPrenda.ACCESORIO);
  }

  @Test
  public void unaPolleraDeTelaEsDeTelaYNoEsParteSuperior(){

    Prenda prenda = new Prenda("pollera", "tela", CategoriaPrenda.PARTE_INFERIOR,"verde", "amarilla");

    assertNotEquals(prenda.getCategoriaPrenda(), CategoriaPrenda.PARTE_SUPERIOR);
    assertEquals(prenda.getMaterial(), "tela");
  }

  @Test
  public void unaMochilaNoEsUnaPrendaSuperior() {

    assertThrows(CategoriaNoSeCondiceConElTipoException.class,
        () ->new Prenda("mochila", "kevlar", CategoriaPrenda.PARTE_SUPERIOR,"rojo", "negro")
    );
  }

  @Test
  public void unaMochilaEsUnAccesorioDeColorRojoYNegro() {

   Prenda prenda = new Prenda("mochila", "kevlar", CategoriaPrenda.ACCESORIO,"rojo", "negro");

   assertEquals(prenda.getColorPrimario(), "rojo");
    assertEquals(prenda.getColorSecundario(), "negro");


  }


  @Test
  public void unAtuendoTieneCuatroPrendas() {

    Atuendo atuendo = new Atuendo();

    atuendo.agregarPrenda(new Prenda("anteojo de sol", "plastico", CategoriaPrenda.ACCESORIO,"negro"));
    atuendo.agregarPrenda(new Prenda("remera manga corta", "algodon", CategoriaPrenda.PARTE_SUPERIOR,"azul"));
    atuendo.agregarPrenda(new Prenda("pantalon", "jean", CategoriaPrenda.PARTE_INFERIOR,"azul"));
    atuendo.agregarPrenda(new Prenda("zapatilla", "tela", CategoriaPrenda.CALZADO,"negro", "blanco"));

    assertEquals(atuendo.getPrendas().size(), 4);


  }


}
