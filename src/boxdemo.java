import java.util.*;
class box{
	double width,w;
	double height,h;
	double depth,d;

	void setdim()
	{
	w=width;
	h=height;
	d=depth;
	}
  double volume()
  {
  return w*h*d;
  }
}
class boxdemo
{
	public static void main(String args[])
	{
	double vol;
	Scanner input=new Scanner(System.in);
	box b1=new box();
	box b2=new box();
	System.out.print("enter the value for box 1: ");
	b1.width=input.nextInt();
	b1.height=input.nextInt();
	b1.depth=input.nextInt();
	b1.setdim();
	vol= b1.volume();
	System.out.print("volume is :" +vol);
	}
}