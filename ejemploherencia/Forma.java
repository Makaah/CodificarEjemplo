package ejemploherencia;

public class Forma {
	protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    public Forma(int x, int y, int ancho, int alto) {
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;
    }
}

public void mostrar(){
    System.out.println("posición    : x="+x+", y="+y);
    System.out.println("dimensiones : w="+ancho+", h="+alto);
}

public class FormaEntrada extends Forma{
    protected String entrada;
    public FormaEntrada(int x, int y, int w, int h, String nombre) {
        super(x, y, w, h);//llama al constructor de la clase base 
        entrada=nombre;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("entrada : "+entrada);
    }
}
 
public class FormaSalida extends Forma{
	protected String salida;
	public FormaSalida(int x, int y, int w, int h, String nombre) {
		super(x, y, w, h);
		salida=nombre;
	}
	puclic void mostrar(){
		super.mostrar();
		System.out.println("salida : "+salida);
	}
}