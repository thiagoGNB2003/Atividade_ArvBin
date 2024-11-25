
public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.adicionar(10);
        arvore.adicionar(53);
        arvore.adicionar(15);
        arvore.adicionar(182);
        arvore.adicionar(3);
        arvore.adicionar(6);
        arvore.adicionar(2);

        System.out.println("Profundidade da árvore: " + arvore.calcularProfundidade());
    }
}


