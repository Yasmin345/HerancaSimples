public class Empregado {
    // declarando atributos
    protected String nome;
    protected String endereço;
    protected double salario; 

    // construtor 
    public Empregado(String nome, String endereco){
        this.nome = nome;
        this.endereço = endereco;

        
    }

    // construtor vazio
    public Empregado(){

    }

    // métodos acessores 
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


    // método calculo Irpf 
    public double calcularIrpf(){
        double aux = 0;
        if (salario >= 2112.01 && salario <= 2826.66 ){
            aux = salario * 0.075 - 142.80;

        } else if (salario > 2826.67 && salario <= 3751.05) {
            aux = salario * 0.15 - 354.80;

        }else if (salario > 3751.06 && salario <=  4664.68){
            aux = salario * 0.225 - 636.13;

        }else if (salario >  4664.68 ){
            aux = salario * 0.275 - 869.36;
        }
        
        return (aux);
    }


    // método calculo Inss
    public double calcularInss(){
       double auxi = 0;
        if (salario <= 1412){
            auxi = salario * 0.075;

        }else if (salario > 1412 && salario <= 2667){
            auxi = salario * 0.09;

        }else if (salario > 2667 && salario < 4000){
            auxi = salario * 0.12;

        }else if (salario > 4000){
            auxi = salario * 0.14;
        }
        return auxi;
    }   
}
   
    

