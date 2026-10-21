# Encapsulamento

## O que é encapsulamento?
O encapsulamento consiste em esconder os detalhes internos de uma classe (seus atributos e como ela funciona por dentro) e expor apenas o necessário, por meio de métodos públicos e controlados.
 Em Java nos fazemos isso com:

 - Atributos privates: ninguem de fora acessa diretamente.
 - Métodos public (getters, setters e outros): as únicas portas de acesso, que podem validar os dados antes de aceitar

 ## O que são getters e setters?

 vamos começar por partes:
 - Getters: são metodos que conseguem acessar os atributos privates da classe para conseguir obter aquele dado.

 Exemplo: para conseguir ver seu saldo no banco, o aplicativo do banco chamaria um método getter, tipo getSaldo(), para mostrar quanto você tem no banco.

 - Setters: São aqueles metodos que alteram o valor dos dados privates. Geralmente vem com parâmetro para modificar por um outro dado, e aqui que colocamos regras de alteração.

 Exemplo: Usando o mesmo exemplo de cima, vamos supor que você sem querer colocou seu saldo para sacar um número negativo, como só é acessado pelo método, podemos colocar uma regra que não modifica para números negativos, essa é a importância do encapsulamento.