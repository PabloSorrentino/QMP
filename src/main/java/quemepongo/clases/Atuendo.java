package quemepongo.clases;


import java.util.ArrayList;
import java.util.List;

/**
 * Un atuendo es una combinación de prendas que tiene sentido usar juntas.
 *
 * @author Pablo Sorrentino - Grupo 14
 * @version final
 */

public class Atuendo {

  private final List<Prenda> prendas;

  public Atuendo() {
    prendas = new ArrayList<>();

  }

  public Borrador empezarBorrador() {
    return new Borrador();
  }

  public void cargarBorrador(Borrador borrador) {
    this.agregarPrenda(borrador.crearPrenda());
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

}
