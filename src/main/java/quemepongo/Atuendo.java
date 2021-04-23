package quemepongo;

import java.util.*;


/**
 * Un atuendo es una combinación de prendas que tiene sentido usar juntas.
 *
 * @author Pablo Sorrentino - Grupo 14
 * @version final
 */

public class Atuendo {

  private final List<Prenda> prendas;

  public Atuendo() {
    prendas = new ArrayList<Prenda>();

  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

}
