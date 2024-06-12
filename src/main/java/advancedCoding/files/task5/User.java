package advancedCoding.files.task5;
public class User {
    private String name;
    private String lastName;
    private int age;

    public User() {
    }
    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public User setName(String name) {
        this.name = name;
        return this;
    }
    public String getLastName() {
        return lastName;
    }
    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public int getAge() {
        return age;
    }
    public User setAge(int age) {
        this.age = age;
        return this;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}