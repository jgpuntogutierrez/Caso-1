package Main;


import java.util.ArrayList;

public class Buffer {

    private int limite ;
    ArrayList<producto> buff ;
    

    public Buffer (int limite) {

        this.limite = limite ;
            buff = new ArrayList<producto>();
        
   }

   /*
    preguntarle a la profesora que 
    si se puede almacenar en una variable el infinito


    */


   public void imprimir (){
    
    for (int i = 0; i < buff.size(); i++){
       buff.get(i).imprimir();

    }
    }



    public synchronized void almacenar (producto prod) {

        while (buff.size() == limite){
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