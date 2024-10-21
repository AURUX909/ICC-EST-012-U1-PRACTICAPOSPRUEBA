package Controller;

import Models.Person;

public class SortingMethods {

    public void sortByNameWithBubble(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (personas[j].getName().compareTo(personas[j + 1].getName()) > 0) {
                    Person aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }
    }

    public void sortByNameWithSelectionDes(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[j].getName().compareTo(personas[maxIndex].getName()) > 0) {
                    maxIndex = j;
                }
            }
            Person aux = personas[maxIndex];
            personas[maxIndex] = personas[i];
            personas[i] = aux;
        }
    }

    public void sortByAgeWithInsertion(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 1; i < tamanio; i++) {
            Person key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > key.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
    }

    public void sortByNameWithInsertion(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 1; i < tamanio; i++) {
            Person key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getName().compareTo(key.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
    }
}
