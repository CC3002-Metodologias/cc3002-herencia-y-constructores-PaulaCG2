public class Estudiante extends Persona  {

    protected String nombre;
    protected String edad;
    protected int ocupacion;
    protected String paper;

    public Estudiante (String nombre, String edad, int ocupacion ){

        super(nombre, edad, ocupacion);
    }

    @Override
    public void comer() {
        System.out.println("completos de Gorbea");
    }

    @Override
    public void dormir() {
        System.out.println("6 horas");
    }

    @Override
    public String hacerLoSuyo() {
        return "Ver Anime y Netflix";
    }
}
