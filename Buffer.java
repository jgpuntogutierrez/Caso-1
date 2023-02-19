
import java.util.ArrayList;

public class Buffer {

    private int n ;
    private ArrayList buff ;
    

    public Buffer (int n) {
        this.n = n ;
        buff = new ArrayList<producto>(n);

    
   }

   public void imprimir (){

    

   }


    public synchronized void almacenar (Integer i) throws InterruptedException {

        while (buff.size() == n){
            wait() ; //Conceptual
        }
        
        buff.add (i) ;
        notify () ;

    }


    public synchronized Integer retirar () throws InterruptedException {

        while (buff.size () == 0){
            wait() ; //Conceptual
        }
        
        Integer i = (Integer) buff.remove (0) ;
        notify () ;
        return i ;

    }




}