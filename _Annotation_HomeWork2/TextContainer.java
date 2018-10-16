package _Annotation_HomeWork2;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "c:\\Annon\\save_here.txt")
public class TextContainer {

    private String string = "My String";

    public TextContainer(String string) {

        this.string = string;
    }

    public TextContainer() {

    }

    public String getString() {
        return string;
    }

    @Saver
    public void save(String path){

        try (FileWriter fileWriter = new FileWriter(path)){

            fileWriter.write(new TextContainer().getString());

        }catch (IOException e){

            System.out.println(e.getMessage());
        }
    }
}
