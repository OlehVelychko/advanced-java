package algorithms;

public class QuickSortExample {

    // Метод для выполнения быстрой сортировки
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Находим индекс элемента-разделителя
            int partitionIndex = partition(array, low, high);

            // Рекурсивно сортируем левую часть массива
            quickSort(array, low, partitionIndex - 1);
            // Рекурсивно сортируем правую часть массива
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Метод для разделения массива на две части
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Опорный элемент (обычно последний элемент в массиве)
        int i = low - 1;  // Индекс наименьшего элемента

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (array[j] <= pivot) {
                i++;
                // Меняем местами элементы array[i] и array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Меняем местами элементы array[i + 1] и array[high] (или опорный элемент)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;  // Возвращаем индекс разделения
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};  // Пример несортированного массива
        int n = array.length;

        // Вызов метода быстрой сортировки
        quickSort(array, 0, n - 1);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

