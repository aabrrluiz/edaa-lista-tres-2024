public class Ordenador{
    public void bubbleSort(String[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    }