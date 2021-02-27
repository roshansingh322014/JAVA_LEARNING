package com.rbr.concepts;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp3 {

    public static void main(String[] args) {
        String text1="This is the text to be searched for in the occurance of the word";
        String text2=" This is a java course , the main is to make learning easy";

        String patternString = "is";

        Pattern pattern= Pattern.compile(patternString);
        Matcher matcher1=pattern.matcher(text1);

        int count1=0,count2=0;

        while(matcher1.find()){
            count1++;
            System.out.println("Found " + count1 + " " + matcher1.start() + "_" + matcher1.end());
        }

        ;

        Matcher matcher2=pattern.matcher(text2);

        while (matcher2.find()){
            count2++;
        }

        System.out.println("found count of :" + count2 + " in second text");

        System.out.println("**************************************************************");

        String content= " this is a raudre  e books content";

        String patt=".*book.*";

        boolean isMatch= Pattern.matches(patt,content);

        if(isMatch== true){
            System.out.println("the string content is matched");
        }
        else {
            System.out.println("Not matched");
        }

        System.out.println("**************************************************");

         String text4=" this is the text to be searched for";

         String newString=" ";

         Pattern pattern3=Pattern.compile(newString);

         String[] strings= pattern3.split(text4);

         for( String s : strings)
         {
             System.out.println(s);
         }


    }
}
