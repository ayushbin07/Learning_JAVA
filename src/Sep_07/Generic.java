package Sep_07;

//Generics A concept where you can write a class, interface, or method
//that is compatible with different data types.
//< T > type parameter (placeholder) that gets replaced with a real type)
//<String> type argument (specifies the type)


class Box<T>{
    T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
public class Generic {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());
        Box<Integer> boxy = new Box<>();
        boxy.setItem(3);
        System.out.println(boxy.getItem());
    }
}
