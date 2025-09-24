package Bot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteCommand implements Command {
    private final List<String> notes = new ArrayList<>();

    @Override
    public String getName() {
        return "note";
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: note <add|list|clear> ...");
            return;
        }
        String sub = args[0];
        switch (sub) {
            case "add" -> {
                if (args.length < 2) {
                    System.out.println("Usage: note add <text>");
                    return;
                }
                String text = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
                notes.add(text);
                System.out.println("Added");
            }
            case "list" -> {
                if (notes.isEmpty()) {
                    System.out.println("No notes");
                    return;
                }
                for (int i = 0; i < notes.size(); i++) {
                    System.out.println(i + 1 + ". " + notes.get(i));
                }
            }
            case "clear" -> {
                notes.clear();
                System.out.println("Cleared");
            }
            default -> System.out.println("Unkown: " + sub);
        }
    }
}
