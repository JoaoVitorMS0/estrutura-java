package com.estudo;

public class Empresa {
    private String nome;
    private String inscricao;
    private long valor;
    
    public Empresa(String nome, String inscricao, long valor) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.valor = valor;
    }
    
    public String getNome() { return nome; }
    public String getInscricao() { return inscricao; }
    public long getValor() { return valor; }
    
    public String getValorFormatado() {
        return String.format("R$ %d.%02d", valor / 100, valor % 100);
    }
    
    @Override
    public String toString() {
        return String.format("%s | %s | %s", nome, inscricao, getValorFormatado());
    }
}