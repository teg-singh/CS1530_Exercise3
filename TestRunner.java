import org.junit.runner.*;
import org.junit.runner.notification.*;

import java.io.File;

public class TestRunner {
  public static void main(String[] args) throws ClassNotFoundException {
    verifyArgs(args);
    Result testResult = JUnitCore.runClasses(Class.forName(args[0]));
    for(Failure f : testResult.getFailures())
      System.out.println(f);
    if(!testResult.wasSuccessful())
      System.out.println(args[0] + ": Not All Tests Passed!");
    else System.out.println(args[0] + ": All Tests Passed!");
  }
  
  private static void verifyArgs(String[] args) {
    if(args.length != 1)
      error("Call with exactly one class file name as an argument.");
    else if(args[0].endsWith(".class"))
      error("Call with the name of a class file, without .class suffix");
    else if(!(new File(args[0] + ".class")).exists())
      error("Call with the name of a class file in the directory");
  }
  
  private static void error(String msg) {
    System.out.println("Error: " + msg);
    System.exit(0);
  }
}