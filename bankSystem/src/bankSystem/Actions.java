package bankSystem;

public class Actions extends Setting{
	
	Actions(){
		
	}
	public boolean withDraw(int amount) {
		return false;
	}
	public boolean deposit(int amount) {
		return false;
	}
	public boolean transfer(int account, int amount) {
		return false;
	}
	public int balance() {
		return 1;
	}

}
