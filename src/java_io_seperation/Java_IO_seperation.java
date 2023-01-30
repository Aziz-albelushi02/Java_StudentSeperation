package java_io_seperation;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_IO_seperation {
    
    

    public static void main(String[] args) throws Exception {
        
        
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get("D://students.txt"), StandardCharsets.UTF_8);
            
        } catch (IOException e) { // TODO Auto-generated catch block
            
            e.printStackTrace();
        }
        
        System.out.println("Content of List:");
        
        System.out.println(lines);
        
        BufferedReader bufReader = new BufferedReader(new FileReader("D://students.txt"));
        
        ArrayList<String> listOfLines = new ArrayList<>();
        
        String line = bufReader.readLine();
        
        while (line != null) {
            
            listOfLines.add(line);
            
            line = bufReader.readLine();
            
        }
        bufReader.close();
        
        
        
        System.out.println("Content of ArrayLiList:");
        
        
        
        System.out.println(listOfLines);
        
        
        PrintWriter writer18 = new PrintWriter(new FileOutputStream("D://st18.txt"), true);
        
        PrintWriter writer19 = new PrintWriter(new FileOutputStream("D://st19.txt"), true);
        
        PrintWriter writer20 = new PrintWriter(new FileOutputStream("D://st20.txt"), true);
        
        PrintWriter writer21 = new PrintWriter(new FileOutputStream("D://st21.txt"), true);
        
        for (String str : listOfLines) {
            
            if ("18".equals(str.substring(0, 2))) {
                
                writer18.println(str);
                
            } else if ("19".equals(str.substring(0, 2))) {
                
                writer19.println(str);
                
            } else if ("20".equals(str.substring(0, 2))) {
                
                writer20.println(str);
                
            } else if ("21".equals(str.substring(0, 2))) {
                
                writer21.println(str);
            }
        }
        writer18.close();
        
        writer19.close();
        
        writer20.close();
        
        writer21.close();
    }
}
