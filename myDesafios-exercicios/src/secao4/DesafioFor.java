package secao4;

public class DesafioFor {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i < 6; i++) {
            System.out.println(valor);
            valor += "#";
        }

        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }

        String v = "#";
        do {
            System.out.println(v);
            v += "#";
        } while (!v.equals("######"));

    }

}
