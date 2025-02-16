public class Libro {
    private String autor;
    private String titulo;
    private String genero;
    private String codigoBarras;

    public Libro(String autor, String titulo, String genero, String codigoBarras) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.codigoBarras = codigoBarras;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nGénero: " + genero + "\nCódigo de Barras: " + codigoBarras + "\n";
    }
}
