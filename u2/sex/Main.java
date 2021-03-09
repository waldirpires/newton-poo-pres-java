package u2.floresta;

public class Main {

    public static void main(String[] args) {
        // construtor padrão
        var arvore1 = new Arvore();
        System.out.println(arvore1);
        System.out.println("Quantidade de árvores: " + Arvore.getQuantidade());

        // construtor customizado - uso de parâmetros
        var arvore2 = new Arvore("Jatobá", 10.5f);
        System.out.println(arvore2);
        System.out.println("Quantidade de árvores: " + Arvore.getQuantidade());

        arvore2.balancar();
    }
}
