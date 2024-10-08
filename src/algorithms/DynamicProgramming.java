package algorithms;

public class DynamicProgramming {

    // Метод для решения задачи о рюкзаке
    public static int knapsack(int[] weights, int[] values, int capacity) {
        // Создаем таблицу для хранения максимальных значений для каждого подрюкзака
        int[][] dp = new int[weights.length + 1][capacity + 1];

        // Проходим по каждому предмету
        for (int i = 1; i <= weights.length; i++) {
            // Проходим по каждому возможному весу рюкзака от 0 до максимальной вместимости
            for (int w = 1; w <= capacity; w++) {
                // Если текущий предмет не помещается в рюкзак (его вес больше текущей вместимости w)
                if (weights[i - 1] > w) {
                    dp[i][w] = dp[i - 1][w];  // Берем значение из предыдущей строки, т.е. без этого предмета
                } else {
                    // Иначе выбираем максимальное: либо не берем предмет, либо берем его и прибавляем его стоимость
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        // Возвращаем максимальную стоимость, которую можно получить при данной вместимости рюкзака
        return dp[weights.length][capacity];
    }

    public static void main(String[] args) {
        // Вес предметов
        int[] weights = {1, 3, 4, 5};
        // Стоимость предметов
        int[] values = {1500, 2000, 3000, 3500};
        // Вместимость рюкзака
        int capacity = 7;

        // Вызываем метод и выводим результат
        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Максимальная стоимость предметов в рюкзаке: " + maxValue);
    }
}
