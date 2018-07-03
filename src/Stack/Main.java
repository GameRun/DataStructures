package Stack;

public class Main {

	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		try {
			stack.push("Meltem");
			stack.push("Utku");
			stack.push("Mahmut");
			stack.push("Macbook");
			int stackLength = stack.getStackLength();
			
			
			for (int i = 0; i < stackLength; i++) {
				System.out.println(stack.getStackLength());
				System.out.println(stack.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
