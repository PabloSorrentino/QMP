package quemepongo.excepciones;

/**
 * Indica que falta definir un aspecto importante para la creacion de una prenda como trama,
 * colorPrimario, tipo de prenda, etc.
 *
 * @author Pablo Sorrentino
 *
 *
 */

public class FaltanDefinirAspectosException extends RuntimeException {
  public FaltanDefinirAspectosException(String s) {
  }
}
