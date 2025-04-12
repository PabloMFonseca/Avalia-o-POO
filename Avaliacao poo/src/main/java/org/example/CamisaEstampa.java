package org.example;

public class CamisaEstampa extends Camisa {
    private String estampa;

    public CamisaEstampa(){

    }

    public CamisaEstampa(String estampa) {
        this.estampa = estampa;
    }

    public CamisaEstampa(String cor, Double preco, String tamanho, String estampa) {
        super(cor, preco, tamanho);
        this.estampa = estampa;
    }

    public String setEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    public void exibirdetalhes () {
        System.out.println("A estampa da sua camisa é: " + this.estampa);
        System.out.println("A cor da sua camisa com estampa é: " + getCor());
        System.out.println("O tamanho da sua camisa com estampa é: " + getTamanho());
        System.out.println("O preço da sua camisa com estampa sem, desconto é: " + getPreco() );
        System.out.println("O preço da sua camisa com estampa e com desconto é: " + getPreco() * 0.90);
    }
}
