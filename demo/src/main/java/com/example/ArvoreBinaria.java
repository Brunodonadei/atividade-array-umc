
public class ArvoreBinaria {
    private No raiz;

public void inserir(int novoValor) {
    if (raiz == null) {
        raiz = new No(novoValor);
        System.out.println("Nó raiz inserido: " + novoValor);
    } else {
        inserirRecursivo(raiz, novoValor);
    }
}

private void inserirRecursivo(No atual, int valor) {
    if (valor < atual.valor) {
        // Vai para a esquerda
        if (atual.esquerda == null) {
            atual.esquerda = new No(valor);
            System.out.println("Inserido à esquerda de " + atual.valor + ": " + valor);
        } else {
            inserirRecursivo(atual.esquerda, valor);
        }
    } else if (valor > atual.valor) {
        // Vai para a direita
        if (atual.direita == null) {
            atual.direita = new No(valor);
            System.out.println("Inserido à direita de " + atual.valor + ": " + valor);
        } else {
            inserirRecursivo(atual.direita, valor);
        }
    } else {

        System.out.println("Valor já existe na árvore: " + valor);
    }
}


public void exibirEmOrdem() {
    System.out.print("Árvore em ordem: ");
    emOrdem(raiz);
    System.out.println();
}

private void emOrdem(No atual) {
    if (atual != null) {
        emOrdem(atual.esquerda);
        System.out.print(atual.valor + " ");
        emOrdem(atual.direita);
    }

}
}