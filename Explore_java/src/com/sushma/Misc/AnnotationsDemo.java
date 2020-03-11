package com.sushma.Misc;
@SuppressWarnings("unused")
public class AnnotationsDemo extends info {
	
public static void main(String[] args) {
	
	int k;
	int kl;
	info i=new info();
	i.personalinfo();
	i.officialinfo();
}
}
class data implements inter
{

	@Override
	public void add(int k, int h) {
      		
	}
	
}
interface inter
{
	void add(int k,int h);
}
class info{
	/**
	 * This method will be deleted 8.9 version ,
	 * use personal() method instead of this method
	 */
	@Deprecated
	
	void personalinfo()
	{
		System.out.println("info.personalinfo()");
	}
	void officialinfo()
	{
		System.out.println("info.officialinfo()");
	}
	void personal()
	{
		
	}
	
}