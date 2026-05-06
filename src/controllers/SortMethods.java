package controllers;

public class SortMethods {
    public void sortBubble(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

    }

    public void sortBubbleAvan(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j + 1] = array[j];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }

    }

    public void insertionSort(int[] array, boolean asc) {

        for (int i = 1; i < array.length; i++) {
            int aux = array[i];
            int j = i;

            if (asc) {
                // Orden ascendente
                while (j > 0 && array[j - 1] > aux) {
                    array[j] = array[j - 1];
                    j--;
                }
            } else {
                // Orden descendente
                while (j > 0 && array[j - 1] < aux) {
                    array[j] = array[j - 1];
                    j--;
                }
            }

            array[j] = aux;
        }

    }

    public void shellSort(int[] arreglo, boolean asc) {
        int[] array = arreglo.clone();

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                int aux = array[i];
                int j;

                if (asc) {
                    // Orden ascendente
                    for (j = i; j >= gap && array[j - gap] > aux; j -= gap) {
                        array[j] = array[j - gap];
                    }
                } else {
                    // Orden descendente
                    for (j = i; j >= gap && array[j - gap] < aux; j -= gap) {
                        array[j] = array[j - gap];
                    }
                }

                array[j] = aux;
            }
        }

    }

}
