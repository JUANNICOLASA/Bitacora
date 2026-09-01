package main.dosw.semana_4.patrones.ejercicio4;

public interface CharacterBuilder {

    CharacterBuilder setArmor(String armor);

    CharacterBuilder setWeapon(String weapon);

    CharacterBuilder setSkill(String skill);

    Character build();
}