package testes;

import org.example.Paciente;

import java.util.HashMap;
import java.util.Map;

public class HistoricoService {
    private Map<String, Paciente> pacientes = new HashMap<>();

    public void registrarHistorico(Paciente paciente, String historicoMedico, String historicoFamiliar) {
        paciente.setHistoricoMedico(historicoMedico);
        paciente.setHistoricoFamiliar(historicoFamiliar);
        pacientes.put(paciente.getNome(), paciente);
    }

    public Paciente obterPaciente(String nome) {
        return pacientes.get(nome);
    }
}
