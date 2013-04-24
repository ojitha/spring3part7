package au.com.ojitha.blogspot.spring3.part7;

public interface StateDAO<State> extends DAO<State, String> {
	public State getStateCode(String state);
}
