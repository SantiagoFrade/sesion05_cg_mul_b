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
        int punto1 = c.getX()+lado;
        int punto2 = c.getY()+lado;
        //int punto3= c.getX()+
    }
    public void Traslacion(int x, int y)
    {
        
    }
    public void Escalado(int s)
    {
       lado= (int)(lado * (1+s/100.0f)); 
    }
    public void Rotacion()
    {
        
    }
    
}
