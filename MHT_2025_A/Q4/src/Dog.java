
public class Dog {

    private String name;
    private String type;
    private char gender;
    private int age;
    private boolean isImmune;

    public Dog() {
        this.age = 0;
        this.gender = ' ';
        this.isImmune = false;
        this.name = "";
        this.type = "";
    }

    public Dog(int age, char gender, boolean isImmune, String name, String type) {
        this.age = age;
        this.gender = gender;
        this.isImmune = isImmune;
        this.name = name;
        this.type = type;
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

    public boolean isIsImmune() {
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
        return gender == this.gender && age >= this.age;
    }
}
