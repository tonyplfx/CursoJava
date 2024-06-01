public class primitiveTypes {
    public static void main (String[] args){
        // -128 to 127
        byte myByte = 12;

        // -32,758 ti 32,767 - Never Use really
        short myShort = 1234;

        // -2,147,483,648 to 2,147,483,647
        int myInt = 2837;

        // -9,23,372,036,854,775,808 to -9,23,372,036,854,775,807
        long myLong = 28371231231l;

        // about 6 decimal digits, the cast (f) can be in capital letter or in lower case
        /* You can also write the complete word:
        float myFloat = (float) 6.3;  */
        float myFloat = 6.3f;

        //about 15 decimal digits
        double myDouble = 45.213434;

        // true or false
        boolean myBoolean = false;
        boolean moreThan1000 = (myInt > 1000);

        //one character
        char myChar = 'W';
        String myString = "Hello";



    }
}