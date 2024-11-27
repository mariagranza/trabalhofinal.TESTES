package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HistoricoServiceTest {

    private HistoricoService historicoService;
    private Paciente paciente;

    @BeforeEach
    public void setUp() {
        historicoService = new HistoricoService();
        paciente = new Paciente("João da Silva");
    }

    @Test
    public void testRegistrarHistorico() {
        String historicoMedico = "Hipertensão, tratamento com Losartana";
        String historicoFamiliar = "Diabetes no avô, câncer de mama na mãe";

        historicoService.registrarHistorico(paciente, historicoMedico, historicoFamiliar);

        Paciente pacienteRecuperado = historicoService.obterPaciente("João da Silva");

        assertNotNull(pacienteRecuperado, "O paciente não foi encontrado.");
        assertEquals(historicoMedico, pacienteRecuperado.getHistoricoMedico(), "O histórico médico não foi registrado corretamente.");
        assertEquals(historicoFamiliar, pacienteRecuperado.getHistoricoFamiliar(), "O histórico familiar não foi registrado corretamente.");
    }
}

