package abc.org;

public class Compoly extends poly {

	public static void main(String args[])
	{
		Compoly a= new Compoly();
		double t=a.area(7.1);
		System.out.println(t);
		System.out.println(a.area(4, 5));
		System.out.println(a.area(4));
	}
}
class poly{
public int area(int i, int j)
{
	return i*j;
	
	}
public double area(double i)
{
	return i*i*(3.14);
	}

public int area (int i)
{
	int j= i*i;
	return j;
}
}
