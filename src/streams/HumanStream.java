package streams;

public class HumanStream {
    private String name;
    private int age;

    public enum Sex {
        MALE, FEMALE
    }

    private Sex sex;

    public HumanStream(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{ Human name is " + getName() + ", his age is " + getAge() + " }";
    }
}