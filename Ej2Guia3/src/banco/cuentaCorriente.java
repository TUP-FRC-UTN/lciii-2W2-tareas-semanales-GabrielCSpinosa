
package banco;


public class cuentaCorriente extends cuenta {
    double acuerdo;

    public double getAcuerdo() {
        return acuerdo;
    }
    public void setAcuerdo(double acuerdo) {
        this.acuerdo = acuerdo;
    }
    
    public String puedeExtraerLimite(double acuerdo){
        String t = "";
        if (saldo <= acuerdo){
            super.extraer(0);
            t = "No puede extraer más dinero";
        }
        return t;
    }
    
    public cuentaCorriente(double acuerdo, int numero, String nombre, double saldo){
        super(numero,nombre,saldo);
        this.acuerdo = acuerdo;
    }

    @Override
    
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "acuerdo=" + acuerdo + '}';
    }    
}
