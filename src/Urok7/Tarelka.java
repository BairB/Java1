package Urok7;

public class Tarelka {
    private int o;
    public Tarelka(int o){
        this.o = o;
    }
    public void sedeno(int jor) {
        o = o - jor;
    }
    public int obem(){
        return o;
    }
    public void dobavka(){
        o = o + 10;
    }
}
