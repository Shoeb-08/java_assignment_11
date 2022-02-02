package packagee;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;

public class Test {
    public static String filePath = "/home/shoebs/IdeaProjects/java assignment 11/src/packagee/hello_world";
    public static void main(String[] args)
    {
        Map<String, Integer> m=HashMapFromTextFile();
        for (Map.Entry<String, Integer> e :m.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
    public static Map<String, Integer >HashMapFromTextFile()
    {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = null;
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null)
            {
                String[] arr= line.split(":");
                String name = arr[0].trim();
                String i="0";
                map.put(name, map.getOrDefault(name,0)+1);

            }
        }
        catch (Exception e)
        {
            System.out.println("exception ");
        }

        return map;
    }
}
