package org.example;

public class Reverse_String {

    public static void main(String[] args){

        String Name  = "qwertyuiop";
        int size = Name.length();
        char[] namearray = Name.toCharArray();
        char[] reversenamearray = new char[size];
        for(int i=0 ; i<size ;i++)
        {
            System.out.println(namearray[i]);
        }
System.out.println("reverse array");

        for(int i = size-1, j=0; i>=0; i--, j++)
        {
            reversenamearray[j] = namearray[i];
        }
        String reversedName = new String(reversenamearray);
System.out.println(reversedName);



    }

}
