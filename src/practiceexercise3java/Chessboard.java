package practiceexercise3java;

public class Chessboard {
	public static void chess () {
			
			for(int j =0;j<8;j++) {
				
				if(j%2==0) {
					for(int i =0;i<4;i++) {
				System.out.print("WW ");
				System.out.print("BB ");
					}
				}
				else {
					for(int i =0;i<4;i++) {
				System.out.print("BB ");
				System.out.print("WW ");
				
				}
				}
				System.out.println();} 
			}
	} 


