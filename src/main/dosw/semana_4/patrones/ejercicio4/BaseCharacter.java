package main.dosw.semana_4.patrones.ejercicio4;

public final class BaseCharacter implements Character {

    private final String armor;
    private final String weapon;
    private final String skill;

    public BaseCharacter(String armor, String weapon, String skill) {
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public void attack() {

        System.out.println(
                "Ataque base -> Arma: " + weapon
                        + ", Armadura: " + armor
                        + ", Habilidad: " + skill
        );
    }
}