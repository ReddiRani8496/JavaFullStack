public class MatchZipCodes {
  public static void main(String args[]) {
    isZipValid("45643-4443");
    isZipValid("45643");
    isZipValid("443");
    isZipValid("45643-44435");
    isZipValid("45643 44435");
  }

  public static boolean isZipValid(String zip) {
    boolean retval = false;
    String zipCodePattern = "\\d{5}(-\\d{4})?";
    retval = zip.matches(zipCodePattern);

    String msg = "NO MATCH: pattern:" + zip + "\r\n             regex: "
        + zipCodePattern;

    if (retval) {
      msg = "MATCH   : pattern:" + zip + "\r\n             regex: "
          + zipCodePattern;
    }

    System.out.println(msg + "\r\n");
    return retval;
  }
}
