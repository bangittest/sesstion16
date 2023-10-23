import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File project = new File("project");
        if (project.mkdir()) {
            File inputFile = new File("project/input.txt");
            inputFile.createNewFile();
            File demo = new File("project/demo.java");
            demo.createNewFile();
            File sub1 = new File("project/sub1");
            if (sub1.mkdir()) {
                File output = new File("project/sub1/output.txt");
                output.createNewFile();
                File student = new File("project/sub1/student.dat");
                student.createNewFile();
            }
            File sub2 = new File("project/sub2");
            if (sub2.mkdir()) {
                File output = new File("project/sub2");
                output.createNewFile();


                File[] subArr = project.listFiles();
                System.out.println("Folder " + project.getName());
                for (File sub : subArr) {
                    System.out.println(sub.getName());
                }
            }
        }
    }
}