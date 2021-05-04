

import org.junit.jupiter.api.Test;
import quemepongo.clases.Atuendo;
import quemepongo.clases.Borrador;
import quemepongo.clases.Prenda;
import quemepongo.enums.Material;
import quemepongo.enums.TipoPrenda;
import quemepongo.enums.TramaPrenda;
import quemepongo.excepciones.CategoriaNoSeCondiceConElTipoException;
import quemepongo.enums.CategoriaPrenda;
import quemepongo.excepciones.FaltanDefinirAspectosException;

import static org.junit.jupiter.api.Assertions.*;

public class TipoPrendaTest {

  @Test
  public void unaRemeraNoEsUnCalzado() {

    assertThrows(CategoriaNoSeCondiceConElTipoException.class,
    () ->new Prenda(TipoPrenda.REMERA_MANGA_CORTA,
                                      Material.ALGODON,
                                      TramaPrenda.ESTAMPADO,
                                      CategoriaPrenda.CALZADO,
                                      "rojo",
                                      null)
    );

  }

  @Test
  public void unAnteojoEsUnAccesorio() {

    quemepongo.clases.Prenda prenda = new Prenda(TipoPrenda.ANTEOJO_SOL, Material.PLASTICO, TramaPrenda.LISA, CategoriaPrenda.ACCESORIO, "negro", null);

    assertEquals(prenda.getCategoriaPrenda(), CategoriaPrenda.ACCESORIO);
  }

  @Test
  public void unaPolleraDeTelaEsDeTelaYNoEsParteSuperior(){

    quemepongo.clases.Prenda prenda = new quemepongo.clases.Prenda(TipoPrenda.POLLERA, Material.TELA, TramaPrenda.RAYADA,CategoriaPrenda.PARTE_INFERIOR,"verde", "amarilla");

    assertNotEquals(prenda.getCategoriaPrenda(), CategoriaPrenda.PARTE_SUPERIOR);
    assertEquals(prenda.getMaterial().name(), "TELA");
  }

  @Test
  public void unaMochilaNoEsUnaPrendaSuperior() {

    assertThrows(CategoriaNoSeCondiceConElTipoException.class,
        () ->new quemepongo.clases.Prenda(TipoPrenda.MOCHILA, Material.KEVLAR, null,CategoriaPrenda.PARTE_SUPERIOR,"rojo", "negro")
    );
  }

  @Test
  public void unaMochilaEsUnAccesorioDeColorRojoYNegro() {

   quemepongo.clases.Prenda prenda = new quemepongo.clases.Prenda(TipoPrenda.MOCHILA, Material.KEVLAR, null,CategoriaPrenda.ACCESORIO,"rojo", "negro");

   assertEquals(prenda.getColorPrimario(), "rojo");
    assertEquals(prenda.getColorSecundario(), "negro");


  }


  @Test
  public void unAtuendoTieneCuatroPrendas() {

    Atuendo atuendo = new Atuendo();

    atuendo.agregarPrenda(new Prenda(TipoPrenda.ANTEOJO_SOL, Material.PLASTICO, TramaPrenda.LISA, CategoriaPrenda.ACCESORIO, "negro", null));
    atuendo.agregarPrenda(new Prenda(TipoPrenda.REMERA_MANGA_CORTA, Material.ALGODON, TramaPrenda.ESTAMPADO, CategoriaPrenda.PARTE_SUPERIOR, "rojo", null));
    atuendo.agregarPrenda(new Prenda(TipoPrenda.PANTALON, Material.JEAN, null,CategoriaPrenda.PARTE_INFERIOR,"azul", null));
    atuendo.agregarPrenda(new Prenda(TipoPrenda.ZAPATILLA, Material.TELA, TramaPrenda.RAYADA, CategoriaPrenda.CALZADO,"negro", "blanco"));

    assertEquals(atuendo.getPrendas().size(), 4);


  }


  @Test
  public void unBorradorDeUnaCamisaSinTipoTiraException() {
    Borrador borrador = new Borrador();

    borrador.setCategoriaPrenda(CategoriaPrenda.PARTE_SUPERIOR);
    borrador.setColorPrimario("azul");
    borrador.setTrama(TramaPrenda.LISA);
    borrador.setMaterial(Material.TELA);

    assertThrows(FaltanDefinirAspectosException.class,
        () -> borrador.crearPrenda()
    );

  }

  @Test
  public void porDefectoLaTramaEsLisa() {

    assertEquals(new Prenda(TipoPrenda.ANTEOJO_SOL, Material.PLASTICO, null, CategoriaPrenda.ACCESORIO, "negro", null).getTrama(),
                 TramaPrenda.LISA);
  }


}
