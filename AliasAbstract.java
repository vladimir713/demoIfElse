import java.util.HashMap;
import java.util.Map;

public abstract class AliasAbstract implements AliasInterface {

    public static Map<String, AliasInterface> mapAlias = new HashMap<>();

    @Override
    public Map<String, AliasInterface> getMapAlias() {
        return mapAlias;
    }
}
