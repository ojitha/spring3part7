package au.com.ojitha.blogspot.spring3.part7;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();
		StateDAO<State> stateDAO = ctx.getBean("stateDAO", StateDAO.class);
		List<State> states =stateDAO.findAll();
		for (State state : states) {
			System.out.println("code: "+state.getCode()+ ", State: "+state.getState());
		}

	}

}
