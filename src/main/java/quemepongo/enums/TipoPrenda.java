package quemepongo.enums;

/**
 * Como usuarie de QuéMePongo,
 * quiero identificar a primero el tipo de prenda.
 *
 * @author Pablo Sorrentino
 */
public enum TipoPrenda {
  REMERA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  REMERA_MANGA_LARGA(CategoriaPrenda.PARTE_SUPERIOR),
  CAMISA(CategoriaPrenda.PARTE_SUPERIOR),
  MUSCULOSA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR),
  POLLERA(CategoriaPrenda.PARTE_INFERIOR),
  SHORT(CategoriaPrenda.PARTE_INFERIOR),
  ZAPATO(CategoriaPrenda.CALZADO),
  ZAPATILLA(CategoriaPrenda.CALZADO),
  BOTA(CategoriaPrenda.CALZADO),
  ANTEOJO_SOL(CategoriaPrenda.ACCESORIO),
  CARTERA(CategoriaPrenda.ACCESORIO),
  MOCHILA(CategoriaPrenda.ACCESORIO);

  private final CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public CategoriaPrenda getCategoria() {
    return categoria;
  }

}
