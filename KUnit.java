package kunit1;

import java.util.*;

public class KUnit {
  private static List<String> checks;
  private static float checksMade = 0;
  private static float passedChecks = 0;
  private static float failedChecks = 0;

  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04d: %s", checksMade++, txt));
  }

  public static void checkEquals(float F1, float F2) {
    if (F1 == F2) {
      addToReport(String.format("  %d == %d", F1, F2));
      passedChecks++;
    } else {
      addToReport(String.format("* %d == %d", F1, F2));
      failedChecks++;
    }
  }

  public static void checkNotEquals(float F1, float F2) {
    if (F1 != F2) {
      addToReport(String.format("  %d != %d", F1, F2));
      passedChecks++;
    } else {
      addToReport(String.format("* %d != %d", F1, F2));
      failedChecks++;
    }
  }

  public static void report() {
    System.out.printf("%d checks passed\n", passedChecks);
    System.out.printf("%d checks failed\n", failedChecks);
    System.out.println();
    
    for (String check : checks) {
      System.out.println(check);
    }
  }
}
