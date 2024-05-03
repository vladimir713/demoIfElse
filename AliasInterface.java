import java.util.HashMap;
import java.util.Map;

public interface AliasInterface {

    Map<String, AliasInterface> getMapAlias();
    String decode(String value);
}
