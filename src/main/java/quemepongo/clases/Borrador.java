package quemepongo.clases;

import quemepongo.enums.CategoriaPrenda;
import quemepongo.enums.Material;
import quemepongo.enums.TipoPrenda;
import quemepongo.enums.TramaPrenda;
import quemepongo.excepciones.FaltanDefinirAspectosException;

/**
 *El borrador implementa el patron Builder para permitir empezar a crear una Prenda, poder
 * guardarla y continuar luego. Finaliza con el metodo crearPrenda.
 *
 *
 * @author Pablo Sorrentino - Grupo 14
 *
 * @version final
 */


public class Borrador {

  private TipoPrenda tipoPrenda;
  private  CategoriaPrenda categoriaPrenda;
  private  Material material;
  private  String colorPrimario;
  private  TramaPrenda trama;
  private  String colorSecundario;

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setCategoriaPrenda(CategoriaPrenda categoriaPrenda) {
    this.categoriaPrenda = categoriaPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColorPrimario(String colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setTrama(TramaPrenda trama) {
    this.trama = trama;
  }

  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  /**
  * Corrobora que los parametros primarios no sean NULL, si lo son tira una excepcion
  * que hereda de RunTime y sino retorna la prenda creada.
  */

  public Prenda crearPrenda() {

    if (corroborarAspectosDePrendaValidos()) {
      throw new FaltanDefinirAspectosException("Falta un aspecto como tipo, "
          + "material, "
          + "trama, "
          + "categoria o "
          + "color primario");
    }

    return new Prenda(tipoPrenda,
        material,
        trama,
        categoriaPrenda,
        colorPrimario,
        colorSecundario);
  }


  private boolean corroborarAspectosDePrendaValidos() {

    boolean almenosUnParametroNull = false;

    if (tipoPrenda == null || material == null || categoriaPrenda == null
        || trama == null || colorPrimario == null) {
      almenosUnParametroNull = true;
    }
    return almenosUnParametroNull;
  }

}
