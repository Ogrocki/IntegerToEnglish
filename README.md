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
