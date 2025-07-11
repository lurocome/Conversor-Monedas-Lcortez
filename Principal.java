import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner tecladoPais = new Scanner(System.in);
        Scanner tecladoMonto = new Scanner(System.in);
        int opcion = 0;
        double monto=0;
        String deMoneda="";
        String aMoneda="";
        String menu = """
                **********************************
                Sea bienvenido/a al Conversor de Moneda=]
                1) Dolar =>> Peso Argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                Elija una opcion valida:
                **********************************
                """;
 //       System.out.println("**********************************");
 //       System.out.println("Sea bienvenido/a al Conversor de Moneda=]");
 //       System.out.println("1) Dolar =>> Peso Argentino");
 //       System.out.println("2) Peso argentino =>> Dolar");
 //       System.out.println("3) Dolar =>> Real brasileño");
 //       System.out.println("4) Real brasileño =>> Dolar");
 //       System.out.println("5) Dolar =>> Peso colombiano");
 //       System.out.println("6) Peso colombiano =>> Dolar");
 //       System.out.println("7) Salir");
 //       System.out.println("Elija una opcion valida:");
 //       System.out.println("**********************************");//


        while (opcion <= 6){
            System.out.println(menu);
            opcion=tecladoPais.nextInt();

            switch (opcion){
                case 1:
                   deMoneda="USD";
                   aMoneda="ARS";
                    break;
                case 2:
                    deMoneda="ARS";
                    aMoneda="USD";
                    break;
                case 3:
                    deMoneda="USD";
                    aMoneda="BRL";
                    break;
                case 4:
                    deMoneda="BRL";
                    aMoneda="USD";
                    break;
                case 5:
                    deMoneda="USD";
                    aMoneda="COP";
                    break;
                case 6:
                    deMoneda="COP";
                    aMoneda="USD";
                    break;
                case 7:
//                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;

            }

        if (opcion<=6) {
            System.out.println("Ingrese el valor que desea convertir:");
            monto=tecladoMonto.nextDouble();
            SetApi Establece = new SetApi();

            Conversion conv =  Establece.buscarMoneda(deMoneda);
          //  System.out.println(conv); []{}
           // System.out.println("De "+conv.base_code());
           // System.out.println("a "+aMoneda);
            double convRates=conv.conversion_rates().get(aMoneda);
            System.out.println("Rate "+conv.conversion_rates().get(aMoneda).toString());
            System.out.println("El valor de "+monto+ " "+deMoneda +" corresponde al valor final de =>>> "+ String.valueOf(monto*convRates)+" "+aMoneda);

        }

        }
        System.out.println("Gracias");



    }
}
