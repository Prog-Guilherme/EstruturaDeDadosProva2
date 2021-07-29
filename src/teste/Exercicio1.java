package teste;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {

        Queue<String> fila = new LinkedList<>();

        fila.add("Lucas");
        fila.add("Carlos");
        fila.add("Samira");
        fila.add("Celma"); 
        
        Random foraFila = new Random();
        int num = 0;
        while (num == 0){
            num = foraFila.nextInt(5);
        }
        System.out.println("Potato hot, hot, hot, burned... na posição: " + num);
        while (fila.size() > 1){
            for (int i = 0; i < num; i++) {
                fila.add(fila.remove()); 
            }
            System.out.println("Eliminado: " + fila.remove());
        }

        System.out.println("Ganhador: " + fila);
    }
}