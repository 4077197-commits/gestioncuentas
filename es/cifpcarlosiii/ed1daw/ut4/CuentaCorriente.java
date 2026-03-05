package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

public class CuentaCorriente extends Cuenta {

    private double comision;

    public CuentaCorriente() {
        setComision(2.0);
    }

    public void aplicarComision() {
        setSaldo(getSaldo() - getComision());
    }

    private double getComision() {
        return comision;
    }

    private void setComision(double comision) {
        this.comision = comision;
    }
}