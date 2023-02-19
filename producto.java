
public class producto extends Thread {
    
    private int id;

    public producto (int n){
        id = n;
    }

/*  public void run (){
        
    }
 */

    public static void main (String[] args){

        int nThreads = 10;

        for (int i=0; i < nThreads; i++){
            new producto(i).start();

        }

    }


}