package SEP_06;

//. toString()
//Method inherited from the Object class.
//Used to return a string representation of an object.
//By default, it returns a hash code as a unique identifier.
//It can be overridden to provide meaningful details.

class car{
    String company;
    String model;
    int year;
    String color;

    @Override
    public String toString() {
        return "car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public car(String company, String model, int year, String color) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;


    }
}
public class toString {
    public static void main(String[] args) {
        car cars = new car("Ford","Mustang",2024,"Red");
        System.out.println(cars);
    }
}

