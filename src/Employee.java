public sealed abstract class Employee permits Manager, Salesman {
    private String code;
    private String name;
    private String address;
    private int age;
    private double salary;

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return this.salary;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();
}
