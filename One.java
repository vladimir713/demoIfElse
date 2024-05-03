public final class One extends AliasAbstract {

    private static One INSTANCE;
    private One(){
    }

    @Override
    public String decode(String value) {
        return value + 10;
    }

    public static One getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new One();
            mapAlias.put("a", INSTANCE);
        }
        return INSTANCE;
    }
}
