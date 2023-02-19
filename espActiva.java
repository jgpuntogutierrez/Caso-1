
public class espActiva {

    private boolean hayDatos = false ;

    public synchronized boolean darHayDatos () {
        return hayDatos ;
    }

    public synchronized void modHayDatos (boolean data) {
        hayDatos = data ;
    }
    
}