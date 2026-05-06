
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

//        Intuito do estudo:
//
//        Criar uma interface com produtos e valores fixos onde o cliente
//        pode colocar e tirar produtos do carrinho e ver o valor final para pagar

        int opc = 0;
        Double valorTotal = 0.0;
        String kuromi = "Pelucia Kuromi: ";
        Double plushKuromi = 54.90;
        String myMelo = "Pelucia My Melody: ";
        Double plushMyMelo = 54.90;
        String cinna = "Pelucia Cinnamoroll: ";
        Double plushCinna = 54.90;
        String pompom = "Pelucia Pompompurin: ";
        Double plushPompom = 54.90;
        String booster = "Booster Sanrio: ";
        Double boosterSanrio = 10.00;
        String queca = "Pelucia Quecao: ";
        Double plushQueca = 120.90;
        String lulu = "Pelucia Lulu: ";
        Double plushLulu = 100.90;
        String suki = "Pelucia Suki: ";
        Double plushSuki = 110.90;
        String nega = "Pelucia Nega: ";
        Double plushNega = 120.90;
        String frog = "Pelucia de Sapinho: ";
        Double plushFrog = 40.00;
        String sala = "Pelucia de Salamandrinha: ";
        Double plushSalamandra = 40.00;




        String intro = """
                    ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
                    Produtos Disponiveis:
                    
                    Info|     Valor|
                    """;

        String infoCarrinho = """
                *Para adicionar o item  ao carrinho deve digitar a numeração dele
                Para retirar um item do carrinho digite - e o numero do item
                (Ex: -4)
                ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
                """;


        while (opc != 12){

            System.out.println(intro);
            System.out.println("1 " + kuromi + plushKuromi);
            System.out.println("2 " + myMelo + plushMyMelo);
            System.out.println("3 " + cinna + plushCinna);
            System.out.println("4 " + pompom + plushPompom);
            System.out.println("5 " + booster + boosterSanrio);
            System.out.println("6 " + queca + plushQueca);
            System.out.println("7 " + lulu + plushLulu);
            System.out.println("8 " + suki + plushSuki);
            System.out.println("9 " + nega + plushNega);
            System.out.println("10 " + frog + plushFrog);
            System.out.println("11 " + sala + plushSalamandra);
            System.out.println();
            System.out.println("Total atual no Carrinho " + valorTotal);
            System.out.println(infoCarrinho);
            System.out.println("Digite 12 para ir para o pagamento");

            opc = ler.nextInt();


            if (opc == 1) {

                valorTotal = valorTotal + plushKuromi;

            } else if (opc == 2) {

                valorTotal = valorTotal + plushMyMelo;

            } else if (opc == 3) {

                valorTotal = valorTotal + plushCinna;

            } else if (opc == 4) {

                valorTotal = valorTotal + plushPompom;

            } else if (opc == 5) {

                valorTotal = valorTotal + boosterSanrio;

            } else if (opc == 6) {

                valorTotal = valorTotal + plushQueca;

            } else if (opc == 7) {

                valorTotal = valorTotal + plushLulu;

            } else if (opc == 8) {

                valorTotal = valorTotal + plushSuki;

            } else if (opc == 9) {

                valorTotal = valorTotal + plushNega;

            } else if (opc == 10) {

                valorTotal = valorTotal + plushFrog;

            } else if (opc == 11) {

                valorTotal = valorTotal + plushSalamandra;

            } else if (opc == 12) {

                System.out.println("Pagamento de: " + valorTotal);
            } else {
                System.out.println("Opção invalida");
            }


            String removerItem = opc + "";

            if (opc == -1){
                valorTotal = valorTotal - plushKuromi;
            } else if (opc == -2){
                valorTotal = valorTotal - plushMyMelo;
            } else if (opc == -3){
                valorTotal = valorTotal - plushCinna;
            } else if (opc == -4){
                valorTotal = valorTotal - plushPompom;
            } else if (opc == -5){
                valorTotal = valorTotal - boosterSanrio;
            } else if (opc == -6){
                valorTotal = valorTotal - plushQueca;
            } else if (opc == -7){
                valorTotal = valorTotal - plushLulu;
            } else if (opc == -8){
                valorTotal = valorTotal - plushSuki;
            } else if (opc == -9){
                valorTotal = valorTotal - plushNega;
            } else if (opc == -10){
                valorTotal = valorTotal - plushFrog;
            } else if (opc == -11){
                valorTotal = valorTotal - plushSalamandra;
            }









        }









    }
}
