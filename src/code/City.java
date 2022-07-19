package code;
                                                        
public class City {
	String name;
	long population;
	static String village ="sasani";
	static short s=10000;
	void display()
	{
		System.out.println("city name:"+name);
		System.out.println("population:"+population);
	}
	public static void main(String[] args) {
City metro1,metro2 ;
metro1=new City();
metro2=new City();
metro1.name="MUMBAI";
metro1.population=100000;
metro1.village="pune";
System.out.println("Details of meytro city 1:");
System.out.println(metro1.name);
System.out.println(village );
System.out.println(s);
metro1.display();
metro2.name="delhi";
metro2.population=500000;
System.out.println("Details of meytro city 2:");
System.out.println(metro2.name);
metro2.display();
}

}
