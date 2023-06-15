package 網請ん;

class celler
{
	String number;
	String name;
	String address;
	public celler(String number,String name)
	{
		this.number=number;
		this.name=name;
	}
	void safety()
	{
		address="Ensure Safety";
		System.out.println("網請瘍鎢ㄩ"+number+"\n俷靡ㄩ"+name+"\n華硊峈ㄩ"+address);
	}
	void hospital()
	{
		address="hospital";
		System.out.println("網請瘍鎢ㄩ"+number+"\n俷靡ㄩ"+name+"\n華硊峈ㄩ"+address);
	}
	void restaurant()
	{
		address="restaurant";
		System.out.println("網請瘍鎢ㄩ"+number+"\n俷靡ㄩ"+name+"\n華硊峈ㄩ"+address);
	}
}

public class call {
	public static void main(String[] args)
	{
		celler m1=new celler("00001","jack");
		celler m2=new celler("00002","alice");
		m1.hospital();
		m2.restaurant();
	}
}
