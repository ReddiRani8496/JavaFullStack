public class DateValid
{

public boolean isValidDate(String date)
{
   
   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
   
   
   Date testDate = null;

   // we will now try to parse the string into date form
   try
   {
     testDate = sdf.parse(date);
   }


   catch (ParseException e)
   {
     errorMessage = "the date you provided is in an invalid date" +
                             " format.";
     return false;
   }

   
   if (!sdf.format(testDate).equals(date)) 
   {
     errorMessage = "The date that you provided is invalid.";
     return false;
   }
   
   
   return true;

} 
}