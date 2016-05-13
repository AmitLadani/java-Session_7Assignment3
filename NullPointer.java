
public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try{
			
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("String s has null value; hense, it will not calculate its Length");
			System.out.println("Above Line is print its only due to NullPointerException");
	}

}
}
