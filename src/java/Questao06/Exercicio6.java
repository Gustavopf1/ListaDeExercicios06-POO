package Questao06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercicio6 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(5, -3, 8, -1, 10);

        List<Integer> positivos = numeros.stream()
                .filter(numero -> numero >= 0)
                .collect(Collectors.toList());

        System.out.println("Numeros positivos: " + positivos);

        List<String> nomes = List.of("Pedro", "Ana", "Paulo", "Maria");

        nomes.stream()
                .filter(nome -> nome.startsWith("P"))
                .forEach(System.out::println);

        String texto = "Java e legal e Java e poderoso";

        Set<String> palavras = Arrays.stream(texto.split(" "))
                .collect(Collectors.toSet());

        System.out.println("Palavras unicas: " + palavras);
    }
}
