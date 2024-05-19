public class Horista extends Empregado {
    // declarando atributos
    private double horas;

    // construtores
    public Horista(String nome, String endereco, double salario, double horas) {
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public Horista() {     
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = horas * 50;
    }

    

    
    
}
