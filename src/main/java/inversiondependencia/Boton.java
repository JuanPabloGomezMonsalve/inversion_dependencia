package inversiondependencia;

public class Boton {

    private Lampara lampara;

    public Boton(Lampara lampara) {
        this.lampara = lampara;
    }

    public void pulsar(boolean presionar) {

        if (presionar) {
            lampara.encender();
        } else {
            lampara.apagar();
        }
    }
}
