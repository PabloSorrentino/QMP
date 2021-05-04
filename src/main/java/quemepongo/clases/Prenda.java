package quemepongo.clases;

import quemepongo.enums.CategoriaPrenda;
import quemepongo.enums.Material;
import quemepongo.enums.TipoPrenda;
import quemepongo.enums.TramaPrenda;
import quemepongo.excepciones.CategoriaNoSeCondiceConElTipoException;


/**
 * Una prenda tiene un tipo, una categoria a la que pertenece,
 * el material / tela de la que esta hecha la prenda,
 * un color principal obligatorio, uno secundario opcional y
 * finalmente los tipos entre prendas se tienen que condicionar.
 *
 * @author Pablo Sorrentino - Grupo 14
 *
 * @version final
 */

public class Prenda {

  private final TipoPrenda tipoPrenda;
  private final CategoriaPrenda categoriaPrenda;
  private final Material material;
  private final String colorPrimario;
  private final TramaPrenda trama;
  private final String colorSecundario;


  /**
   * Recibe como parametros los aspectos de la prenda, solicitando primero el tipo.
   */
  public Prenda(TipoPrenda tipoPrenda,
                Material material,
                TramaPrenda trama,
                CategoriaPrenda categoriaPrenda,
                String colorPrimario,
                String colorSecundario) {

    if (tipoPrenda.getCategoria() != categoriaPrenda) {
      throw new CategoriaNoSeCondiceConElTipoException(tipoPrenda, categoriaPrenda);
    }
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama == null ?  TramaPrenda.LISA : trama;
    this.categoriaPrenda = categoriaPrenda;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }


  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return categoriaPrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public String getColorPrimario() {
    return colorPrimario;
  }

  public String getColorSecundario() {
    return colorSecundario == null ? "ninguno" : colorSecundario;
  }

  public TramaPrenda getTrama() {
    return trama;
  }

}
