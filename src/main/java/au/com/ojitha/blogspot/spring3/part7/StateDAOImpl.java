package au.com.ojitha.blogspot.spring3.part7;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

@Repository("stateDAO")
public class StateDAOImpl implements StateDAO<State> {

	private DataSource datasource;
	
	
	public DataSource getDatasource() {
		return datasource;
	}

	@Resource(name="dataSource")
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public String create(State instance) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(State t) {
		// TODO Auto-generated method stub
		
	}

	public State findByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> findAll() {
		
		return (new SelectAll()).execute();
	}
	
	public void delete(State t) {
		// TODO Auto-generated method stub
		
	}

	public State getStateCode(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	private class SelectAll extends MappingSqlQuery<State>{

		SelectAll(){
			super(datasource, "SELECT CODE, STATE FROM STATE");
		}
		
		@Override
		protected State mapRow(ResultSet rs, int rowNum) throws SQLException {
			State state = new State();
			state.setCode(rs.getString("code"));
			state.setState(rs.getString("state"));
			return state;
		}
		
	}
}
