
public class Practicefor {

	public static void main(String[] args) {
		//for(int i=10;i>=1;i--){
      //      System.out.println(+i);
      //  }
		
		//int i=1;
	//	while(i<=10) {
	//		System.out.println(i);
		//	i++;
		//}
		
//		int n=2;
//		int count=0;
//		for(int i=3;i<n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}if(count>0) {
//			System.out.println("no is not prime");
//		}else {
//			System.out.println("no is prime");
//		}
		//int n=4;int count=0;
	
//			if(n%2==0) {
//				System.out.println("given no is even");
//			}else {
//				System.out.println("odd no");
//			}
		//even and odd no upto100
//	  int count=0;
//		for(int i=1;i<=100;i++) {
//		if(i%2==0) {
//			System.out.print(i+"'");
//		}
//	}System.out.println();
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				System.out.print(i+"'");
//			}
//		}
		// prime no upto 100
	int j;
		for(int i=1;i<=100;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0) 
					break;
				
			}if(i==j){
				System.out.println(j);
			}
				
		}
	}
	}

