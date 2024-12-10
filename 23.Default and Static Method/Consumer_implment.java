import java.util.function.Consumer;

public class Consumer_implment implements Consumer<Integer> {
    @Override
    public void accept(Integer no)
    {
        System.out.println(no);
    }
}
