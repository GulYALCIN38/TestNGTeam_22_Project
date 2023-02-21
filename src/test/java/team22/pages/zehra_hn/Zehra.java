package team22.pages.zehra_hn;

import team22.utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Zehra {
    public static void uploadFilePath(String filePath){
        try{
            ReusableMethods.waitFor(3);
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
            Robot robot = new Robot();
            //pressing ctrl+v
            robot.keyPress(KeyEvent.VK_CONTROL);
            ReusableMethods.waitFor(3);
            robot.keyPress(KeyEvent.VK_V);
            ReusableMethods.waitFor(3);
            //releasing ctrl+v
            robot.keyRelease(KeyEvent.VK_CONTROL);
            ReusableMethods.waitFor(3);
            robot.keyRelease(KeyEvent.VK_V);
            ReusableMethods.waitFor(3);
            System.out.println("PASSED");
            //pressing enter
            ReusableMethods.waitFor(3);
            robot.keyPress(KeyEvent.VK_ENTER);
            ReusableMethods.waitFor(3);
            //releasing enter
            robot.keyRelease(KeyEvent.VK_ENTER);
            ReusableMethods.waitFor(3);
            System.out.println("ENTER");
        }catch (Exception e){
        }
    }
}
