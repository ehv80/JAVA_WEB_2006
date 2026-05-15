//package Vista.WEB-INF.src;

public class Persona {
    private List mascotas;

    public Mascota getMascota(int pos) {
        return (Mascota) mascotas.get(pos);
    }

    public void setMascota(Mascota m, int pos) {
        mascotas.set(pos, m);
    }
}
