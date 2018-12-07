package jp.ac.uryukyu.ie.e185725;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    public String getName(){
        return name ;

    }

    public void setName(String name){
        this.name = name;
    }
    public int getHitPoint(){
        return  hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }

    public boolean getDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isDead() {
        return dead;
    }



    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param
     */
    public void attack(LivingThing opponent){
        if (hitPoint > 0) {
            int damage = (int) (Math.random() * attack);
            //System.out.println(name+"の残りHPは"+hitPoint+"です" );
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);

            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;

        }
    }

}

