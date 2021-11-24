
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasTotales, boolean libroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasTotales;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTítuloLibro() {
        return titulo;
    }
    
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    public int getPaginas() {
        return numeroPaginas;
    }
    
    public void imprimirDetalles() {
        String numRefProv1 = numeroReferencia;
        if (numRefProv1.length() < 3 ){
            numRefProv1 = "ZZZ";    
        }
        String libroDeTexto;
        if(esLibroDeTexto == true) {
            libroDeTexto = "Es usado como libro de texto";    
        }
        else{
            libroDeTexto = "No es usado como libro de texto";
        }
        System.out.println("Título:"+ titulo + "/" + "Autor:" + autor + " / "+ "Páginas:" + numeroPaginas + "/" +"Numero de Referencia:" + numRefProv1 + "/" + "Veces prestado:" + vecesPrestado + "/" + libroDeTexto);
    }
    
    public String getDetalles() {  
        String numRefProv2 = numeroReferencia;
        if(numRefProv2.length() < 3){
            numRefProv2 = "ZZZ";
        }
        String libroDeTexto;
        if(esLibroDeTexto == true) {
            libroDeTexto = "Es usado como libro de texto";    
        }
        else{
            libroDeTexto = "No es usado como libro de texto";
        }
        return "Título:"+ titulo + "/" + "Autor:" + autor + " / "+ "Páginas:" + numeroPaginas + "/" +"Numero de Referencia:" + numRefProv2 + "/" + "Veces prestado:" + vecesPrestado + "/" + libroDeTexto;
    }
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String nRef) {
        String numRef = numeroReferencia;
        numeroReferencia = nRef;
        if(nRef.length() < 3){
            System.out.println("ERROR --- Numero de referencia demasiado corto"); 
            numeroReferencia = numRef;
        }
    }
    
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;    
    }
    
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    public String getEsLibroDeTexto() {
        String libroDeTexto;
        if(esLibroDeTexto == true) {
            libroDeTexto = "Es usado como libro de texto";    
        }
        else{
            libroDeTexto = "No es usado como libro de texto";
        }
        return libroDeTexto;
    }
}
