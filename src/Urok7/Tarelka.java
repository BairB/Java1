package Urok7;

public class Tarelka {
    protected int o, v;
    public Tarelka(int o, int v){
        this.o = o;
        this.v = v;
    }
    public void sedeno(int jor) {
        o = o - jor;
    }
    public int getO(){
        return o;
    }
    public int getV(){
        return v;
    }
    public void dobavka(int o){
        if(o > v) this.o = o;
        else this.o = o + 10;
    }
}
