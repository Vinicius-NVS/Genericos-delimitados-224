package application;

import services.CalculationService;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        String path = "D:\\para ser lido\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
                String line = br.readLine();
                while (line != null){
                    list.add(Integer.parseInt(line));
                    line = br.readLine();
                }
                Integer x = CalculationService.max(list);
                System.out.println("Max: ");
                System.out.println(x);
        } catch (IIOException e ) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {

        }
    }
}