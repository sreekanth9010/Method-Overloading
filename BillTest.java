package methodOverloading;

class Bill
{
	public double findPrice(int itemId)
	{
		double price = 0;
		if(itemId==1001)
		{
			price=25;
		}
		else if(itemId==1002)
		{
			price = 20;
		}
		else if(itemId==1003)
		{
			price = 23;
		}
		else if(itemId==1004)
		{
			price = 18;
		}
		else
		{
			System.out.println("invalid item no");
		}
		return price;
	}
	public double findPrice(String brandName,String itemType ,int size)
	{
		double price=0;
		
		if(brandName=="Puma" && itemType=="T-shirt" )
		{
			if(size==34 || size==36)
			{
				price =	25;	
			}
			else
			{
				System.out.println("invalid size");
			}
		
		}
		else if(brandName=="Puma" && itemType=="Skirt" )
		{
			if(size==38 || size==40)
			{
				price =	20;	
			}
			else
			{
				System.out.println("invalid size");
			}
		
		}
		else if(brandName=="Reebook" && itemType=="Skirt" )
		{
			if(size==38 || size==40)
			{
				price =	18;	
			}
			else
			{
				System.out.println("invalid size");
			}
		
		}
		
		else if(brandName=="Reebook" && itemType=="T-shirt" )
		{
			if(size==34 || size==36)
			{
				price =	23;	
			}
			else
			{
				System.out.println("invalid size");
				
			}
		
		}
		return price;
	}
}

public class BillTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
		System.out.println(bill.findPrice(1001));
		System.out.println(bill.findPrice("Reebook", "T-shirt", 34));

	}

}
