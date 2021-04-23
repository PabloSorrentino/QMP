package quemepongo;

import java.util.Arrays;
import java.util.List;

/**
 * Como usuarie de QuéMePongo,
 * quiero identificar a qué categoría pertenece una prenda
 * (parte superior, calzado, parte inferior, accesorios).
 *
 * @author Pablo Sorrentino
 *
 *
 */

public enum CategoriaPrenda {
  PARTE_SUPERIOR("remera", "remera manga larga", "remera manga corta", "camisa", "musculosa"),
  PARTE_INFERIOR("pantalon", "pollera", "short"),
  CALZADO("zapato", "zapatilla", "bota"),
  ACCESORIO("anteojo", "anteojo de sol" , "cinturon", "mochila", "cartera");

  private final List<String> values;

  CategoriaPrenda(String ... values) {
    this.values = Arrays.asList(values);
  }

  public List<String> getValues() {
    return values;
  }

}
