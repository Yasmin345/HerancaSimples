public class Mensalista extends Empregado {
    // declarando atributos
    private String cargo;

    // construtores
    public Mensalista(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario);
        this.cargo = cargo;
    }

    public Mensalista() {
        
    }

    
}
