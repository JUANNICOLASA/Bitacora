package main.dosw.semana_2.pokemon;
import java.util.Objects;
public class Pokemon {
    private Long id; private String nombre; private String tipo; private int nivel;
    private double poderCombate; private String region; private boolean legendario; private boolean puedeEvolucionar;
    public Pokemon(Long id, String nombre, String tipo, int nivel, double poderCombate, String region, boolean legendario, boolean puedeEvolucionar) {
        this.id = id; this.nombre = nombre; this.tipo = tipo; this.nivel = nivel; this.poderCombate = poderCombate; this.region = region; this.legendario = legendario; this.puedeEvolucionar = puedeEvolucionar;
    }
    public String getNombre() { return nombre; } public String getTipo() { return tipo; } public int getNivel() { return nivel; }
    public double getPoderCombate() { return poderCombate; } public String getRegion() { return region; }
    public boolean isLegendario() { return legendario; } public boolean isPuedeEvolucionar() { return puedeEvolucionar; }
    @Override public boolean equals(Object o) { if (this == o) return true; if (o == null || getClass() != o.getClass()) return false; Pokemon pokemon = (Pokemon) o; return Objects.equals(nombre, pokemon.nombre); }
    @Override public int hashCode() { return Objects.hash(nombre); }
}