package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailSegregator {
    public static void main(String[] args) {
        String[] emails = {
                "john@gmail.com",
                "aakansha@yahoo.com",
                "abcxyz@outlook.com",
                "bob.green@gmail.com",
                "riddhisingh123@yahoo.com",
                "samuel89@outlook.com",
                "qwer@outlook.com"
        };

        Map<String, List<String>> emailMap = new HashMap<>();

        for (String email : emails) {
            String domain = email.split("@")[1];
            if(!emailMap.containsKey(domain)){
                emailMap.put(domain,new ArrayList<>());
            }
            emailMap.get(domain).add(email);
        }

        for(String key: emailMap.keySet()){
            System.out.println("Email with " + key +" are : "+ emailMap.get(key));
        }
    }
}

