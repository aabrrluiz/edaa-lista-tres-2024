public class Ordenador {
  public void insertionSort(String[] array) {
      int tamanhoVetor = array.length;

      for (int i = 1; i < tamanhoVetor; i++) {
          String chave = array[i];
          int j = i -1;

          while (j >= 0 && array[j].compareTo(chave) > 0) {
              array[j + 1] = array[j];
              j = j - 1;
          }
          array[j + 1] = chave;
      }
  }
    
}