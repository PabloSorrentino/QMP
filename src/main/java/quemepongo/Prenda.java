package quemepongo;

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

  private final String tipoPrenda;
  private final CategoriaPrenda categoriaPrenda;
  private final String material;
  private final String colorPrimario;
  private String colorSecundario = null;

  public Prenda(String tipoPrenda, String material, CategoriaPrenda categoriaPrenda, String colorPrimario) {

    if (!categoriaPrenda.getValues().contains(tipoPrenda)) {
      throw new CategoriaNoSeCondiceConElTipoException(tipoPrenda, categoriaPrenda);
    }

    this.tipoPrenda = tipoPrenda;
    this.categoriaPrenda = categoriaPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }

  public Prenda(String tipoPrenda, String material, CategoriaPrenda categoriaPrenda, String colorPrimario, String colorSecundario) {

    this(tipoPrenda, material, categoriaPrenda, colorPrimario);
    this.colorSecundario = colorSecundario;
  }



  public String getTipoPrenda() {
    return tipoPrenda;
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return categoriaPrenda;
  }

  public String getMaterial() {
    return material;
  }

  public String getColorPrimario() {
    return colorPrimario;
  }

  public String getColorSecundario() {
    return colorSecundario == null ? "ninguno" : colorSecundario;
  }
}
