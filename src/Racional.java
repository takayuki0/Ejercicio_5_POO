import java.util.Scanner;

public class Racional {

    private String racionalUno, racionalDos;
    private int numeradorUno, denominadorUno, numeradorDos, denominadorDos;

    public Racional() {

    }

    public Racional(String r) {
        String datos[] = r.split("/");
        this.numeradorUno = Integer.parseInt(datos[0]);
        this.denominadorUno = Integer.parseInt(datos[1]);
    }

    public void pedirDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número racional en el siguiente formato, A/B: ");
        racionalUno = entrada.nextLine();
        String datosUno[] = racionalUno.split("/");
        numeradorUno = Integer.parseInt(datosUno[0]);
        denominadorUno = Integer.parseInt(datosUno[1]);

        System.out.print("Ingrese el segundo número racional en el siguiente formato, A/B: ");
        racionalDos = entrada.nextLine();
        String datosDos[] = racionalDos.split("/");
        numeradorDos = Integer.parseInt(datosDos[0]);
        denominadorDos = Integer.parseInt(datosDos[1]);
    }

    public void sumarRacionales() {
        if (denominadorUno == denominadorDos) {
            int sumaNumeradores = numeradorUno + numeradorDos;
            System.out.println("El resultado de la suma de los racionales es: " + sumaNumeradores + "/" + denominadorUno +
                    "\n_____________________________________________________________");
        } else {
            int sumaNumeradores = (numeradorUno * denominadorDos) + (denominadorUno * numeradorDos);
            int operacionDenominador = denominadorUno * denominadorDos;
            System.out.println("El resultado de la suma de los racionales es: " + sumaNumeradores + "/" + operacionDenominador +
                    "\n_____________________________________________________________");
        }
    }

    public void restarRacionales() {
        if (denominadorUno == denominadorDos) {
            int restaNumeradores = numeradorUno - numeradorDos;
            System.out.println("El resultado de la resta de los racionales es: " + restaNumeradores + "/" + denominadorUno +
                    "\n_____________________________________________________________");
        } else {
            int restaNumeradores = (numeradorUno * denominadorDos) - (denominadorUno * numeradorDos);
            int operacionDenominador = denominadorUno * denominadorDos;
            System.out.println("El resultado de la resta de los racionales es: " + restaNumeradores + "/" + operacionDenominador +
                    "\n_____________________________________________________________");
        }
    }

    public void opuestoRacionales() {
        System.out.println("El opuesto del Racional Nro. 01 es: " + (numeradorUno + 2 * (-numeradorUno)) + "/" + denominadorUno);
        System.out.println("El opuesto del Racional Nro. 02 es: " + (numeradorDos + 2 * (-numeradorDos)) + "/" + denominadorDos +
                "\n_____________________________________________________________");
    }

    public void inversoRacionales() {
        System.out.println("El inverso del Racional Nro. 01 es: " + denominadorUno + "/" + numeradorUno);
        System.out.println("El inverso del Racional Nro. 02 es: " + denominadorDos + "/" + numeradorDos +
                "\n_____________________________________________________________");

    }


    public void sumarRacionalConArgumento(String r) {
        String datos[] = r.split("/");
        int numerador = Integer.parseInt(datos[0]);
        int denominador = Integer.parseInt(datos[1]);

        if (denominadorUno == denominador) {
            int sumaNumeradores = numeradorUno + numerador;
            System.out.println("El resultado de la suma de los racionales es: " + sumaNumeradores + "/" + denominadorUno +
                    "\n_____________________________________________________________");
        } else {
            int sumaNumeradores = (numeradorUno * denominador) + (denominadorUno * numerador);
            int operacionDenominador = denominadorUno * denominador;
            System.out.println("El resultado de la suma de los racionales es: " + sumaNumeradores + "/" + operacionDenominador +
                    "\n_____________________________________________________________");
        }

    }

    public void restarRacionalConArgumento(String r) {
        String datos[] = r.split("/");
        int numerador = Integer.parseInt(datos[0]);
        int denominador = Integer.parseInt(datos[1]);

        if (denominadorUno == denominador) {
            int sumaNumeradores = numeradorUno - numerador;
            System.out.println("El resultado de la resta de los racionales es: " + sumaNumeradores + "/" + denominadorUno +
                    "\n_____________________________________________________________");
        } else {
            int sumaNumeradores = (numeradorUno * denominador) - (denominadorUno * numerador);
            int operacionDenominador = denominadorUno * denominador;
            System.out.println("El resultado de la resta de los racionales es: " + sumaNumeradores + "/" + operacionDenominador +
                    "\n_____________________________________________________________");
        }
    }

    public void opuestoRacional() {
        System.out.println("El opuesto del Racional es: " + (numeradorUno + 2 * (-numeradorUno)) + "/" + denominadorUno +
                "\n_____________________________________________________________");
    }

    public void inversoRacional() {
        System.out.println("El inverso del Racional es: " + denominadorUno + "/" + numeradorUno +
                "\n_____________________________________________________________");
    }

}
