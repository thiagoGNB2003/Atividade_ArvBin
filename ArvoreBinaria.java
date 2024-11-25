
public class ArvoreBinaria {

    private No raiz;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if (raiz == null) {
            raiz = novoNo;
            return;
        }

        No atual = raiz;
        while (true) {
            if (valor < atual.getValor()) {
                if (atual.getEsquerdo() == null) {
                    atual.setEsquerdo(novoNo);
                    return;
                }
                atual = atual.getEsquerdo();
            } else if (valor > atual.getValor()) {
                if (atual.getDireito() == null) {
                    atual.setDireito(novoNo);
                    return;
                }
                atual = atual.getDireito();
            } else {
                return;
            }
        }
    }

    public int calcularProfundidade() {
        return calcularProfundidadeRecursivo(raiz);
    }

    private int calcularProfundidadeRecursivo(No no) {
        if (no == null) {
            return 0;
        }

        int profundidadeEsquerda = calcularProfundidadeRecursivo(no.getEsquerdo());
        int profundidadeDireita = calcularProfundidadeRecursivo(no.getDireito());

        return Math.max(profundidadeEsquerda, profundidadeDireita) + 1;
    }
}
