package inversiondependencia;

public class Boton {

    private Interruptor interruptorPorBoton;

    public Boton(Interruptor interruptorPorBoton) {
        this.interruptorPorBoton = interruptorPorBoton;
    }

    public void pulsar(boolean presionar) {

        if (presionar) {
            interruptorPorBoton.encender();
        } else {
            interruptorPorBoton.apagar();
        }
    }
}
