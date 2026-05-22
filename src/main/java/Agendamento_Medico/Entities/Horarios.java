package Agendamento_Medico.Entities;

public class Horarios {
    public double[] horario = {10.00, 12.30, 7.00, 8.00, 11.00};
    public String[] especialidadeDesejada = {"Dentista", "Psicologo", "Ortopedista", "Cardiologista", "Pediatra"};
    public boolean[] horarioDisponivel = {true, false, false, true, true};
    public double horarioAtual;
    public int especialistaAtual;

    public boolean verificarHorarios(double h) {
        boolean temHorario = false;
        for (int i = 0; i < horario.length; i++) {
            if (h == horario[i]) {
                temHorario = true;
                horarioAtual = i;
                break;
            }
        }
        return temHorario;
    }

    public boolean obterConsultas() {
        if (horarioDisponivel[(int) horarioAtual]) {
            return true;
        }
        return false;
    }


    public boolean verificarEspecialidade(String esp) {
        boolean temEspecialista = false;
        for (int i = 0; i < especialidadeDesejada.length; i++) {
            if (especialidadeDesejada[i].equalsIgnoreCase(esp)) {
                temEspecialista = true;
                especialistaAtual = i;
                break;
            }
        }
        return temEspecialista;
    }
}
