package algorithms;

import java.util.*;

public class DijkstraAlgorithm {

    // Класс для представления графа
    static class Edge {
        int targetNode;
        int weight;

        public Edge(int targetNode, int weight) {
            this.targetNode = targetNode;
            this.weight = weight;
        }
    }

    // Алгоритм Дейкстры
    public static Map<Integer, Integer> dijkstra(Map<Integer, List<Edge>> graph, int source) {
        // Таблица расстояний (инициализация)
        Map<Integer, Integer> distances = new HashMap<>();
        for (int node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);  // Устанавливаем все расстояния как бесконечные
        }
        distances.put(source, 0);  // Расстояние до начального узла = 0

        // Очередь с приоритетом для обработки узлов
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source, 0});

        // Множество посещенных узлов
        Set<Integer> visited = new HashSet<>();

        // Основной цикл алгоритма
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            // Если узел уже был посещен, пропускаем его
            if (visited.contains(currentNode)) continue;

            // Отмечаем текущий узел как посещенный
            visited.add(currentNode);

            // Проверяем соседей
            for (Edge edge : graph.get(currentNode)) {
                int neighbor = edge.targetNode;
                int newDistance = currentDistance + edge.weight;

                // Если найден более короткий путь к соседу, обновляем его расстояние
                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    pq.add(new int[]{neighbor, newDistance});
                }
            }
        }

        return distances;  // Возвращаем таблицу минимальных расстояний
    }

    public static void main(String[] args) {
        // Пример графа
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 5), new Edge(2, 1)));
        graph.put(1, Arrays.asList(new Edge(2, 2), new Edge(3, 3)));
        graph.put(2, Arrays.asList(new Edge(3, 6), new Edge(1, 2)));
        graph.put(3, Collections.emptyList());

        // Запуск алгоритма Дейкстры
        Map<Integer, Integer> distances = dijkstra(graph, 0);

        // Вывод результатов
        System.out.println("Минимальные расстояния от начального узла:");
        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            System.out.println("Узел " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
