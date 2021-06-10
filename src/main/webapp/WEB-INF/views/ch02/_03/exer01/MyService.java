package exer01;

public class MyService  {
	
	public void process() {
		MyDao dao = new MyDao();
		dao.accessDatabase(); 
	}
}
