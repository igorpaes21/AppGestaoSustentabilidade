package entity;

public class Voluntario {

    private String nome;
    private String email;

    Voluntario(){}

    public Voluntario(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void participarProjeto(ProjetoSustentavel projeto){

    }
}
