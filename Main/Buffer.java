package Main;


import java.util.ArrayList;

public class Buffer {

    private int n ;
    private ArrayList<producto> buff ;
    

    public Buffer (int n) {
        this.n = n ;
        buff = new ArrayList<producto>(n);

   }




    public synchronized void almacenar (producto prod) {

        while (buff.size() == n){
            try {
                wait() ;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } //Conceptual
        }
        buff.add(prod) ;
        notify () ;

    }


    public synchronized producto retirar () {

        while (buff.size () == 0){
            try {
                wait() ;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } //Conceptual
        }
        
        producto i = buff.remove (0) ;
        notify () ;
        return i ;

    }




}