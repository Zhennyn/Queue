package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();
        
        queueCarros.add(new Carro("FORD"));
        queueCarros.add(new Carro("SAVERO"));
        queueCarros.add(new Carro("FIAT"));

        System.out.println(queueCarros.add(new Carro("PEUGEOT")));
        System.out.println((queueCarros));

        System.out.println(queueCarros.offer(new Carro("RENAULT")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

    }
}
