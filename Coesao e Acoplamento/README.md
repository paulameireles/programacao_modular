# Coesão e Acoplamento

## O que é coesão?
Coesão é quanto uma classe tem uma responsabilidade só. Classes são projetadas para fazer o menor número de coisas possíveis para facilitar a manutenção.
## O que é acoplamento?
O acoplamento é basicamente o quanto uma classe precisa da outra, e está inteiramente relacionada com a coesão, quanto mais alta a coesão mais baixo o acoplamento.
## Qual é o ideal: alta ou baixa coesão? E acoplamento?
Como já vimos acima, o ideal para se ter em sua aplicação é uma alta coesão e um baixo acoplamento para facilitar a manutenção no código.

## Por que isso importa?
Como falado acima, porque quando você precisar mudar algo em seu código um baixo acoplamento e alta coesão vão tornar a mudança menos demorada e desgastante e dando menos conflito.  

## Exemplo
Alto acoplamento: o Dono cria o próprio cachorro (new lá dentro)


public class Dono {
    private Cachorro cachorro = new Cachorro("Thor", 3, "Vira-lata");

    public void passear() {
        cachorro.latir();
    }
}

Baixo acoplamento: o Dono recebe o cachorro pelo construtor


public class Dono {
    private Cachorro cachorro;

    public Dono(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public void passear() {
        cachorro.latir();
    }
}
