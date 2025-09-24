package Bot;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Command> commands = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        commands.put("hello" , new HelloCommand());
        commands.put("exit" , new Exit());
        commands.put("calc" , new CalcCommand());
        commands.put("note", new NoteCommand());
        //commands.put("help", new HelpCommand());

        while(true){
            System.out.print("> ");
            String line = scan.nextLine();
            String[] parts = line.split(" ");
            String cmdName = parts[0];
            String[] cmdArgs = Arrays.copyOfRange(parts, 1,parts.length);
            Command cmd = commands.get(cmdName);
            if (cmd != null){
                cmd.execute(cmdArgs);
            }else{
                System.out.println("Unknown command: "+ cmdName);
            }
        }
    }
}
