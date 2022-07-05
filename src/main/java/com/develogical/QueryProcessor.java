package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("name")) {
            return "pizza";
        } else if (query.toLowerCase().contains("plus")) {
            String[] splitted = query.toLowerCase().split(" ");
            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].equals("plus")) {
                    int res = Integer.parseInt(splitted[i - 1]) + Integer.parseInt(splitted[i + 1]);
                    return "" + res;
                }
            }
        }
        else if (query.toLowerCase().contains("largest")){
                String[] reduced = query.toLowerCase().substring(query.toLowerCase().indexOf(":") + 2).split(",");
                int max = 0;
                for(String s : reduced){
                    if (Integer.valueOf(s) > max){
                        max = Integer.valueOf(s);
                    }
                }
                return "" + max;
            }
        return "";
    }
}
