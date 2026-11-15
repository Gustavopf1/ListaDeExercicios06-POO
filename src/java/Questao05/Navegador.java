package Questao05;

import java.util.ArrayDeque;
import java.util.Deque;

public class Navegador {

    public static void main(String[] args) {

        Deque<String> paginas = new ArrayDeque<>();

        paginas.push("Google");
        paginas.push("YouTube");
        paginas.push("GitHub");

        System.out.println("Pagina atual: " + paginas.peek());

        paginas.pop();

        System.out.println("Pagina anterior: " + paginas.peek());

        paginas.pop();

        System.out.println("Pagina anterior: " + paginas.peek());
    }
}
