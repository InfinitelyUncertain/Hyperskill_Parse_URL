package com.hyperskill;

public class Main {

    public static void main(String[] args) {
        String url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        findPassword(url);

    }

    public static void findPassword(String url){
        String subString = url.substring(url.indexOf("pass"));
        String password = retrieveInfo(subString);
        System.out.println(password);
    }

    public static String retrieveInfo(String subString){
        String info = subString.substring(subString.indexOf('=') + 1, subString.indexOf('&'));
        return info;
    }
}
