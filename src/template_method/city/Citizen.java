package template_method.city;

public class Citizen {
    private String id;
    private String name;
    private String gender;
    private int age;
    private int strength;

    public Citizen() {}

    public Citizen(String id, String name, String gender, int age, int strength) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.strength = strength;
    }

    public Citizen(Citizen citizen) {
        id = citizen.getId();
        name = citizen.getName();
        gender = citizen.getGender();
        age = citizen.getAge();
        strength = citizen.getStrength();
    }

    public void upgradeStrength(int stat) {
        strength += stat;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                '}';
    }
}
