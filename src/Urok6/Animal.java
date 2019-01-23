package Urok6;

public abstract class Animal implements IAnimal {
    protected int l_run;
    protected int l_jump;
    protected int l_swim;

    public Animal(int r, int j, int s){
        this.l_run = r;
        this.l_jump = j;
        this.l_swim = s;
    }
    @Override
    public boolean run(int x) {
        return x <= l_run;
    }

    @Override
    public boolean swim(int x) {
        return x <= l_swim;
    }

    @Override
    public boolean jump(int x) {
        return x <= l_jump;
    }
}
