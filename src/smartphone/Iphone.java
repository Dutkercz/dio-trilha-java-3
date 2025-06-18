package smartphone;

import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.PhoneFunctions;

public class Iphone implements MusicPlayer, PhoneFunctions, InternetBrowser {


    @Override
    public void exibirPagina(String url) {
        System.out.println("Redirecionando para " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir nova guia.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando " + musica + ".");
    }

    @Override
    public void ligar() {
        System.out.println("Chamada em andamento.");
    }

    @Override
    public void atender() {
        System.out.println("Atender.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligar para correio de voz.");
    }
}
