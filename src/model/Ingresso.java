package model;

public class Ingresso {
    private int idIngresso;
    private Double valorPago;
    private SalaAssento salaAssento;
    private Sessao sessao;

    public Ingresso(int idIngresso, Double valorPago, Sessao sessao, SalaAssento salaAssento) {
        this.idIngresso = idIngresso;
        this.valorPago = valorPago;
        this.sessao = sessao;
        this.salaAssento = salaAssento;
    }
}
