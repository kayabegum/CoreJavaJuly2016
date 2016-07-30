package inheritence;

public class Family {

	
	public static void main(String[] args){
		Grandmother LG =new Daughter();
		LG.eyecolor();
		LG.skinColor();
	
		Daughter D= new Daughter();
		D.hight(6);
		
		
		Grandmother M= new Mother();
		M.eyecolor();
		M.skinColor();
		
		Mother MM= new Mother();
		MM.hight(5);
		
		Grandmother GM= new Grandmother();
		GM.eyecolor();
	}
	
	
}
