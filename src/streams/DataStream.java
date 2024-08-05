package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DataStream {
    private static DataStream instance;

    private DataStream() {
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exist");
        }
    }

    public static DataStream getInstance() {
        if (instance == null) {
            instance = new DataStream();
        } else {
            throw new IllegalStateException("Singleton instance already exist");
        }

        return instance;
    }

    /**
     * The method for creating a list of people
     *
     * @return List<Human>
     */
    public List<HumanStream> createHumanData() {
        List<HumanStream> humanStreamList = new ArrayList<>();

        HumanStream humanStream1 = new HumanStream("Alice", 1, HumanStream.Sex.FEMALE);
        HumanStream humanStream2 = new HumanStream("Rita", 35, HumanStream.Sex.FEMALE);
        HumanStream humanStream3 = new HumanStream("Grandma", 83, HumanStream.Sex.FEMALE);
        HumanStream humanStream4 = new HumanStream("Mummy", 62, HumanStream.Sex.FEMALE);
        HumanStream humanStream5 = new HumanStream("Dad", 63, HumanStream.Sex.MALE);
        HumanStream humanStream6 = new HumanStream("Oleh", 34, HumanStream.Sex.MALE);

        humanStreamList.add(humanStream1);
        humanStreamList.add(humanStream2);
        humanStreamList.add(humanStream3);
        humanStreamList.add(humanStream4);
        humanStreamList.add(humanStream5);
        humanStreamList.add(humanStream6);

        return humanStreamList;
    }

    /**
     * The method for creating an array of numbers
     *
     * @return int[]
     */
    public int[] createIntArrayData() {
        return new int[]{5, 2, 3, 7, 4, 6, 78, 0, 2, 12, 1, 7, 5, 23};
    }

    /**
     * The method for creating a list of String
     *
     * @return List<String>
     */
    public List<String> createStringData() {
        return new ArrayList<>(Arrays.asList("Alice", "Rita", "Oleh", "Eileen"));
    }

    /**
     * The method for creating a list of Integer
     *
     * @return List<Integer>
     */
    public List<Integer> createIntegerData() {
        return new ArrayList<>(Arrays.asList(5, 2, 12, 8, 0, 9, 1));
    }

    /**
     * The method for creating a TreeSet of String
     *
     * @return TreeSet<String>
     */
    public TreeSet<String> createTreeSetStringData() {
        return new TreeSet<>(Arrays.asList("Alice", "Rita", "Oleh", "Eileen"));
    }
}
