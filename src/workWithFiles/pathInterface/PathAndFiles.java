package workWithFiles.pathInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("testPath.log");
        Path directoryPath = Paths.get("/Users/narsil/Documents/my Java/for Test/testPath");

        /*System.out.println("filePath.getFileName() : " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() : " + directoryPath.getFileName());

        System.out.println("----------------------------*******----------------------------");

        System.out.println("filePath.getParent() : " + filePath.getParent());
        System.out.println("directoryPath.getParent() : " + directoryPath.getParent());

        System.out.println("----------------------------*******----------------------------");

        System.out.println("filePath.getRoot() : " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() : " + directoryPath.getRoot());

        System.out.println("----------------------------*******----------------------------");

        System.out.println("filePath.toAbsolutePath() : " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() : " + directoryPath.toAbsolutePath());

        System.out.println("----------------------------*******----------------------------");

        System.out.println("directoryPath.resolve() : " + directoryPath.resolve(filePath));

        System.out.println("----------------------------*******----------------------------");

        Path anotherPath = Paths.get("/Users/narsil/Documents/my Java/M/K/R/for Test");
        System.out.println(directoryPath.relativize(anotherPath));
        System.out.println("----------------------------*******----------------------------");*/

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        /*System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));*/

//        System.out.println(Files.size(filePath));

//        System.out.println("Time was " + Files.getAttribute(filePath, "creationTime"));

        /*Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

        Path pathForCopy = Paths.get("forCopyFile");
//        Files.copy(filePath, pathForCopy, StandardCopyOption.REPLACE_EXISTING);

        /*Path dirPath = Paths.get("src/workWithFiles");
        Files.move(pathForCopy, dirPath.resolve("forCopyPath"));*/

//        Files.move(Paths.get("testMoveRename"), Paths.get("RenMove"));

//        Files.delete(Paths.get("RenMove"));

        Path pathForWrite = Paths.get("bla-bla");
        /*Files.createFile(pathForWrite);
        String bla = "bla-bla\nbla-bla\nbla-bla\n";
        Files.write(pathForWrite, bla.getBytes());*/

        List<String> list = Files.readAllLines(pathForWrite);
        for (String string : list) {
            System.out.println(string + " yeah!\n");
        }

    }

}