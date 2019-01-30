class ExceptionTest{
	public static void main(String args[]){
	String s=null;
	try{
	if(s==null){
	throw new Exception("u have entered null string");
	}
	else{
	System.out.println("the entered string is:"+s);
	}}
	catch(Exception e){
	System.out.println(e);
	}
	finally{
	System.out.print("the program executed sucessfully");
	}
	}
	
}