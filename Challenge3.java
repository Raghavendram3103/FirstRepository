package techno;

public class Challenge3 {

	
	public static void printEqual(int x,int y,int z) {
		
		if(x<0 ||y<0 ||z<0) {
			System.out.println("Invalid value");
		}
		else if(x==y && y==z) {
			System.out.println("All numbers are equal");
		}
		
	else if(x==y && y!=z) {
		System.out.println("All num are diffrent");
	}
		else {
			System.out.println("Neither all are Equal or diff");
		}
			
	}
	public static void main(String[] args) {
		printEqual(45,55,78);
		printEqual(45,45,-99);
		printEqual(45,45,5);
	}
}

