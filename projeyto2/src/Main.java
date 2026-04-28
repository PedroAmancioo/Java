public class Main{
    public static void main(){
        System.out.println("primero programa de pedro");
        
        Carro car1 = new Carro(2038, "ASG251");
        System.out.println("placa = " + car1.getPlaca());
        System.out.println("fabricado em " + car1.getAno());

        Carro car2 = new Carro(1999, "MXL421");
        System.out.println("placa = " + car2.getPlaca());
        System.out.println("fabricado em " + car2.getAno());

        Carro car3 = new Carro(2015, "");
        System.out.println("placa = " + car3.getPlaca());
        System.out.println("fabricado em " + car3.getAno());

    }
}
