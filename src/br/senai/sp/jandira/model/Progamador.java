package br.senai.sp.jandira.model;

public class Progamador extends Funcionario{
    private int horasExtras;

    public Progamador(String nome, int ID, double salarioBase, int horasExtras) {
        super(nome, ID, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {

        return getSalarioBase() + (horasExtras * 25);
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}
