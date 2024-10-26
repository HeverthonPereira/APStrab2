package Negocio;

import java.time.LocalDate;

public class Medicamento {
    private String nome;
    private String principioAtivo;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    private int ID;
    public static int ProximoIdMedicamento = 1;

    public Medicamento(String nome, String principioAtivo, LocalDate dataFabricacao,LocalDate  dataValidade, int ID) {
        this.setNome(nome);
        this.setPrincipioAtivo(principioAtivo);
        this.setDataFabricacao(dataFabricacao);
        this.setDataValidade(dataValidade);
        this.setID(ID);
    }

    public Medicamento() {
    }

    public static int getProximoIdMedicamento() {

        return ProximoIdMedicamento++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public LocalDate  getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate  dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate  getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate  dataValidade) {
        this.dataValidade = dataValidade;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nMedicamento ='" + nome + '\'' +
                ", Principio Ativo ='" + principioAtivo + '\'' +
                ", Fabricacao ='" + dataFabricacao + '\'' +
                ", Validade ='" + dataValidade;
    }


}


