package Agendamento_Medico.Entities;

public class Paciente {
    public String[] cpf = {"473.928.150-41", "829.104.730-52", "105.837.420-98", "652.941.080-37", "294.817.360-55"};
    public String[] nome = {"Rafael", "João Vitor", "Gabriel", "Maria", "Gabrielle"};
    public int pacienteAtual;

    //Verificar  paciente
    public String verificarPaciente(String cpfs) {
        for (int i = 0; i<cpf.length; i++) {
            if (cpf[i] == cpfs ) {
                pacienteAtual = i;
            }
        }
        return "Paciente não encontrado";
    }
}
