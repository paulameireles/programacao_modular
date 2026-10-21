class Cachorro{

    //Atributos
    private String nome;
    private int idade;
    private final String raca;

    //construtor
    public Cachorro(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    //Repara: o nome é o mesmo (Cachorro), mas os parênteses têm 2 coisas em vez de 3. É isso que deixa o Java diferenciar os dois
    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.idade = 0;        // como não veio idade, começa com 0
        this.raca = raca;
    }

    // getters e setters
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getRaca(){
        return raca;
    }

    //métodos
    public void latir() {
    System.out.println("Au au!");
    }

    public void apresentar(){
        System.out.println("Oi, eu sou " + getNome() + ", minha idade é " + getIdade() + " e minha raça é " + getRaca());
    }

    //método main
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Thor", 3, "Vira-lata");  // usa o 1º (3 parâmetros)
        Cachorro c2 = new Cachorro("Mel", "Poodle");         // usa o 2º (2 parâmetros)

        c1.apresentar();
        c2.apresentar();    
    }
}

