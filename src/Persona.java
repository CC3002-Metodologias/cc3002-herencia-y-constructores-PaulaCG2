public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String n, String o, int e){
        this.nombre = n;
        this.ocupacion = o;
        this.edad = e;
    }
    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("8 horas");
    }

    public String hacerLoSuyo() {
        return "CUARENTENA";
    }


}
