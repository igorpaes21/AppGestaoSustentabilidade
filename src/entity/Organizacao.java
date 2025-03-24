package entity;

import java.util.ArrayList;
import java.util.List;

public class Organizacao {

    private String nome;
    private List<ProjetoSustentavel> listaProjetos = new ArrayList<>();

    public Organizacao() {
    }

    public Organizacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ProjetoSustentavel> getListaProjetos() {
        return (ArrayList<ProjetoSustentavel>) listaProjetos;
    }

    public void adicionarProjetos(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);

    }

    public void ListarProjetos() {
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println(projeto);
        }
    }
    @Override
    public String toString() {
        return "Oraganizacao{" +
                "nome='" + nome + '\'' +
                ", listaProjetos=" + listaProjetos +
                '}';
    }
}

