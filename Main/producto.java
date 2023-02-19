package Main;

public class producto extends Thread {
    
    private int id;
    private String color;
    private String mensaje;

    public producto (int id, String color, String mensaje){

        this.id = id;
        this.color = color;
        this.mensaje = mensaje;

    }

    public void imprimir (){
        System.out.println( String.valueOf(id) + ": " + color + ": " + mensaje );
    }


    public void run (  ){

    }



    


}