package quemepongo;

public class CategoriaNoSeCondiceConElTipoException extends RuntimeException{

  public CategoriaNoSeCondiceConElTipoException(String prenda, CategoriaPrenda categoria) {
    super(prenda + " no es un " + categoria.name());
  }


}
