import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class Two extends AliasCommon implements AliasInterface {

//    private Set<String> stringSet = new HashSet<>(Arrays.asList("b", "bb"));
    public Two(){
        new HashSet<>(Arrays.asList("b", "bb")).stream().forEach(i -> mapAlias.put(i, this));
    }

    @Override
    public String decode(String value) {

        return value + 20;
    }

}
