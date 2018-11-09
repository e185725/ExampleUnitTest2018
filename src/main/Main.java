
package jp.ac.uryukyu.ie.e185725;

/**
 *
 */
public class Main {
    ////////
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 2, 5);
        Enemy enemy = new Enemy("スライム", 10, 2);
        LivingThing lt = new LivingThing();
        lt.getName();


        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        if (lt.getName() == null) {

            while (!hero.isDead() && !enemy.isDead()) {

                turn++;
                System.out.printf("%dターン目開始！\n", turn);
                hero.attack(enemy);
                enemy.attack(hero);
            }
            System.out.println("戦闘終了");
        }
    }
}