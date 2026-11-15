package Questao04;

public class Usuario {

    private String email;
    private String nome;
    private String senha;

    public Usuario(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Email: " + email;
    }
}


