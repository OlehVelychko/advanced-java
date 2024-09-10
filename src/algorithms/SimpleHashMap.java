package algorithms;

import java.util.LinkedList;

public class SimpleHashMap<K, V> {

    // Внутренний массив для хранения ключей и значений
    private final LinkedList<Entry<K, V>>[] table;
    private final int capacity; // Вместимость массива

    // Внутренний класс для представления пары ключ-значение
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public SimpleHashMap(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        // Инициализация массива списков
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Простейшая хэш-функция
    private int hash(K key) {
        int hashCode = key.hashCode(); // Получаем хэш-код ключа
        return Math.abs(hashCode) % capacity; // Применяем модуль по размеру массива
    }

    // Метод для добавления пары ключ-значение
    public void put(K key, V value) {
        int index = hash(key); // Вычисляем индекс с помощью хэш-функции
        LinkedList<Entry<K, V>> bucket = table[index];

        // Проверяем, существует ли уже ключ
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновляем значение, если ключ уже существует
                return;
            }
        }

        // Если ключа нет, добавляем новый элемент в корзину
        bucket.add(new Entry<>(key, value));
    }

    // Метод для получения значения по ключу
    public V get(K key) {
        int index = hash(key); // Вычисляем индекс с помощью хэш-функции
        LinkedList<Entry<K, V>> bucket = table[index];

        // Ищем ключ в списке
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value; // Возвращаем значение, если ключ найден
            }
        }

        return null; // Возвращаем null, если ключ не найден
    }

    // Метод для удаления элемента по ключу
    public void remove(K key) {
        int index = hash(key); // Вычисляем индекс с помощью хэш-функции
        LinkedList<Entry<K, V>> bucket = table[index];

        // Ищем ключ в списке
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry); // Удаляем элемент, если ключ найден
                return;
            }
        }
    }

    // Печать содержимого SimpleHashMap
    public void printMap() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry<K, V> entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>(5);

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Grape", 40);
        map.put("Peach", 50);

        map.printMap();

        System.out.println("Value for 'Apple': " + map.get("Apple"));

        map.remove("Orange");
        map.printMap();
    }
}