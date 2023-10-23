import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        File dataFolder = new File("data");
        if (!dataFolder.exists()) {
            dataFolder.mkdir();
        }
        createEmptyFile("data/input.txt");
        createEmptyFile("data/Demo.java");

        File sub1Folder = new File("data/sub1");
        if (!sub1Folder.exists()) {
            sub1Folder.mkdir();
        }
        File sub2Folder = new File("data/sub2");
        if (!sub2Folder.exists()) {
            sub2Folder.mkdir();
        }
        createEmptyFile("data/sub1/output.txt");
        createEmptyFile("data/sub1/student.dat");
        displayDirectoryTree(dataFolder, "");

        System.out.println("Cây thư mục đã tạo thành công.");
    }

    private static void createEmptyFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void displayDirectoryTree(File dir, String indent) {
        System.out.println(indent + "" + dir.getName());
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                displayDirectoryTree(file, indent + "-");
            }
        }
    }
}
