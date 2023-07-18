import java.util.Scanner;

public class TestaConta {
    
    public static void main(String[] args) throws Exception {
        ContaCorrente cc2;
        
       Scanner sc = new Scanner(System.in);
       int option = 1;

       do {

        System.out.println("Deseja fazer um saque ou deposito ou consultar o saldo: ");
        System.out.println("1 - Consultar o saldo: ");
        System.out.println("2 - Fazer um saque: ");
        System.out.println("3 - Fazer um depósito: ");
        System.out.println("0 - Sair.");

        option = sc.nextInt();

        process(option);

       }while(option != 0);
    }

       public static void process (int option) throws Exception{
        
        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100, 1000);
        ContaPoupanca pp1 = new ContaPoupanca(33, 1, "Banco AA", 100, 15, 0.5);
        ContaSalario cs1 = new ContaSalario(44, 1, "Banco AA", 100, 2);
        
        switch (option){
            case 1:  {
                do{                
                    Scanner sc  = new Scanner(System.in);
                    selecao();                               
                    option = sc.nextInt();

                    switch (option){
                        case 1:{
                            System.out.println("Saldo conta corrente: " +cc1.saldo);
                            break;
                        }
                        case 2:{
                            System.out.println("Digite o dia de aniversário da poupança: ");
                            int diaAniversario = sc.nextInt();
                            pp1.setDiaAniversario(diaAniversario);

                            System.out.println("Saldo conta poupança: " + pp1.saldo);
                            break;
                        }
                        case 3:{
                            System.out.println("Saldo da conta salário: "+ cs1.saldo);
                            break;
                        }
                        case 0:{
                            break;
                        }
                        default:{
                            System.out.println("Opção digitada inválida");
                        }
                    }

                    }while (option != 0);
                    
                }
                
                break;
            
            case 2 : {
                do{                
                    Scanner sc  = new Scanner(System.in);
                    selecao();                               
                    option = sc.nextInt();

                    switch (option){
                        case 1:{
                            System.out.println("Saldo da conta corrente: " + cc1.getSaldo());
                            System.out.println("Quanto deseja sacar: ");
                            double saque = sc.nextInt();
                            double valorAtualizado = cc1.saque(saque);
                           
                            if(cc1.saque(saque) == 0){
                                System.out.println("Valor indisponivel para saque: " + saque);
                                System.out.println("Valor maximo permitido para saque: " + cc1.getSaldo());
                                System.out.println("Tente novamente !!!");
                                option = 0;                                                          
                            } else {
                                System.out.println("Saque efetuado com sucesso.");
                                System.out.println("Valor atualizado saldo: " + valorAtualizado);
                                option = 0;                               
                            }

                            break;
                        }
                        case 2:{
                            System.out.println("Digite o dia de aniversário da poupança: ");
                            int diaAniversario = sc.nextInt();
                            pp1.setDiaAniversario(diaAniversario);
                            System.out.println("Caso dia do aniversário >= 20, terá juros adicionais ao saldo: ");
                            System.out.println("Saldo da conta poupança: " + pp1.getSaldo());
                            System.out.println("Quanto deseja sacar: ");
                            double saque = sc.nextInt();
                            double valorAtualizado = pp1.saque(saque);
                           
                            if(pp1.saque(saque) == 0){
                                System.out.println("Valor indisponivel para saque: " + saque);
                                System.out.println("Valor maximo permitido para saque: " + pp1.getSaldo());
                                System.out.println("Tente novamente !!!");
                                option = 0;                                                          
                            } else {
                                System.out.println("Saque efetuado com sucesso.");
                                System.out.println("Valor atualizado saldo: " + valorAtualizado);                            
                                option = 0;                               
                            }
                            break;
                        }
                        case 3:{
                            System.out.println("Quantos saques já foram feitos esse mês? ");
                            int saquesMes = sc.nextInt();
                            cs1.setLimiteSaque(saquesMes);
                            if(saquesMes >= 2){
                                System.out.println("Número máximo de saques atingidos, ");
                                System.out.println("espere para o próximo mês.");
                                option = 0;
                                break;
                            } else {                            
                                System.out.println("Saldo da conta salário: " + cs1.getSaldo());
                                System.out.println("Quanto deseja sacar: ");
                                double saque = sc.nextInt();
                                double valorAtualizado = cs1.saque(saque);
                            
                                if(cs1.saque(saque) == 0){
                                    System.out.println("Valor indisponivel para saque: " + saque);
                                    System.out.println("Valor maximo permitido para saque: " + cs1.getSaldo());
                                    System.out.println("Tente novamente !!!");
                                    option = 0;                                                          
                                } else {
                                    System.out.println("Saque efetuado com sucesso.");
                                    System.out.println("Valor atualizado saldo: " + valorAtualizado);                                    
                                    saquesMes ++;
                                    option = 0;                               
                                }
                            }
                            break;
                        }
                        case 0:{
                            break;
                        }
                        default:{
                            System.out.println("Opção digitada inválida");
                        }
                    }

                    }while (option != 0);
                    
                }
                break;
            
            case 3 : {
                do{                
                    Scanner sc  = new Scanner(System.in);
                    selecao();                               
                    option = sc.nextInt();

                    switch (option){
                        case 1:{
                            System.out.println("Saldo da conta corrente: " + cc1.getSaldo());
                            System.out.println("Quanto deseja depositar: ");
                            double depositar = sc.nextInt();
                            cc1.setDesposito(depositar);
                            cc1.setSaldo(cc1.getDesposito());
                           
                            System.out.println("Depósito efetuado com sucesso.");
                            System.out.println("Valor atualizado saldo: " + cc1.getSaldo());
                            
                            option = 0;                               
                         
                            break;
                        }
                        case 2:{
                            System.out.println("Saldo da conta poupança: " + pp1.getSaldo());
                            System.out.println("Quanto deseja depositar: ");
                            double depositar = sc.nextInt();
                            pp1.setDesposito(depositar);
                            pp1.setSaldo(pp1.getDesposito());
                           
                            System.out.println("Depósito efetuado com sucesso.");
                            System.out.println("Valor atualizado saldo: " + pp1.getSaldo());
                            
                            option = 0;
                            break;
                        }
                        case 3:{
                            System.out.println("Saldo da conta salário: " + cs1.getSaldo());
                            System.out.println("Quanto deseja depositar: ");
                            double depositar = sc.nextInt();
                            cs1.setDesposito(depositar);
                            cs1.setSaldo(cs1.getDesposito());
                           
                            System.out.println("Depósito efetuado com sucesso.");
                            System.out.println("Valor atualizado saldo: " + cs1.getSaldo());
                            
                            option = 0;
                            break;
                        }
                        case 0:{
                            break;
                        }
                        default:{
                            System.out.println("Opção digitada inválida");
                        }
                    }

                    }while (option != 0);

            }
            default : {

            }

        }
    }

    public static void selecao(){
        System.out.println("-------------------");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Conta Salário");
        System.out.println("0 - Voltar");
        System.out.println("-------------------");
    }
           

}

