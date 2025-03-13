package entity;

import java.util.ArrayList;

public class Oraganizaçao {

    private String nome;
    private ArrayList<ProjetoSustentavel> listaProjetos = new ArrayList<>();

    Oraganizaçao(){}

    public Oraganizaçao(ArrayList<ProjetoSustentavel> listaProjetos, String nome) {
        this.listaProjetos = listaProjetos;
        this.nome = nome;
    }

    public ArrayList<ProjetoSustentavel> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(ArrayList<ProjetoSustentavel> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProjetos(ProjetoSustentavel projeto){

    }

}
