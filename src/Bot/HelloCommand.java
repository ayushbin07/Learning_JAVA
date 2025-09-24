package Bot;

public class HelloCommand implements Command {
    @Override
    public String getName(){
        return "hello";
    }

    @Override
    public void execute(String[] args){
        if(args.length == 0){
            System.out.println("Hello, User");
        }else{
            System.out.println("Hello, " + String.join(" ", args) + "!");
        }
    }
}
