package day3;

public class Exam8 {

	public static void main(String[] args) {
		/*
		******
		******
		******
		******
		******
		******
		*/
		int i = 0, j = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		*
		**
		***
		****
		*****
		******
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		     * i=1 ��=5 *=1
		    ** i=2 ��=4 *=2
		   *** i=3 ��=3 *=3
		  **** i=4 ��=2 *=4
		 ***** i=5 ��=1 *=5
		****** i=6 ��=0 *=6
		                    ��=6-i *=i
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		     * 		i=1 ��=5 *=1
		    *** 	i=2 ��=4 *=3
		   ***** 	i=3 ��=3 *=5
		  ******* 	i=4 ��=2 *=7
		 ********* 	i=5 ��=1 *=9
		***********	i=6 ��=0 *=11
		                             ��=6-i *=2*i-1  
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		     * 			i=1 ��*=0
		    ** * 		i=2 ��*=1
		   *** ** 		i=3 ��*=2
		  **** *** 		i=4 ��*=3
		 ***** **** 	i=5 ��*=4
		****** *****	i=6 ��*=5
		                                     ��*=i-1           
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		******	i=1 *=6
		*****	i=2 *=5
		****	i=3 *=4
		***		i=4 *=3
		**		i=5 *=2
		*		i=6 *=1
		            *=7-i=6+1-i=num+1-i
		*/
		int num = 6;
		for(i=1; i<=num; i++){
			for(j=1; j<=num+1-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		****** i=1 ��=0 *=6
		 ***** i=2 ��=1 *=5
		  **** i=3 ��=2 *=4
		   *** i=4 ��=3 *=3
		    ** i=5 ��=4 *=2
		     * i=6 ��=5 *=1
				   ��=i-1 *=7-i=6+1-i=num+1-i
	     */
		for(i=1; i<=num; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=1; j<=num+1-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}







