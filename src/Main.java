public class Main {
    public static void main(String[] args) {

        Racional racionales = new Racional();
        System.out.println("Usamos el método pedirDatos() Para ingresar los números racionales");
        racionales.pedirDatos();
        System.out.println("Suma: ");
        racionales.sumarRacionales();
        System.out.println("Resta: ");
        racionales.restarRacionales();
        System.out.println("Opuesto: ");
        racionales.opuestoRacionales();
        System.out.println("Inverso: ");
        racionales.inversoRacionales();

        //Ahora con valores pasados como argumentos
        System.out.println("Ahora usando el constructor que pide un argumento de tipo String");
        Racional racionalUno = new Racional("8/4");
        racionalUno.sumarRacionalConArgumento("6/2");
        racionalUno.restarRacionalConArgumento("6/2");
        racionalUno.opuestoRacional();
        racionalUno.inversoRacional();

    }
}