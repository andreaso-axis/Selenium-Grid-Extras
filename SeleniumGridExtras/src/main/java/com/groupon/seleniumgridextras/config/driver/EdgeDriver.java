package com.groupon.seleniumgridextras.config.driver;
import java.io.File; 

public class EdgeDriver  extends DriverInfo {
    @Override
    public String getExecutablePath() {
      String new_path = "C:\\windows\\syswow64\\" + getExecutableName(); 
      String old_path = "C:\\Program Files (x86)\\Microsoft Web Driver\\" + getExecutableName();

      File testFile = new File(new_path);
      boolean exists = testFile.exists();
      if(exists) {
	return new_path;
      }
        return old_path;
    }

    @Override
    public String getExecutableName() {
        return "MicrosoftWebDriver.exe";
    }
}
