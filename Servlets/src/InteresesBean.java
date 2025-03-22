/**
 * InteresesBean.java
 * Para calcular la ganancia obtenida en un plazo fijo.
 */
//package capitulo3; //comentado para evitar error en tiempo de ejecución paquete y clase con encontrados

public class InteresesBean
{
	private double inversion;
	
	private int meses;
	
	private double tasa;
	
	/** Constructor por defecto */
	public InteresesBean()
	{
		this.inversion = 100000.0;
		this.meses = 12;
		this.tasa = 0.05;
	}
	
	public void setInversion(double inversion)
	{
		this.inversion = inversion;
	}
	
	public void setMeses(int meses)
	{
		this.meses = meses;
	}
	
	public void setTasa(double tasa)
	{
		this.tasa = tasa;
	}
	
	public double getInversion()
	{
		return this.inversion;
	}
	
	public int getMeses()
	{
		return this.meses;
	}
	
	public double getTasa()
	{
		return this.tasa;
	}
	
	public double getGanancias()
	{
		return inversion * (tasa / 100.0) * (meses / 12.0);
	}
}
