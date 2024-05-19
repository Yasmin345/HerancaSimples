public class Empregado {
    // declarando atributos
    protected String nome;
    protected String endereço;
    protected double salario; 

    // construtor 
    public Empregado(String nome, String endereco, double salario){
        this.nome = nome;
        this.endereço = endereco;
        this.salario = salario;

        
    }

    // construtor vazio
    public Empregado(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf(){
        double aux;
        if (salario < 1800){
            aux = 0.1 * salario;
        } else {
            aux = 0.27 * salario;
        }

        return (aux);
    }

    public double calcularInss(){
        return (0.11 * salario);
    }
   
    
}
