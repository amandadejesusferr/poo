public class PlanosApp {
    public static void main(String[] args) {
        PlanoAssinatura basico = new PlanoAssinatura("Básico", 49.90);
        PlanoProfissional pro = new PlanoProfissional("Pro Corporativo", 199.90, 10);
        PlanoProfissional invalido = new PlanoProfissional("", -20.0, 0);

        System.out.println(basico.getDescricao());
        System.out.println(pro.getDescricao());
        System.out.println(invalido.getDescricao());
    }
}