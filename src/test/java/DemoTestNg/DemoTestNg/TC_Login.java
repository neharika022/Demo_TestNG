package DemoTestNg.DemoTestNg;
import org.testng.annotations.Test;
public class TC_Login {
	

	

	

		
		@Test
		public void TC_Login_01() {
			System.out.println("TC_Login_01 Executed");
		}
		
		@Test
		public void TC_Login_02() {
			System.out.println("TC_Login_02 Executed");
		}
		@Test
		public void TC_Login_03() {
			System.out.println("TC_Login_03 Executed");
		}
		@Test
		public void TC_Login_04() {
			System.out.println("TC_Login_04 Executed");
		}
	}

	//include and exclude method
	// when you not given any include or exclude? 4
	// when you include TC_Login_04? 1(TC_Login_04 will run)
	// when you exclude TC_Login_04? 3(TC_Login_04 will be excluded and rest all will run)


