import smartphone.Iphone;

public class SistemaDoAparelho {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("==== Funções do navegador ====");
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("\n==== Funções do Music Player ====");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Metallica - Nothing Else Matters (1991)");
        System.out.println("\n==== Funções do Aparelho");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();



    }
}
