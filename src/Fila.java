import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {
    private Queue<Object> fila;

    public Fila() {
        this.fila = new LinkedList<>();
    }

    public void enfileirar(Object elemento) {
        fila.add(elemento);
    }

    public Object desenfileirar() {
        return fila.poll();
    }

    public void inverter() {
        Stack<Object> pilha = new Stack<>();
        
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }

    @Override
    public String toString() {
        return fila.toString();
    }

    public int contarOcorrencias(Object valor) {
        int contador = 0;
        int tamanhoFila = fila.size();
        
        for (int i = 0; i < tamanhoFila; i++) {
            Object elemento = fila.poll();
            if (elemento.equals(valor)) {
                contador++;
            }
            fila.add(elemento);
        }
        
        return contador;
    }
}