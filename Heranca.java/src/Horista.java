public class Horista extends Empregado {
    // declarando atributos
    private double horas;
    private double vl_horas;

    // construtores
    public Horista(String nome, String endereco, double horas, double vl_horas) {
        super(nome, endereco);
        this.vl_horas = vl_horas;
        
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
        salario = horas * vl_horas;
    }

    // método para imprimir 
    public void imprimir_H(){
        System.out.println("=========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.printf("Salario: %.2f\n", getSalario());
        System.out.printf("Valor Inss: %.2f\n", calcularInss());
        System.out.println("=========================\n");





    }



    

    
    
}
