
import java.util.ArrayList;

public class Buffer {

    private int n ;
    private ArrayList buff ;
    

    public Buffer (int n) {
        this.n = n ;
        buff = new ArrayList<producto>(n);

   }


    public synchronized void almacenar (Integer i) {

        while (buff.size() == n){
            wait() ; //Conceptual
        }
        
        buff.add (i) ;
        notify () ;

    }


    public synchronized Integer retirar () {

        while (buff.size () == 0){
            wait() ; //Conceptual
        }
        
        Integer i = (Integer) buff.remove (0) ;
        notify () ;
        return i ;

    }




}