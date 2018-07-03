package Stack;

public class Stack {

	public	String[] yigin;
	private int index = 0;

	public Stack() {
		super();
		this.yigin = new String[10];
	}

	public String pop() throws Exception {
		String popValue;
		if (index > 0) {
			index--;
			popValue = yigin[index];
		} else {
			throw new Exception("Stack under flow");
		}
		return popValue;
	}

	public void push(String data) throws Exception {
		if (index < yigin.length) {
			yigin[index] = data;
			index++;
		} else {
			throw new Exception("Stack over flow");
		}
	}
	
	public int getStackLength() {
		return index;
	}

}
