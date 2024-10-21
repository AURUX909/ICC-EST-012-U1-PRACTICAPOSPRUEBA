package View;

import Controller.Controller;
import Controller.SearchMethods;
import Controller.SortingMethods;

public class App {

    public static void main(String[] args) {
        View vista = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();
        Controller controller = new Controller(vista, sortingMethods, searchMethods);
        controller.start();
    }
}
