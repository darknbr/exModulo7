import java.util.Scanner;

public abstract class Conta{
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected double sacar;
    protected double desposito;

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
            " numero='" + getNumero() + "'" +
            ", agencia='" + getAgencia() + "'" +
            ", banco='" + getBanco() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double getSacar();

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public abstract double getDesposito();

    public void setDesposito(double desposito) {
        this.desposito = desposito;
    }

}

