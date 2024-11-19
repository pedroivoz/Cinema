package model;

public class Filme {
    private int idFilme;
    private String titulo;
    private int classificacao;
    private Genero genero;
    private String status;

    public Filme(int idFilme, int classificacao, String titulo, Genero genero, String status) {
        this.idFilme = idFilme;
        this.classificacao = classificacao;
        this.titulo = titulo;
        this.genero = genero;
        this.status = status;
    }
}
