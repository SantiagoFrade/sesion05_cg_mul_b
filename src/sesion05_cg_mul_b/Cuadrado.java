package sesion05_cg_mul_b;

public class Cuadrado 
{
    private Coordenada c;
    private int lado;
    public Cuadrado()
    {
        
    }
    public Cuadrado(Coordenada c, int lado)
    {
        this.c=c;
        this.lado=lado;
    }
    public void crearCuadrado()
    {
        int linea1 = c.getX()+lado;
        int linea2 = c.getY()+lado;
    }
    public void Traslacion(int x, int y)
    {
        
    }
    public void Escalado()
    {
    
    }
    public void Rotacion()
    {
        
    }
    
}
