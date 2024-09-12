package algorithms;

public class SelectionSort {

    // Метод для выполнения сортировки выбором
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Перемещаем границу неотсортированной части массива
        for (int i = 0; i < n - 1; i++) {
            // Ищем минимальный элемент в неотсортированной части массива
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Обновляем индекс минимального элемента
                }
            }

            // Меняем местами найденный минимальный элемент с первым элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};  // Пример несортированного массива

        // Вызов метода сортировки выбором
        selectionSort(array);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

