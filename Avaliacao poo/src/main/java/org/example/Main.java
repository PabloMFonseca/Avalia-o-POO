package org.example;

public class Main {
    public static void main(String[] args) {
        Camisa camisa = new Camisa();
        camisa.setCor("Vemerlho");
        camisa.setTamanho("GG");
        camisa.setPreco(50.00);

        camisa.exibirdetalhes();

        CamisaEstampa camisaestampa = new CamisaEstampa();
        camisaestampa.setCor("Preto");
        camisaestampa.setTamanho("M");
        camisaestampa.setPreco(60.00);
        camisaestampa.setEstampa("Homem aranha");

       camisaestampa.exibirdetalhes();



    }
}