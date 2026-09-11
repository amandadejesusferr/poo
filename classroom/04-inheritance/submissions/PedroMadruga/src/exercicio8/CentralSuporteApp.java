public class CentralSuporteApp {
    public static void main(String[] args) {
        CentralSuporte central = new CentralSuporte();

        SolicitacaoSuporte inc = new Incidente("INC-991", "Queda do banco de dados", 5, 5);
        SolicitacaoSuporte svc = new SolicitacaoServico("SRV-102", "Instalação de IDE", 15);

        central.processar(inc);
        central.processar(svc);
    }
}