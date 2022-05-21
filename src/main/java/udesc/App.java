package udesc;

import udesc.Controller.Controlador;
/**
 * Hello world!
 *
 */
import udesc.View.Principal;

/**
 *
 * @author guand
 */
public class App {
    public static void main(String[] args) {
        Controlador c = new Controlador();
        Principal view = new Principal(c);
        view.show();
   //  view.   
    }
}
