public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("A");
        fila.enfileirar("C");

        System.out.println("Fila original: " + fila);
        fila.inverter();
        System.out.println("Fila invertida: " + fila); 

        int contagem = fila.contarOcorrencias("A");
        System.out.println("Contagem de 'A': " + contagem);
    }
}
