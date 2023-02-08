package org.example;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);  // this significa auto referencia, se refere ao próprio objeto que chamou
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {   // void significa sem retorno
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
