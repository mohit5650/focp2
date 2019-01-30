class box{
	double width,w;
	double height,h;
	double depth,d;

box(){
	System.out.print("Construction box");
	width=-1;
	height=-1;
	depth=-1;
}	
box(double w,double h,double d) {
	width=w;
	height=h;
	depth=d;
}
box(double ln){
	width=ln;
	height=ln;
	depth=ln; }
	double volume(){
 return width*height*depth;
 }
  }
 class boxdemocubeC{
 public static void main(String args[])
   {
    double vol;
    box b1=new box();
    vol=b1.volume();
    System.out.println("volume is:"+vol);
    box b2=new box(3,6,9);
    vol=b2.volume();
    System.out.print("volume is"+vol);
    box mycube=new box(8);
    vol=mycube.volume();
    System.out.print("volume of mycube is "+vol);
   }
 }