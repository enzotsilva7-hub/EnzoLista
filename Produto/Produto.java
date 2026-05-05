package Produto;

public class Produto {

    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }
}

    class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook da Apple", 100.000);
        Produto p2 = new Produto("iPhone 7", 18000.00);

        System.out.println(p1);
        System.out.println(p2);




        // achou caro pai ? reclama com Lule 

    }
}
