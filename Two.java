public final class Two extends AliasAbstract {

    private static Two INSTANCE;

    private Two(){
    }

    @Override
    public String decode(String value) {
        return value + 20;
    }

    public static Two getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Two();
            mapAlias.put("b", INSTANCE);
        }
        return INSTANCE;
    }
}
