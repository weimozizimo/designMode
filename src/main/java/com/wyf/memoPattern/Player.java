package com.wyf.memoPattern;

public class Player {

    //血量
    private int life = 100;
    //魔法值
    private int magic = 100;

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                ", magic=" + magic +
                '}';
    }

    public void fightBoss() {
        life -= 100;
        magic -= 100;
        if(life<=0){
            System.out.println("game over");
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    //存档
    public  Memeto saveSatate(){
        return  new Memeto(life,magic);
    }

    //回档
    public void restoreState(Memeto memoto){
        this.life = memoto.life;
        this.magic = memoto.magic;
    }
}
