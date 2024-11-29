package bankSystem;

public interface Authenticate {
	public boolean login(int id, int password);
	public void register(String [] userData);
}

