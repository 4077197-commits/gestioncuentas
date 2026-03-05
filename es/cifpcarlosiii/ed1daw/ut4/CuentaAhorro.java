package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

public class CuentaAhorro extends Cuenta {

    public double interes;

    public CuentaAhorro() {
        interes = 1.5;
    }

    public void aplicarInteres() {
        setSaldo(getSaldo() + (getSaldo() * interes / 100));
    }
}