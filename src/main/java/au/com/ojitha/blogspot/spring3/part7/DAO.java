package au.com.ojitha.blogspot.spring3.part7;

import java.io.Serializable;
import java.util.List;

public interface DAO<T, K extends Serializable> {

	//CURD operations
	K create (T instance);
	void update(T t);
	T findByPrimaryKey(K id);
	List<T> findAll();
	void delete(T t);

}
