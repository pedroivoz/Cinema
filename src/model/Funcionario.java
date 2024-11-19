package model;

import java.util.Date;

public class Funcionario extends Pessoa{
    private int matricula;
    private Date horarioTrabalho;

    public Funcionario(String cpf, String nome, String email, int matricula, Date horarioTrabalho){
        super(cpf, nome, email);
        this.matricula=matricula;
        this.horarioTrabalho=horarioTrabalho;
    }

}
