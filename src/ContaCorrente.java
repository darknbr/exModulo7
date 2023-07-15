public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;    
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
            " chequeEspecial='" + getChequeEspecial() + "'" +
            "}";
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }
    /*Na conta Corrente, crie um limite de saque baseado no limite de cheque especial de cada objeto.
     Ou seja, por exemplo, se a conta tem um saldo de R$100,00 e um limite de cheque especial de R$500,00,
    o cliente tem disponível para saque R$600,00. Além deste valor ele não poderá sacar.  */
    public double getSacar(){
        if (this.sacar > getSaldo()){
                return -1.413; // esse valor e apenas para n retornar 0 e da incompatibilidade
                }
            else {
                return getSaldo() - this.sacar;
        }
    }

    public double getDesposito(){
        return this.saldo += this.desposito;
    }  
}
