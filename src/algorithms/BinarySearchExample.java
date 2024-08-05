package algorithms;

public class BinarySearchExample {
    // Метод бинарного поиска
    public static int binarySearch(int[] array, int target) {
        int left = 0;  // Начальный индекс
        int right = array.length - 1;  // Конечный индекс

        while (left <= right) {
            int middle = left + (right - left) / 2;  // Средний индекс

            // Проверяем, совпадает ли элемент в середине с искомым
            if (array[middle] == target) {
                return middle;  // Возвращаем индекс найденного элемента
            }

            // Если искомый элемент меньше среднего, продолжаем поиск в левой половине массива
            if (array[middle] > target) {
                right = middle - 1;
            }
            // Если искомый элемент больше среднего, продолжаем поиск в правой половине массива
            else {
                left = middle + 1;
            }
        }

        // Возвращаем -1, если элемент не найден
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};  // Пример отсортированного массива
        int target = 10;  // Элемент, который нужно найти

        // Вызов метода бинарного поиска
        int result = binarySearch(array, target);

        // Выводим результат
        if (result == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден на индексе: " + result);
        }
    }
}
