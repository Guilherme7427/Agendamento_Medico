package Agendamento_Medico.Entities;

public class Paciente {
    private String[] cpf;
    private String[] nome;
    private int pacienteAtual;

    public Paciente() {
        this.cpf = new String[]{"473.928.150-41", "829.104.730-52", "105.837.420-98", "652.941.080-37", "294.817.360-55"};
        this.nome = new String[]{"Rafael", "João Vitor", "Gabriel", "Maria", "Gabrielle"};
    }

    public String verificarPaciente(String cpfs) {
        for (int i = 0; i < cpf.length; i++) {
            if (cpf[i].equals(cpfs)) {
                this.pacienteAtual = i;
                return nome[i];
            }
        }
        return "Paciente não encontrado";
    }
}
