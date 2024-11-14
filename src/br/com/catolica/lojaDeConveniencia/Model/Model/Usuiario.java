package br.com.catolica.lojaDeConveniencia.Model.Model;

public class Usuiario {
    private String user;
    private String senha;

    public Usuiario(String username, String password) {
        this.user = username;
        this.senha = password;
    }

    public String getUsername() {
        return user;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}