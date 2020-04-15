package utils.helpers;

import java.io.*;
import java.util.Scanner;

/**
 * Хелпер для быстрого создания новой страницы
 * */
public class NewPageCreator {

    private static String namePage = "";

    public static void main(String[] args) throws IOException {
        File newPage = new File("src\\test\\java\\pages\\" + namePage + ".java");
        File newSteps = new File("src\\test\\java\\stepsDefinitions\\" + namePage + "Steps.java");

        if(newPage.exists()) {
            throw new IOException("Файл с названием \"" + namePage + "\" уже существует");
        }
        if(newSteps.exists()) {
            throw new IOException("Файл с названием \"" + namePage + "Steps\" уже существует");
        }

        Scanner scPage = new Scanner(new FileReader("templates\\page"));
        Scanner scSteps = new Scanner(new FileReader("templates\\step"));

        try(FileWriter writer = new FileWriter("src\\test\\java\\pages\\" + namePage + ".java", false))
        {
            while (scPage.hasNext()) {
                String nextLine = scPage.nextLine();
                if(nextLine.contains("/*namePage*/")) {
                    String newLine = nextLine.replace("/*namePage*/", namePage);
                    writer.write(newLine);
                    writer.append("\n");
                }else {
                    writer.write(nextLine);
                    writer.append("\n");
                }
            }
            System.out.println("Файл \"" + namePage + "\" создан");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("src\\test\\java\\stepsDefinitions\\" + namePage + "Steps.java", false))
        {

            String namePageSteps = namePage + "Steps";
            while (scSteps.hasNext()) {
                String nextLine = scSteps.nextLine();
                if(nextLine.contains("/*namePage*/")) {
                    String newLine = nextLine.replace("/*namePage*/", namePage);
                    writer.write(newLine);
                    writer.append("\n");
                }else if(nextLine.contains("/*namePageSteps*/")) {
                    String newLine = nextLine.replace("/*namePageSteps*/", namePageSteps);
                    writer.write(newLine);
                    writer.append("\n");
                }else {
                    writer.write(nextLine);
                    writer.append("\n");
                }
            }
            System.out.println("Файл \"" + namePage + "Steps\" создан");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
