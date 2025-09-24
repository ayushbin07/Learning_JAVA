package Bot;

public class Exit implements Command {
    @Override
    public String getName(){
        return "exit";
    }

    @Override
    public void execute(String[] args) {
        System.exit(0);
    }
}
