
package ss;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	
 public void compose()
 {
		Reporter.log("compsoe",true);
 }
	
	@Test(dependsOnMethods = "compose")
	
	 public void sentItems()
	 {
			Reporter.log("sentitems",true);
		
	 }
	@Test(dependsOnMethods = "sentItems")
	
	 public void trash()
	 {
			Reporter.log("trash",true);
		
	 }
}


