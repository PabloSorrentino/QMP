package quemepongo.excepciones;

import quemepongo.enums.CategoriaPrenda;
import quemepongo.enums.TipoPrenda;

/**
 * Indica que la categoria seleccionada no se condice
 * con la categoria pre definina del tipo de tela.
 *
 * @author Pablo Sorrentino
 *
 *
 */

public class CategoriaNoSeCondiceConElTipoException extends RuntimeException {

  public CategoriaNoSeCondiceConElTipoException(TipoPrenda prenda, CategoriaPrenda categoria) {
    super(prenda.name() + " no es un " + categoria.name());
  }


}
