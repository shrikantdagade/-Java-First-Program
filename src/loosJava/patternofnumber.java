package loosJava;

public class patternofnumber {

	public static void main(String[] args) {
     int n=5;
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(j+" ");
    	 }
    	 System.out.println();
     }
     System.out.println("...........");
     
     for(int i=n;i>=1;i--) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(j+" ");
    	 }
    	 System.out.println();
     }
     System.out.println("...........");

     for(int i=0;i<=n;i++) {
    	 for (int j=0;j<=i;j++) {
    		 System.out.print(" "+(char)(65+i));
    	 }
    	 System.out.println();
     }
     System.out.println(".......................");
     int k=1;
     for (int i=1;i<=4;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(k+" ");
    		 k++;
    	 }
    	 System.out.println();
     }
	}
	

}
