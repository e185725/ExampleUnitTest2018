
package jp.ac.uryukyu.ie.e185725;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super.setName(name);
        super.getName();
        super.setHitPoint(maximumHP);
        super.getHitPoint();
        super.setAttack(attack);
        super.getAttack();
        super.setDead(false);
        super.getDead();



        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
        public void wounded(int damege){

        super.wounded(damege);


        if (super.getHitPoint() < 0) {
            System.out.println(super.getName()+"モンスター%sは倒れた。");
        }

    }



}