
package techno;

public class Challenge4 {
	public static	boolean isCatPlaying(boolean summer,int temparature) {
	
		if(summer==true) {
		if(temparature>=25 && temparature<=35) {
			return true;
		}
		else {
			return false;
	}
	}
		else if(temparature>=25 && temparature<=45) {
		return true;
	}
	else {
		return false;
	}			
	}
public static void main(String[] args) {
	
	System.out.println(isCatPlaying(true,44));
	
}
}



