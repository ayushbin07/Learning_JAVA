package Projects;

import java.time.LocalTime;

class task{
    private String name;
    private boolean isDone;
    private LocalTime time;

    public task(String name, boolean isDone, LocalTime time) {
        this.name = name;
        this.isDone = isDone;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return isDone;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}



public class ToDoList {
    public static void main(String[] args) {

    }
}
