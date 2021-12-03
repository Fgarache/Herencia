package operaciones;

import java.util.Scanner;

public class ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void perdirdatos(){
        System.out.print("Primer Valor");
        valor1 = entrada.nextInt();

        System.out.print("Segundo valor");
        valor2 = entrada.nextInt();
    }

    public void mostrarresultado(){
        System.out.println(resultado);
    }


}
