public class ListaEncadeada {
    private No head;

    // Adiciona no final da lista
    public void adicionar(String valor) {
        No novo = new No(valor);
        if (head == null) {
            head = novo;
        } else {
            No atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    // Adiciona em uma posição específica (0 = início, ... tamanho = final)
    public boolean adicionarEmPosicao(int pos, String valor) {
        No novo = new No(valor);
        if (pos == 0) {
            novo.proximo = head;
            head = novo;
            return true;
        }
        No atual = head;
        int i = 0;
        while (atual != null && i < pos - 1) {
            atual = atual.proximo;
            i++;
        }
        if (atual == null) return false; // posição inválida
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        return true;
    }

    // Busca por valor — retorna posição (0, 1, 2...), ou -1 se não achar
    public int buscar(String valor) {
        No atual = head;
        int pos = 0;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return pos;
            }
            atual = atual.proximo;
            pos++;
        }
        return -1;
    }

    // Remove o primeiro nó
    public boolean removerPrimeiro() {
        if (head == null) return false;
        head = head.proximo;
        return true;
    }

    // Remove o último nó
    public boolean removerUltimo() {
        if (head == null) return false;
        if (head.proximo == null) {
            head = null;
            return true;
        }
        No atual = head;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = null;
        return true;
    }

    // Remove elemento em posição específica
    public boolean removerEmPosicao(int pos) {
        if (head == null) return false;
        if (pos == 0) {
            return removerPrimeiro();
        }
        No atual = head;
        int i = 0;
        while (atual.proximo != null && i < pos - 1) {
            atual = atual.proximo;
            i++;
        }
        if (atual.proximo == null) return false; // posição inválida
        atual.proximo = atual.proximo.proximo;
        return true;
    }

    // Exibe todos os elementos
    public void exibir() {
        No atual = head;
        System.out.println("Lista Encadeada:");
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
