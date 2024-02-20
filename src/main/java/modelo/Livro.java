package modelo;

public class Livro {
    private int prazo;
    private boolean exemplarBiblioteca;
    private Titulo titulo;

    public Livro(int codigo) {
        this.titulo = new Titulo(codigo);
        this.exemplarBiblioteca = (codigo == 2 || codigo == 4);
    }

    public int verPrazo() {
        return titulo.getPrazo();
    }

    public boolean verificaLivro() {
        return exemplarBiblioteca;
    }
}
