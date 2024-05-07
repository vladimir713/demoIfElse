import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class One extends AliasCommon implements AliasInterface {

//    private Set<String> stringSet = new HashSet<>(Arrays.asList("a", "aa"));

    public One(){
        new HashSet<>(Arrays.asList("a", "aa")).stream().forEach(i -> mapAlias.put(i, this));
    }

    @Override
    public String decode(String value) {

        return value + 10;
    }
}
