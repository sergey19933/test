import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        Map<B, String> map = new HashMap<>();
        map.put(new B(5555), "Alla");
        System.out.println(map.get(new B(5555)));

    }
}
