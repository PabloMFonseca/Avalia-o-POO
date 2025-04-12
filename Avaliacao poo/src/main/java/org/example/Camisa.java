package org.example;

public class Camisa {
    private String cor;
    private String tamanho;
    private Double preco;

    public Camisa(){

    }

    public Camisa(String cor, Double preco, String tamanho) {
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco  ;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }


    public void exibirdetalhes () {
        System.out.println("A cor da sua camisa sem estampa é: " + this.cor);
        System.out.println("O tamanho da sua camisa sem estampa é: " + this.tamanho);
        System.out.println("O preço da sua camisa sem estampa e sem desconto é: " + this.preco );
        System.out.println("O preço da sua camisa sem estampa com desconto é: " + this.preco * 0.90);


        }
    }


































