package quemepongo;

/**
 * El Tipo de prenda puede ser zapatillas, zapatos, anteojos de sol, remeras, etc
 * es cuestion del programador que los tipos se condiconen con la categoria correctamente.
 *
 * @author Pablo Sorrentino
 * @version final
 */

public class TipoPrenda {

  private final String tipoPrenda;
  private final CategoriaPrenda categoriaPrenda;

  public TipoPrenda(String tipoPrenda, CategoriaPrenda categoriaPrenda) {
    this.tipoPrenda = tipoPrenda;
    this.categoriaPrenda = categoriaPrenda;
  }

  public String getTipoPrenda() {
    return tipoPrenda;
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return categoriaPrenda;
  }
}
