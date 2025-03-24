package entity;

public class Ong extends Organizacao {

    public Ong() {
        super();
    }

    public Ong(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ong{");
        sb.append("nome=").append(getNome()).append('\'');
        sb.append(", listaProjetos=").append(getListaProjetos());
        if (getListaProjetos() != null) {
            for (int i = 0; i < getListaProjetos().size(); i++) {
                ProjetoSustentavel projeto = getListaProjetos().get(i);
                sb.append("ProjetoSustentavel{");
                sb.append("nome = ").append(projeto.getNome()).append('\'');
                sb.append(", descricao = ").append(projeto.getDescricao()).append('\'');
                sb.append(", Relatorio Impacto = ").append(projeto.getRelatorioImpacto()).append('\'');
                sb.append('}');
                if (i < getListaProjetos().size() - 1) {
                    sb.append(", ");
                }

            }
        }
        sb.append('}');
        return sb.toString();
    }

}
