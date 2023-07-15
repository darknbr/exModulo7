## TestaConta.java --> Main do projeto

Crie dois métodos: sacar() e depositar(), onde o método sacar() subtrai valores do saldo da conta, e o método depositar soma valores na conta. Estes métodos recebem a quantia desejada por parâmetro.

Além disso, crie uma classe chamada ContaSalário que herda da superclasse e nela haverá uma restrição na qual existe um limite de saques que podem ser feitos. É claro que existem muitas regras de negócios envolvidas numa conta real, mas vamos deixar aqui na nossa tarefa mais simples.

Na conta Corrente, crie um limite de saque baseado no limite de cheque especial de cada objeto. Ou seja, por exemplo, se a conta tem um saldo de R$100,00 e um limite de cheque especial de R$500,00, o cliente tem disponível para saque R$600,00. Além deste valor ele não poderá sacar. 

Na conta Poupança você pode criar uma regra bem simples onde o valor do saldo pode variar dependendo do dia de aniversário da conta e da taxa de juros.

O objetivo é apenas treinar a herança e seus mecanismos e não criar uma implementação complexa de como é na vida real.

