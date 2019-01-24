package Urok7;

public class Cat {
    private String name;
    private int jor;
    private boolean sytost = false;
    public Cat(String name, int jor){
        this.name = name;
        this.jor = jor;
    }
    public boolean eat(Tarelka tarelka) {
        if(tarelka.obem() >= jor) {
            tarelka.sedeno(jor);
            return sytost = true;
        }
        else {
            return sytost = false;
        }
    }
}
