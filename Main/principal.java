package Main;



import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el número de procesos:");
        int procesos = in.nextInt();

        System.out.print("Ingrese el número de productos por proceso:");
        int prodxproc = in.nextInt();

        System.out.print("Ingrese el número de procesos con espera semiactiva:");
        int semiAct = in.nextInt();

        System.out.print("Ingrese el límite de los buzones:");
        int limBuffs = in.nextInt();



        int productos = procesos * prodxproc;

        Buffer bufferMain = new Buffer(productos);


        for (int i = 0; i < productos; i++) {
            if (i>semiAct){
                producto prod = new producto(i+1, "naranja", "creado");
                bufferMain.almacenar(prod);
            } else {
                producto prod = new producto(i+1, "azul", "creado");
                bufferMain.almacenar(prod);
            }         
          }

          bufferMain.imprimir();





/* 
        Productor p = new Productor (20, buffer) ;
        Consumidor c = new Consumidor (20, buffer) ;
        p.start () ;
        c.start () ;
*/

    }
}