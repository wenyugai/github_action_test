import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import github_action_test.TestAction;

public class TestAdd {
	
	@Test
	void testAdd() {
		assertEquals(1,TestAction.add(0,1));
	}
	
}
