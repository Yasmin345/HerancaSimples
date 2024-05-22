public class FolhaPGTO {
    public static void main(String[] args) throws Exception {
        // declarando atributos 
        Mensalista men1, men2;
        Horista hora1, hora2;

        //------------------Empregados mensalistas---------------------------------

        men1 = new Mensalista("Ana", "Rua 15","Junior"); // instanciando a classe e passando valores
       
        // calculando salario
        men1.calcularSalario();

        // calculando inss
        men1.calcularInss();

        // calculando irpf
        men1.calcularIrpf();

        // imprimindo 
        men1.imprimir_M();

        men2 = new Mensalista("Jonas", "Avenida azul","Pleno");

        //calculando salario
        men2.calcularSalario();

        //calculando Inss
        men2.calcularInss();

        //calculando Irpf
        men2.calcularIrpf();

        // imprimindo 
        men2.imprimir_M();


        //--------------------- empregados horistas---------------------------------------
        hora1 = new Horista("Jade", "Travessia 4", 30);

        // calculando salario 
        hora1.calcularSalario();

        //calculando Inss
        hora1.calcularInss();

        // calculando Irpf
        hora1.calcularIrpf();

        // imprimindo 
        hora1.imprimir_H();

        hora2 = new Horista("Bruno", "Estrada polo", 70);

        // calculando salario 
        hora2.calcularSalario();

        //calculando Inss
        hora2.calcularInss();

        // calculando Irpf
        hora2.calcularIrpf();

        // imprimindo 
        hora2.imprimir_H();

        
        








    




    }
}
