package Bot;

public interface Command {
    String getName();
    void execute(String[] args);
}
