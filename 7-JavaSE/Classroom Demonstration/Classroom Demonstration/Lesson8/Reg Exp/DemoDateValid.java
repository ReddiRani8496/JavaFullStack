
public boolean isValidDate(String date)
{
   // set date format, this can be changed to whatever format
   // you want, MM-dd-yyyy, MM.dd.yyyy, dd.MM.yyyy etc.
   
   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
   
   // declare and initialize testDate variable, this is what will hold
   // our converted string
   
   Date testDate = null;

   // we will now try to parse the string into date form
   try
   {
     testDate = sdf.parse(date);
   }

   // if the format of the string provided doesn't match the format we 
   // declared in SimpleDateFormat() we will get an exception

   catch (ParseException e)
   {
     errorMessage = "the date you provided is in an invalid date" +
                             " format.";
     return false;
   }

   // dateformat.parse will accept any date as long as it's in the format
   // you defined, it simply rolls dates over, for example, december 32 
   // becomes jan 1 and december 0 becomes november 30
   // This statement will make sure that once the string 
   // has been checked for proper formatting that the date is still the 
   // date that was entered, if it's not, we assume that the date is invalid

   if (!sdf.format(testDate).equals(date)) 
   {
     errorMessage = "The date that you provided is invalid.";
     return false;
   }
   
   // if we make it to here without getting an error it is assumed that
   // the date was a valid one and that it's in the proper format

   return true;

} // end isValidDate