package u2.floresta;

public class Arvore {

    // Atributos estáticos - pertencem a classe
    private static final float MAX_ALTURA = 40.0f;
    private static int quantidade = 0;

    // Atributos dinâmicos - pertencem ao objeto criado a partir da classe
    private String nome;
    private float altura;

    // construtor padrão
    public Arvore() {
        quantidade++;
    }

    // construtor customizado
    public Arvore(String nome, float altura) {
        this();
        this.nome = nome;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Árvore %s - altura: %f m", nome, altura);
    }

    // método estático - pertence a classe
    public static int getQuantidade() {
        return quantidade;
    }

    public void balancar() {
        System.out.println("Árvore " + this.nome + " balançando . . .");
    }
}
