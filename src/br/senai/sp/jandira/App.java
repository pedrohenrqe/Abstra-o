package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Progamador;

public class App {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Pedro", 07, 5000, 900);
        Progamador programador = new Progamador("Matheus", 06, 10000, 12);

        System.out.println("Informações do Gerente: ");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("ID: " + gerente.getID());
        System.out.println("Salário Base: R$" + gerente.getSalarioBase());
        System.out.println("Bônus de Gerência: R$" + gerente.getBonusGerencia());
        System.out.println("Salário Total: R$" + gerente.calcularSalario());
        System.out.println();

        System.out.println("Informações do Programador: ");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("ID: " + programador.getID());
        System.out.println("Salário Base: R$" + programador.getSalarioBase());
        System.out.println("Horas Extras: " + programador.getHorasExtras() + " horas");
        System.out.println("Salário Total: R$" + programador.calcularSalario());

    }
}
