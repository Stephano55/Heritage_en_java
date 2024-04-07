//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Imprimante imprimante = new Imprimante(50, 25, "A3", "HP");
        Imprimante imprimante1 = new Imprimante(75, 56, "A4", "Epson");
        imprimante1.comparaison(imprimante);
        Wireless wireless = new Wireless(34, 45, "A2", "Canon", 56);
        Wireless wireless1 = new Wireless(20, 5, "A3", "HP", 54);
        wireless1.comparaison(wireless);
    }
}