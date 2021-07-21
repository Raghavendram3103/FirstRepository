package techno;

public class Challenge2 {

	
	public static double area_R(double x,double y) {
		
		if(x>=0 && y>=0) {
			double b=x*y;
		System.out.println("area of Reactangle"+b);
		}else
			return area_R(x, y);
		return -1.0;
		
	}
public static  void area(double radius) {
		
		if(radius>=0) {
			double a=3.141*radius*radius;
			System.out.println("area of circle"+a);
		
		}else
			
		
		//return radius;
		System.out.println(-1.0);
		
	}
	
	public static void main(String[] args) {
		area(-55.55);
		area_R(-55.55,65.22);
		
	}
}
