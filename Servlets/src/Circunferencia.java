/* 
* Circunferencia.java
*/

//comentado para evitar error en tiempo de ejecución paquete y clase no encontrado
//package capitulo3;

public class Circunferencia
{
	/* Radio */
	private double radio;
	
	/* Posición del centro de la circunferencia */
	private int x,y;
	
	/* Hueco o lleno */
	private boolean hueco;
	
	/* Constructor sin parámetros */
	public Circunferencia()
	{
		super();
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setRadio(double r)
	{
		this.radio = r;
	}
	
	public double getArea()
	{
		return (Math.PI * radio * radio);
	}
	
	public boolean isHueco()
	{
		return this.hueco;
	}
	
	/* Para establecer el área nueva y ser consistentes debemos modificar el radio
	 * @param el área nueva que queremos para la circunferencia
	 */
	public void setArea(double area)
	{
		radio = Math.sqrt(area/Math.PI);
	}
}