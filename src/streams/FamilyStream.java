package streams;

import java.util.ArrayList;
import java.util.List;

public class FamilyStream {
    private final String name;
    private final List<HumanStream> listFamilyMembers;

    public FamilyStream(String name) {
        this.name = name;
        listFamilyMembers = new ArrayList<>();
    }

    public List<HumanStream> getList() {
        return listFamilyMembers;
    }

    public void addToFamily(HumanStream humanStream) {
        listFamilyMembers.add(humanStream);
    }
}
