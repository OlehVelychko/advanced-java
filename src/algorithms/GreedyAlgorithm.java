package algorithms;

import java.util.Arrays;

public class GreedyAlgorithm {

    // Метод для нахождения минимального количества монет
    public static int getMinimumCoins(int[] coins, int amount) {
        // Сортируем монеты в порядке убывания
        Arrays.sort(coins);
        int count = 0;
        int remainingAmount = amount;

        // Проходим по монетам, начиная с самой крупной
        for (int i = coins.length - 1; i >= 0; i--) {
            // Если текущая монета меньше или равна оставшейся сумме
            if (coins[i] <= remainingAmount) {
                // Вычисляем количество монет этого номинала
                count += remainingAmount / coins[i];
                // Обновляем оставшуюся сумму
                remainingAmount %= coins[i];
            }
        }

        // Возвращаем общее количество монет
        return count;
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 63;
        int result = getMinimumCoins(coins, amount);
        System.out.println("Минимальное количество монет: " + result);
    }
}
