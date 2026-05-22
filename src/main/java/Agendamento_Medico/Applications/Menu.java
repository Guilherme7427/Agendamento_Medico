package Agendamento_Medico.Applications;

import Agendamento_Medico.Entities.Horarios;
import Agendamento_Medico.Entities.Paciente;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    Paciente paciente = new Paciente();
    Horarios horarios = new Horarios();

    public void menuPrincipal() {

        /*
        CPFS PARA SEREM USADOS
        473.928.150-41
        829.104.730-52
        105.837.420-98
        652.941.080-37
        294.817.360-55
         */
        //Encontrar o paciente para consulta
        System.out.println("Digite seu CPF");
        String cpfPaciente = sc.nextLine();

        String resultadoPaciente = paciente.verificarPaciente(cpfPaciente);
        if (resultadoPaciente != null) {
            System.out.println("Acesso liberado");

            //Horarios a serem usados: 10.00, 12.30, 7.00, 8.00, 11.00
            System.out.println("Digite o horario que você deseja");
            double horariosSelecionados = sc.nextDouble();
            sc.nextLine();
            if (horarios.verificarHorarios(horariosSelecionados)) {
                if (horarios.obterConsultas()) {
                    System.out.println("Horario disponivel!");


                    //Especialistas disponiveis:Dentista, Psicologo, Ortopedista, Cardiologista, Pediatra
                    System.out.println("Digite o especialista desejado");
                    String especialistaDesejado = sc.nextLine();
                    if (horarios.verificarEspecialidade(especialistaDesejado)) {
                        System.out.println("Esse especialista esta disponivel");
                        System.out.println("Consulta agendada!");
                    } else {
                        System.out.println("Este especialista não esta disponivel");
                    }
                } else {
                    System.out.println("Este horario não esta disponivel");
                }
            } else {
                System.out.println("CPF Invalido");
            }
        }
    }
}