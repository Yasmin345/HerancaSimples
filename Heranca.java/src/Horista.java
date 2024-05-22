public class Horista extends Empregado {
    // declarando atributos
    private double horas;

    // construtores
    public Horista(String nome, String endereco, double horas) {
        super(nome, endereco);
        
        // atributo declarado na classe local 
        this.horas = horas;
    }

    // sobrecarga de construtor
    public Horista() {     
    }

    // métodos acessores 
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    // método calculo de salario horista
    public void calcularSalario(){
        salario = horas * 50;
    }

    // método para imprimir 
    public void imprimir_H(){
        System.out.println("=========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("Salario: " + getSalario());
        System.out.println("Valor Inss: " + calcularInss());
        System.out.println("Valor Irpf: " + calcularIrpf());
        System.out.println("=========================\n");





    }



    

    
    
}
