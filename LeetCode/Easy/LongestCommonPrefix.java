package Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        String iteratingPrefix = strs[0];
        String commonPrefix = strs[0];
        String savedPrefix = strs[0];
        

        for (int i = strs.length - 1, k = 0; i >= 0; i--, k++) {
            for (int j = 1; j < strs[i].length() && j < strs[k].length(); j++) {
                prefix = strs[i].substring(0, j);
                iteratingPrefix = strs[k].substring(0, j);

                if (prefix.matches(iteratingPrefix)) {
                    commonPrefix = prefix;
                    if (commonPrefix.length() <= savedPrefix.length() || i == strs.length - 1)
                        savedPrefix = commonPrefix;
                }
            }
        }


        return savedPrefix;
    }

    public static String longestCommonPreffixV2(String[] strs) {

        int elements = strs.length;
        String shortestElement = strs[0];

        String prefix = "";
        String otherPrefix = "";
        String finalPrefix = "";

        for (int i = 0; i < elements; i++) {
            if (strs[i].length() < shortestElement.length())
                shortestElement = strs[i];
        }

        String[] allPrefixArray; //to działa??
        if (elements > 1)
            allPrefixArray = new String[elements - 1];
        else {
            allPrefixArray = new String[1];
        }

        for (int j = 0; j < elements; j++) {
            for (int k = 1; k < shortestElement.length() && j < elements - 1; k++) {
                prefix = strs[j].substring(0, k);
                otherPrefix = strs[j + 1].substring(0, k);

                if (prefix.matches(otherPrefix))
                    finalPrefix = prefix;
                else if (!prefix.matches(otherPrefix) && k == 1)
                    finalPrefix = "";
            }

            if (j < elements - 1)
                allPrefixArray[j] = finalPrefix;
        }
        System.out.println(Arrays.toString(allPrefixArray));

        String shortestPrefix = allPrefixArray[0];

        for (int i = 0; i < allPrefixArray.length; i++)
            if (allPrefixArray[i].length() < shortestPrefix.length())
                shortestPrefix = allPrefixArray[i];

        return shortestPrefix;
    }
}
