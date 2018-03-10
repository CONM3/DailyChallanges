package com.mycompany.calculator331;

/**
 *
 *
 * @since Mar 10, 2018, 1:22:45 PM
 * @author Grzegorz Brodowski
 */
public class Calculate {
    
    //need to make dividing and substracting

    public String checkSign(String s) {
        if (s.contains("+"))
            return "+";
        else if (s.contains("/"))
            return "/";
        else if (s.contains("*"))
            return "*";
        else if (s.contains("^"))
            return "^";
        else
            return "-";
    }

    public String[] cleanString(String operation, String checkSign) {
        operation = operation.replaceAll(" ", "");

        if (checkSign.equals("+"))
            return operation.split("\\+");
        else if (checkSign.equals("/"))
            return operation.split("\\/");
        else if (checkSign.equals("*"))
            return operation.split("\\*");
        else if (checkSign.equals("^"))
            return operation.split("\\^");
        else
            return operation.split("-");
    }

    public int operationResult(String operation) {
        String checkSign = checkSign(operation);
        String[] numbers = cleanString(operation, checkSign);

        int i = 0;
        int liczba = 0;

        if (checkSign.equals("+"))
            for (String s : numbers)
                liczba = liczba + Integer.parseInt(s);
        else if (checkSign.equals("*"))
            for (String s : numbers)
                if (i == 0) {
                    liczba = Integer.parseInt(s);
                    i++;
                } else
                    liczba = liczba * Integer.parseInt(s);
        else if (checkSign.equals("^"))
            for (String s : numbers) {
                if (i == 0) {
                    liczba = Integer.parseInt(s);
                    i++;
                }
                else{
                    liczba= (int)Math.pow((double)liczba ,Double.parseDouble(s));
                }       
            }
        return liczba;
    }

}
