package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta() {
        setSaldo(0);
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

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
