
/**
 * Write a description of class PasswordStrength here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PasswordStrength
{
    public static String iteration1( String password )
    {
        /*
         * a verifies password length
         * b verifies inclusion of a letter
         * c verifies inclusion of a number
         */
        
        boolean a = password.length() >= 8 , b = false , c = false;
        char [ ] passCharacters = password.toCharArray( );
        
        for( int t = 0 ; t < passCharacters.length ; t=t+1 )
        {
            if( (passCharacters[t] >= 65 && passCharacters[t] <= 90) || 
                (passCharacters[t] >= 97 && passCharacters[t] <= 122) )
            {
                b = true;
            }
            if( (passCharacters[t] >= 48 && passCharacters[t] <= 57) )
            {
                c = true;
            }
        }
        
        if( a && b && c )
        {
            return "The password is accepted";
        }
        return "The password is not accepted";
    }
    
    public static String iteration2( String password )
    {
        /*
         * a verifies password length
         * b verifies inclusion of a letter
         * c verifies inclusion of a number
         */
        
        boolean a = password.length() >= 8 , b = false , c = false;
        char [ ] passCharacters = password.toCharArray( );
        
        for( int t = 0 ; t < passCharacters.length ; t=t+1 )
        {
            if( (passCharacters[t] >= 65 && passCharacters[t] <= 90) || 
                (passCharacters[t] >= 97 && passCharacters[t] <= 122) )
            {
                b = true;
            }
            if( (passCharacters[t] >= 48 && passCharacters[t] <= 57) )
            {
                c = true;
            }
        }
        
        if( a && b && c )
        {
            return "The password is accepted";
        }
        else if( !a && b && c )
        {
            return "The tool indicates that the password is not long enough";
        }
        else if( a && !b && c )
        {
            return "The tool indicates that the password does not have a letter";
        }
        else if( a && b && !c )
        {
            return "The tool indicates that the password does not have a number";
        }
        else if( !a && !b && c )
        {
            return "The tool indicates that the password is not long enough and does not have a letter";
        }
        else if( !a && b && !c )
        {
            return "The tool indicates that the password is not long enough and does not have a number";
        }
        else if( a && !b && !c )
        {
            return "The tool indicates that the password does not have a letter and does not have a number";
        }
        return "The tool indicates that the password is not long enough, does not have a letter, and does not have a number";
    }
    
    public static String iteration3( String password, String admin )
    {
        if( admin.equalsIgnoreCase( "normal" ) )
        {
            return iteration1( password );
        }
        
        boolean a = password.length( ) >= 13, b = false , c = false, d = false;
        
        char [ ] passCharacters = password.toCharArray( );
        
        for( int t = 0 ; t < passCharacters.length ; t=t+1 )
        {
            if( (passCharacters[t] >= 65 && passCharacters[t] <= 90) || 
                (passCharacters[t] >= 97 && passCharacters[t] <= 122) )
            {
                b = true;
            }
            if( (passCharacters[t] >= 48 && passCharacters[t] <= 57) )
            {
                c = true;
            }
            if( (passCharacters[t] == 64 || passCharacters[t] == 35 || passCharacters[t] == 33 || 
                passCharacters[t] == 36 || passCharacters[t] == 37 || passCharacters[t] == 94 ||
                passCharacters[t] == 38 || passCharacters[t] == 42 ) )
                {
                    d = true;
                }
        }
        
        if( a && b && c && d )
        {
            return "The password is accepted";
        }
        
        return "The password is not accepted";
    }
    
    public static String iteration4( String password, String admin )
    {
        if( admin.equalsIgnoreCase( "normal" ) )
        {
            if( password.length( ) >= 10 )
            {
                return iteration1( password );
            }
            else
            {
                return "This password is not accepted";
            }
        }
        
        boolean a = password.length( ) >= 13, b = false , c = false, d = false;
        int specialCharacters = 0;
        
        char [ ] passCharacters = password.toCharArray( );
        
        for( int t = 0 ; t < passCharacters.length ; t=t+1 )
        {
            if( (passCharacters[t] >= 65 && passCharacters[t] <= 90) || 
                (passCharacters[t] >= 97 && passCharacters[t] <= 122) )
            {
                b = true;
            }
            if( (passCharacters[t] >= 48 && passCharacters[t] <= 57) )
            {
                c = true;
            }
            if( (passCharacters[t] == 64 || passCharacters[t] == 35 || passCharacters[t] == 33 || 
                passCharacters[t] == 36 || passCharacters[t] == 37 || passCharacters[t] == 94 ||
                passCharacters[t] == 38 || passCharacters[t] == 42 ) )
                {
                    specialCharacters += 1;
                }
        }
        
        if( specialCharacters >= 3 )
        {
            d = true;
        }
        
        if( a && b && c && d )
        {
            return "The password is accepted";
        }
        
        return "The password is not accepted";
    }
    
    public static void tester12( String p )
    {
        System.out.println( );
        System.out.println( "Running password " + p + " with iteration 1: " + iteration1(p) );
        System.out.println( );
        System.out.println( "Running password " + p + " with iteration 2: " + iteration2(p) );
    }
    
    public static void tester34( String p )
    {
        System.out.println( );
        System.out.println( "Running password " + p + " with iteration 3 with normal user: " + iteration3( p , "normal" ) );
        System.out.println( );
        System.out.println( "Running password " + p + " with iteration 3 with admin user: " + iteration3( p , "admin" ) );
        System.out.println( );
        System.out.println( "Running password " + p + " with iteration 4 with normal user: " + iteration4( p , "normal" ) );
        System.out.println( );
        System.out.println( "Running password " + p + " with iteration 4 with admin user: " + iteration4( p , "admin" ) );
    }
    
    public static void main( String args [ ] )
    {
        String [ ] passwords = { "hey" , "california" , "151515" , "6508772609" , "AppleBee23" , 
            "c6d9e" , "!!!&&&@a" , "Dog123Cat%%%" , "9999..2effg" , "17a7.$" , "$*$*" , "PizzaPasta909090" ,
            "E8...1239" , "8" , "$" , "Quesadilla797" , "%%%%" , "Cheeseburger12345$$$$$" , "2" , "intelligent8." };
            
        for( String p : passwords )
        {
            tester12( p );
            tester34( p );
        }
    }
}
