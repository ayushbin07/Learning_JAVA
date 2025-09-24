package Bot;

public class CalcCommand implements Command{
    @Override
    public String getName() {
        return "calc";
    }

    @Override
    public void execute(String[] args) {
        if(args.length != 3 ){System.out.println("Usage: calc <a> <operator> <b>"); return;}
        try {
            double a = Double.parseDouble(args[0]);
            String op = args[1];
            double b = Double.parseDouble(args[2]);
            double result = switch (op) {
                case "+" -> a+b;
                case "-" -> a-b;
                case "*" -> a*b;
                case "/" -> b==0? Double.NaN : a/b;
                default -> {System.out.println("Unknown operator: " + op ); yield Double.NaN;}
            };
            System.out.println(result);
        } catch(NumberFormatException e){
            System.out.println("Numbers only for <a> and <b>. ");
        }
    }
}
