package finalclass;

 class Bike {
     
	  final int speedlimit;
	       Bike(int a){
		  this.speedlimit=a;
		  System.out.println(speedlimit+"kmperhr ");
	  }
	  
	  
	  
	  public final void run() {
		//speedlimit=400;
		System.out.println("running bike");
		System.out.println(speedlimit+"kmperhr ");
	}
	  
	public static void main(String[] args) {
	 
		Bike obj=new Bike(101);
		obj.run();
	}

}
