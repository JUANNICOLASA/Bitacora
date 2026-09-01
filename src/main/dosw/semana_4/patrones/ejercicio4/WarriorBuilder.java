package main.dosw.semana_4.patrones.ejercicio4;

public class WarriorBuilder implements CharacterBuilder {

    private String armor;
    private String weapon;
    private String skill;

    @Override
    public WarriorBuilder setArmor(String armor) {

        if (armor == null || armor.isBlank()) {
            throw new IllegalArgumentException(
                    "La armadura no puede estar vacía."
            );
        }

        this.armor = armor;
        return this;
    }

    @Override
    public WarriorBuilder setWeapon(String weapon) {

        if (weapon == null || weapon.isBlank()) {
            throw new IllegalArgumentException(
                    "El arma no puede estar vacía."
            );
        }

        this.weapon = weapon;
        return this;
    }

    @Override
    public WarriorBuilder setSkill(String skill) {

        if (skill == null || skill.isBlank()) {
            throw new IllegalArgumentException(
                    "La habilidad no puede estar vacía."
            );
        }

        this.skill = skill;
        return this;
    }

    @Override
    public Character build() {

        if (armor == null) {
            throw new IllegalStateException(
                    "El personaje necesita una armadura."
            );
        }

        if (weapon == null) {
            throw new IllegalStateException(
                    "El personaje necesita un arma."
            );
        }

        if (skill == null) {
            throw new IllegalStateException(
                    "El personaje necesita una habilidad."
            );
        }

        return new BaseCharacter(
                armor,
                weapon,
                skill
        );
    }
}