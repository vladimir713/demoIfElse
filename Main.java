import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, AliasInterface> ai = AliasAbstract.mapAlias;
        One.getInstance();
        Two.getInstance();
        System.out.println(ai.get("a").decode("1"));
        System.out.println(ai.get("b").decode("2"));
        System.out.println(ai.get("b").decode("1"));
        System.out.println(ai.get("a").decode("2"));
    }
}
