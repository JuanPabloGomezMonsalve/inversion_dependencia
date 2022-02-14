package inversiondependencia;

public class Lampara implements Interruptor {

    @Override
    public void encender() {
        System.out.println("Encendi la lampara");
    }

    @Override
    public void apagar() {
        System.out.println("Apagamos la lampara");

    }
}
