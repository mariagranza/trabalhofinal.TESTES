package org.example;

public class Paciente {
    private String nome;
    private String historicoMedico;
    private String historicoFamiliar;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getHistoricoFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }
}
