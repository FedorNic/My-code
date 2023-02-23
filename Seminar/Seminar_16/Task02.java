package Seminar.Seminar_16;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\FedorNic\\Desktop\\Education\\GeekBrains\\Java\\src\\Seminar\\Seminar_16\\task.txt");
        Map<String, Integer> stringIntegerMap = fileReader(path);
        System.out.println(stringIntegerMap);
    }
    public static Map<String, Integer> fileReader(Path filepath) {
        List<String> stringList;
        try {
            stringList = Files.readAllLines(filepath);
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : stringList) {
            String[] str = s.split("=");
            if (str.length != 2){
                throw new IllegalArgumentException("Incorrect string format " + s);
            }
            int val;
            try {
                val = Integer.parseInt(str[1]);
            } catch (NumberFormatException ex){
              if (str[1].equals("?")){
                  val = str[0].length();
              } else {
                  throw new IllegalArgumentException("Expected number or null " + str[1]);
              }
            }
            stringIntegerMap.put(str[0], val);
        }
        return stringIntegerMap;
    }
}
