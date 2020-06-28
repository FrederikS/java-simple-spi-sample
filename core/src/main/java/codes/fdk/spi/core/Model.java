package codes.fdk.spi.core;

public class Model {

    private String foo;
    private String bar;

    public Model() {}

    public Model(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    @Override
    public String toString() {
        return "Model [bar=" + bar + ", foo=" + foo + "]";
    }

}
