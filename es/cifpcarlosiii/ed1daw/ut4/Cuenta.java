package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

/**
 * Descripcion
 * @version 1.1
 * @author Noelia
 */
public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta() {
        setSaldo(0);
    }

    /**
     * Muestra por pantalla el nombre del titular y el saldo
     */
    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * Retira una cantidad si es menor que el saldo que hay
     * @param cantidad {double} la cantidad que se va a retirar
     * @return {boolean} true si la cnatidad es menor que el saldo, false si la cantidad es mayor que el saldo
     */
    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    private String getTitular() {
        return titular;
    }

    private void setTitular(String titular) {
        this.titular = titular;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
