package vav.codility.interview;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {
        Set<String> resultEmails = new HashSet<>();
        for (String email : emails) {
            resultEmails.add(filter(email));
        }
        return resultEmails.size();
    }

    private static String filter(String email) {
        String[] tokens = email.split("@");
        String filteredPLus;
        if(tokens[0].contains("+")) {
            filteredPLus = tokens[0].substring(0, tokens[0].indexOf("+"));
        } else {
            filteredPLus = tokens[0];
        }
        StringBuilder result = new StringBuilder();
        for (char ch : filteredPLus.toCharArray()) {
            if (ch != '.') {
                result.append(ch);
            }
        }
        result.append("@").append(tokens[1]);
        return result.toString();
    }
}
