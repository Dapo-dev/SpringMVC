package exer01.anno.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao implements IDao {
	@Override
	public void accessDatabase() {
		System.out.println("MyDao#accessDatabase()正在執行...");
	}
}
