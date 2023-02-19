package Main;


import java.util.ArrayList;

public class Buffer {

    private int n ;
    ArrayList<producto> buff ;
    

    public Buffer (String dif, int limite) {

        if (dif == "lim"){

            this.n = n ;
        buff = new ArrayList<producto>(limite);

        } else {
            this.n = n ;
        buff = new ArrayList<producto>();
        }




        
   }


   public void imprimir (){
    
    for (int i = 0; i < buff.size(); i++){
       buff.get(i).imprimir();

    }
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