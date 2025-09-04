class Employee{
    int salary;
    String name;

    //constructor
    public Employee(String name, int salary){
        this.salary = salary;
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(int o){
        salary = o;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Employee ayush = new Employee("Ayush",200000);
        System.out.println(ayush.getName());
        System.out.println(ayush.getSalary());
        ayush.setSalary(100000);
        System.out.println(ayush.getSalary());
        ayush.setName("Ayushi");
        System.out.println(ayush.getName());

    }
}



