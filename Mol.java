class  Flipkart
{
	void order (int qty)
	{
		System.out.println("Order by qty");
	}
	void order (String prd_name)
	{
		System.out.println("Order by prd_name");
	}
	void order (int qty,String prd_name)
	{
		System.out.println("Order by qty,prd_name");
	}
	void order (String prd_name,int qty)
	{
		System.out.println("Order by prd_name,qty");
	}
}
class Mol
{
	public static void main(String[] args) 
	{
		Flipkart f1=new Flipkart();
			f1.order(5);
			f1.order("t-shirt");
			f1.order(5,"t-shirt");
			f1.order("t-shirt",5);
	}
}
