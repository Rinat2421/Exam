package kg.geeks.game.players;

public class Medic extends Hero {

    int healthPoints=23;

    public Medic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HEAL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()<100 && heroes[i].getName()!=this.getName()){
                heroes[i].setHealth(heroes[i].getHealth()+healthPoints);
                System.out.println("Medic "+this.getName()+" heal hero: "+heroes[i].getName()+" by "+this.healthPoints+" health points");
                break;
            }
        }
    }
}
