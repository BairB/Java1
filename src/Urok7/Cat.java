package Urok7;

public class Cat {
    private String name;
    private int jor;
    private boolean sytost = false;

    public Cat(String name, int jor){
        this.name = name;
        this.jor = jor;
        this.sytost = false;
    }

    public boolean eat(Tarelka tarelka) {
        if(sytost == false && tarelka.getO() >= jor) {
            tarelka.sedeno(jor);
            return sytost = true;
        }
        else {
            return sytost = false;
        }
    }
}
