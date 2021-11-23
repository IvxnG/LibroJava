
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasTotales)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasTotales;
        numeroReferencia = "";
        vecesPrestado = 0;
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
        if (numeroReferencia.length() == 0 ){
            System.out.println("Título: "+ titulo + " / " + "Autor: " + autor + " / "+ "Páginas: " + numeroPaginas + " / " + "Numero de Referencia:ZZZ " + " / " + "Veces prestado: " + vecesPrestado);
        }
        else {
            System.out.println("Título: "+ titulo + " / " + "Autor: " + autor + " / "+ "Páginas: " + numeroPaginas + " / " + "Numero de Referencia: " + numeroReferencia + " / " + "Veces prestado: " + vecesPrestado);    
        }
    }
    
    public String getDetalles() {  
        if(numeroReferencia.length() == 0 ){
            return "Título: "+ titulo + " / " + "Autor: " + autor + " / "+ "Páginas: " + numeroPaginas + " / " + "Numero de Referencia:ZZZ " + " / " + "Veces prestado: " + vecesPrestado;   
        }
        else {
            return "Título: "+ titulo + " / " + "Autor: " + autor + " / "+ "Páginas: " + numeroPaginas + " / " + "Numero de Referencia: " + numeroReferencia + " / " + "Veces prestado: " + vecesPrestado;
        }
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
}
