# IntegerToEnglish
Convert Numbers to English Words

This is a CTI tool that will convert integer values to english words
eg. "123" will become "one hundred twenty-three"

# How To Use -
I have a included a the Jar and a bash file to run the code. You can call:

 Linux and Mac -
        
        ./integerToEnglish.sh (If you are having errors try calling "chmod +x integerToEnglish.sh" first
            or
        java -jar SonoTypeTakeHome.jar (If this is not working you may need to install java)

  Windows -
        
        java -jar SonoTypeTakeHome.jar (If this is not working you may need to install java)

# Code Details

 - integerToEnglish.sh - bash script that runs the program
 - SonoTypeTakeHome.jar - compiled jar file.
 - lib - libraries used by this program, we use icu4j-63_1.jar and junit-4.13-beta-1.jar.
 - src.com.ogrocki.matthew.IntegerToEnglishConverter - Holds the logic for converting IntegerToEnglish.
 - Main.java - Holds CLI user interface and logic for looping values.
 
# Tools Used
 - icu4j-63_1.jar - Used to convert Integer to English http://site.icu-project.org/home - ICU license
 - junit-4.13-beta-1.jar - Used for basic unit tests https://junit.org/junit5/ - Eclipse Public License 
 
# Explination 
 - in this solution I chose to use a libary that does the required work already that is open source instead of
   redoing work that has already been done. I created a class for testing purposes and a few basic unit tests.
   If this solution is not an acceptatble solution I can just replace the library call for icu4 with code that
   accomplishes the task without having to modify any of the other code. I wrote a .sh file so it can clear the
   screen when being used on the command line. Finally I used Junit as a testing frame work so I could do test
   driven development. 
