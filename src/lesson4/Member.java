package lesson4;

public class Member {
    private String name;
    private String position;
    private String phone;
    private long salary;
    private int age;
    private int id;

    public Member(String name, String position, String phone, long salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.id = ++id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    String getMember() {
        return id + " " + this.name + " " +
                this.age + " years old, " +
                this.position + ". Phone number: " +
                this.phone + ". Salary: " +
                this.salary + " USD";
    }


}
