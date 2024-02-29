public class Medic extends Hero{

    double healPoints = 40;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность SUPER HEAL!");
    }

    public void increaseExperience(){
        healPoints *= (1 + 10.0 / 100);
        System.out.println("Опыт лечения героя Medic увеличено на 10%");
    }
}
