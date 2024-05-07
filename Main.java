import java.util.Map;

public class Main {

    public static void main(String[] args) {

        new One();
        new Two();
        System.out.println(AliasCommon.mapAlias.get("a").decode("1"));
        System.out.println(AliasCommon.mapAlias.get("b").decode("2"));
        System.out.println(AliasCommon.mapAlias.get("bb").decode("1"));
        System.out.println(AliasCommon.mapAlias.get("aa").decode("2"));
    }
}
