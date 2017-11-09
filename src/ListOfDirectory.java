import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ListOfDirectory extends MyVisitor {
    public static void main(String[] args){

        Path pathSource = Paths.get("E:\\Programming\\Walktree\\");

        MyVisitor visitor = new MyVisitor();
        try {
            Files.walkFileTree(pathSource,visitor);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
