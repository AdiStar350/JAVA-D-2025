
public class Dog {

    private String name;
    private String type;
    private char gender;
    private int age;
    private boolean isImmune;

    public Dog(String name, String type, char gender, int age, boolean isImmune) {
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.isImmune = isImmune;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsImmune() {
        return isImmune;
    }

    public void setIsImmune(boolean isImmune) {
        this.isImmune = isImmune;
    }

    @Override
    public String toString() {
        return "Dog{"
                + "name='" + name + '\''
                + ", type='" + type + '\''
                + ", gender=" + gender
                + ", age=" + age
                + ", isImmune=" + isImmune
                + '}';
    }

    public boolean isItSuitable(char gender, int age) {
        return this.gender == gender && this.age <= age;
    }
}
