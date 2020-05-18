package banco;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        cajaAhorro ca = new cajaAhorro(1, "Caja", 100);
        System.out.println(ca.toString());        
        cuentaCorriente cc = new cuentaCorriente((-5000), 2, "Cuenta", 100000);
        System.out.println(cc.toString());
        
        System.out.println("******************");
        System.out.println("Eliga el monto a extraer de su Caja de Ahorro: ");
        double m = s.nextDouble();
        
        System.out.println(ca.puedeExtraer(m));
        
        System.out.println("******************");
        System.out.println("Seleccione el monto que extraerá de su Cuenta Corriente: ");
        double mon = s.nextDouble();
        
        System.out.println(cc.puedeExtraerLimite(mon));
    }    
    
    
}
