package app;

import data.Persistencia;
import views.MainView; 

public class Program {
    public static void main(String[] args) {
        Persistencia.inicializar();
        
        
        MainView view = new MainView();
        view.setVisible(true);
    }
}
