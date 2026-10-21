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

    // getters e setters
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
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
        Cachorro c1 = new Cachorro("Thor", 3, "Vira-lata");

        c1.setIdade(4);            
        c1.apresentar();

        c1.setIdade(-5); // deve lançar uma exceção, pois idade negativa não é permitida           
    }
}

