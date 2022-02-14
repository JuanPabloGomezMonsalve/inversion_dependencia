package inversiondependencia;

public class Principal {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        Lampara lampara = new Lampara();

        Boton boton = new Boton(lampara);


        boton.pulsar(true);
    }
}
