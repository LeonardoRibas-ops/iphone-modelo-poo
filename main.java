public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando funcionalidades do Reprodutor Musical
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        // Testando funcionalidades do Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
