public class Academico extends Persona{
    protected String nombre;
    protected String edad;
    protected int ocupacion;
    protected String paper;

    public Academico (String nombre, String edad, int ocupacion , String paper){

        super(nombre, edad, ocupacion);
        this.paper = paper;
    }

    @Override
    public void comer() {
        System.out.println("comida de Casa");
    }

    @Override
    public void dormir() {
        System.out.println("7 horas");
    }

    @Override
    public String hacerLoSuyo() {
        return "Aprender a usar zoom ";
    }

    public String publicarPaper(){return paper; }
}
