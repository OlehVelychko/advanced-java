package streams.serviceInformation;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String name;
    private List<Human> listFamilyMembers;

    public Family(String name) {
        this.name = name;
        listFamilyMembers = new ArrayList<>();
    }

    public List<Human> getList() {
        return listFamilyMembers;
    }

    public void addToFamily(Human human) {
        listFamilyMembers.add(human);
    }
}
