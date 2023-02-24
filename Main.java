package homework;
import java.util.Iterator;

public class Main {
    public static void main(String[]args){
        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("a");
        stringLinked.addLast("b");
        stringLinked.addLast("c");

        Iterator iterator = stringLinked.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
