package Questao04;

import java.util.HashMap;
import java.util.Map;

public class CadastroUsuarios {

    public static void main(String[] args) {

        Map<String, Usuario> usuarios = new HashMap<>();

        cadastrar(usuarios, new Usuario("joao@gmail.com", "Joao", "123"));
        cadastrar(usuarios, new Usuario("maria@gmail.com", "Maria", "456"));
        cadastrar(usuarios, new Usuario("joao@gmail.com", "Pedro", "789"));

        System.out.println("Lista de usuarios:");
        listar(usuarios);

        remover(usuarios, "joao@gmail.com");

        System.out.println("Lista apos remocao:");
        listar(usuarios);
    }

    public static void cadastrar(Map<String, Usuario> usuarios, Usuario usuario) {
        if (usuarios.containsKey(usuario.getEmail())) {
            System.out.println("Email ja cadastrado!");
        } else {
            usuarios.put(usuario.getEmail(), usuario);
            System.out.println("Usuario cadastrado!");
        }
    }

    public static void listar(Map<String, Usuario> usuarios) {
        for (Usuario usuario : usuarios.values()) {
            System.out.println(usuario);
        }
    }

    public static void remover(Map<String, Usuario> usuarios, String email) {
        if (usuarios.remove(email) != null) {
            System.out.println("Usuario removido!");
        } else {
            System.out.println("Usuario nao encontrado!");
        }
    }
}
