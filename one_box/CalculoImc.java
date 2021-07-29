import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** MEDIDOR DE IMC E CONSUMO DE AGUA MÍNIMO ***\n\n");

        var sair = false;

        do {
            //double altur, pezo, resultado, agua;

                System.out.print("Informe seu nome: ");
                String nome = scan.nextLine();
                System.out.print("Informe sua altura: ");
                Float altur = scan.nextFloat();
                System.out.print("Informe seu peso: ");
                Float pezo = scan.nextFloat();

                Float resultado = pezo/(altur*altur);
                Float agua=(35*pezo)/1000;

                System.out.println("\n\n");

                if (resultado<18.5) {
                    System.out.println(nome+", seu IMC é: "+resultado+".\nVocê está abaixo do peso.\nE você deve consumir diariamente ao menos "+agua+"0 litros de água.\n\n");
                }
                if (resultado>=18.5 && resultado<=24.9){
                    System.out.println(nome+", seu IMC é: "+resultado+".\nVocê está com o peso ideal. PARABÉNS!\nE você deve consumir diariamente ao menos "+agua+"0 litros de água.\n\n");
                }
                if (resultado>=25 && resultado<=29.9){
                    System.out.println(nome+", seu IMC é: "+resultado+".\nVocê está levemente acima do peso.\nE você deve consumir diariamente ao menos "+agua+"0 litros de água.\n\n");
                }
                if (resultado>=30 && resultado<=34.9){
                    System.out.println(nome+", seu IMC é: "+resultado+".\nVocê está com Obesidade Grau I. DEVE SE CUIDAR!\nE você deve consumir diariamente ao menos "+agua+"0 litros de água.\n\n");
                }
                if (resultado>=35 && resultado<=39.9){
                    System.out.println(nome+", seu IMC é: "+resultado+".\nVocê está com Obesidade Grau II (severa). DEVE SE CUIDAR!\nE você deve consumir diariamente ao menos "+agua+"0 litros de água.\n\n");
                }
                if (resultado>39.9){
                    System.out.println(nome+", seu IMC é: "+resultado+".\nVocê está com Obesidade Grau III (mórbida). DEVE SE CUIDAR!\nE você deve consumir diariamente ao menos "+agua+"0 litros de água.\n\n");
                }

        } while (sair = false);

    }
}
