class Calculator
{
    double pi = 3.14;
    public int add(int x, int y)
    {
        int sum = x + y;
//        double division = (double) x /y;
//        double area = x*y;
//        int perimeter_of_rectangle = 2*(x+y);
//        int perimeter_of_square = 4*x;
        return sum;
    }

    public int diff(int x, int y)
    {
        int diff;
        diff = x - y;
        return diff;
    }

    public int product(int x, int y)
    {
        double product = (double) x*y;
        return (int) product;
    }

}

class Main
{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Calculator calc = new Calculator();

        int ans = calc.add(a,b);
        System.out.println("ans is: " + ans);
    }
}