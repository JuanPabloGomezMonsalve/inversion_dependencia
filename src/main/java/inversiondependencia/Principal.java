package inversiondependencia;

public class Principal {
    public static void main(String[] args) {
        Interruptor televisor = new Televisor();

        Interruptor lampara = new Lampara();

        Boton boton = new Boton(lampara);


        boton.pulsar(true);
    }
}
