package sanity;

import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.LoginPageActions;
import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;
import com.sunbird.PageActions.OnBoardingActions;

public class FirstStep3 extends BaseTestConfig {


	@Test
public void BMCPopup() throws InterruptedException
{
		//Thread.sleep(8000);
		//OnBoardingActions.RolePoup();
		//OnBoardingActions.BMCPopup();

String get=UtilityFunctions.generate_Do_id();
System.out.println(get);


String randomName=UtilityFunctions.generateRandomName("Course_");
System.out.println(randomName);


	LoginPageActions.fetchText();

}

}
