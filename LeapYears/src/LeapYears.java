public class LeapYears {
  public static boolean isLeapYear(int year) {
    if (year % 100 == 0 && year % 400 != 0) {
      return false;
    } else {
      return (year % 4 == 0) ? true : false;
    }
  }
}
