public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heroes = new HavingSuperAbility[]{new Warrior(), new Magic(), new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Medic){
                Medic medic = (Medic) heroes[i];
                System.out.println("Лечение медика равно " + medic.healPoints);
            ((Medic) heroes[i]).increaseExperience();
                System.out.println("Теперь герой Medic лечит на " + (int) medic.healPoints);
            }
            heroes[i].applySuperAbility();
        }


    }
}