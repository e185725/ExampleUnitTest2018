package jp.ac.uryukyu.ie.e185725;

public class LivingThing {
    String name ;
    int hitPoint;
    int attack;
    boolean dead;
    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name ;

    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param
     */
    public void attack(LivingThing opponent){
        if (hitPoint > 0) {
            int damage = (int) (Math.random() * attack);
            System.out.println(name+"の残りHPは"+hitPoint+"です" );
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
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}

