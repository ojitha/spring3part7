package au.com.ojitha.blogspot.spring3.part7;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class StateDAOImplTest {

	@Autowired
	StateDAO stateDao;
	
	@Test
	public void testFindAll() {
		assertEquals(2, this.stateDao.findAll().size());

	}

}
