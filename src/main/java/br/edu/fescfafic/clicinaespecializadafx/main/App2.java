package br.edu.fescfafic.clicinaespecializadafx.main;

import br.edu.fescfafic.clicinaespecializadafx.dao.*;
import br.edu.fescfafic.clicinaespecializadafx.domain.Login;
import br.edu.fescfafic.clicinaespecializadafx.domain.Medico;
import br.edu.fescfafic.clicinaespecializadafx.domain.Paciente;

public class App2 {
    public static void main(String[] args) {
        var pacienteDao = new PacienteDAO();
        var medicoDao = new MedicoDAO();
        var agendamentoDao = new AgendamentoDAO();
        var loginDao = new LoginDAO();

//        System.out.println("Criando Tabelas...");

        // Cadastro de paciente
        Login loginKokin = new Login();
        loginKokin.setLogin("kokin2");
        loginKokin.setSenha("123");

        loginDao.inserirLogin(loginKokin);

        var pacienteKokin = new Paciente();
        pacienteKokin.setNome("Kokin");
        pacienteKokin.setCpf("222222222");
        pacienteKokin.setTelefonePaciente("(83) 9 8156-9632");
        pacienteKokin.setLogin(loginKokin);

        pacienteDao.cadastrarPaciente(pacienteKokin);
//
//        // Cadastro de médico
//        var medZack = new Medico();
//        medZack.setCrm(123456);
//        medZack.setNome("Zack");
//        medZack.setCpf("20052024");
//        medZack.setEspecialidade("Embriologista");
//
//        Login loginZack = new Login();
//        loginZack.setLogin("Zack");
//        loginZack.setSenha("Zack22");
//
//        medZack.setLogin(loginZack);
//
//        medicoDao.cadastrarMedico(medZack);

//        // Agendamento
//        var agendamento = new Agendamento();
//        agendamento.setDataHora(LocalDateTime.of(2024, 2, 25, 10, 30));
//        agendamento.setIdMedico(medZack);
//        agendamento.setIdPaciente(pacienteVictor);
//
//        agendamentoDao.agendarHorario(agendamento);
//
//        var pacienteDAO = new PacienteDAO();
//        pacienteDAO.getEmc().getEntityManager().clear();
//
//        System.out.println("Tabelas Geradas com Sucesso!!!!!");

//        SendSMSDAO sendSMSDAO = new SendSMSDAO();
//        sendSMSDAO.sendSMS("+5511987069733");
    }
}


