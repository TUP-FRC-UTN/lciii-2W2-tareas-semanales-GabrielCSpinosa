
package banco;


public class cajaAhorro extends cuenta {
        public String puedeExtraer(double valor){
        String t = "";
        if (valor < saldo) {
            super.extraer(valor);
            t = "Su saldo es: " + saldo;
        }
        else
            t = "No posee saldo suficiente para la extracción.";
        return t;
    }
        
    public cajaAhorro(int numero, String nombre, double saldo){
        super(numero,nombre,saldo);
    }

    @Override
    
    public String toString() {
        return super.toString();
    }    
}
