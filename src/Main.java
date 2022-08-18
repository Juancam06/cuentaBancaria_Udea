public class Main {
    public static void main(String[] args) {

        //instanciar la clase
        Cuenta miCuenta=new Cuenta("123456","Ahorro", 150000);
        System.out.println("Saldo minimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("Saldo actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("Saldo actual: "+miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        miCuenta.setNumero("987654");
        System.out.println(miCuenta.toString());
        System.out.println("--------------------------------------------");
        Cuenta pedroCuenta= new Cuenta("585858","prestamo",5000);
        System.out.println(pedroCuenta.toString());
    }
}
