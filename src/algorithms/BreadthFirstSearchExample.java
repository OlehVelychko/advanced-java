package algorithms;

import java.util.*;

public class BreadthFirstSearchExample {

    // Define the graph using a HashMap. Each person is associated with a list of their friends.
    private final Map<String, List<String>> graph;

    public BreadthFirstSearchExample() {
        graph = new HashMap<>();
        // Populate the graph with friends of each person.
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList()); // No friends
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());
    }

    // Helper function to simulate checking if a person is a mango seller.
    private boolean personIsSeller(String name) {
        return name.endsWith("m"); // For simplicity, assume anyone whose name ends with 'm' sells mangoes.
    }

    // The breadth-first search (BFS) method.
    public boolean search(String name) {
        // Create a queue for BFS and add the initial person (you).
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

        // List to keep track of already searched people to avoid redundant checks.
        List<String> searched = new ArrayList<>();

        // While there are people left in the queue to search.
        while (!searchQueue.isEmpty()) {
            // Get the next person from the queue.
            String person = searchQueue.poll();

            // Check if the person has already been searched.
            if (!searched.contains(person)) {
                // Check if the person is a mango seller.
                if (personIsSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true; // If found, return true and stop the search.
                } else {
                    // If not a seller, add all their friends to the queue.
                    searchQueue.addAll(graph.get(person));
                    // Mark the person as searched.
                    searched.add(person);
                }
            }
        }
        // If no seller is found, return false.
        System.out.println("No mango seller found.");
        return false;
    }

    public static void main(String[] args) {
        // Create the BFS object and start the search from "you".
        BreadthFirstSearchExample bfs = new BreadthFirstSearchExample();
        bfs.search("you");
    }
}