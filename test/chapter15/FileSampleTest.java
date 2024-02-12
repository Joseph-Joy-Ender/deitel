package chapter15;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileSampleTest {

    @Test
    public void testCreateFile(){
        String fileName = "sample.txt";
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\files";

        FileSample.createFile(location, fileName);

        Path path = Paths.get(location, fileName);

        assertTrue(Files.exists(path));
    }

    @Test
    public void testCreateFiles(){
        String fileName = "samples.txt";
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\files";

        FileSample.createFile(location, fileName);

        Path path = Paths.get(location, fileName);

        assertTrue(Files.exists(path));
    }

    @Test
    public void testCreateDirectory(){
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\joy\\joy.txt";
        FileSample.createDirectory(location);

        Path path = Path.of(location);

        assertTrue(Files.exists(path));
    }

    @Test
    public void testDelete(){
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\joy";
        FileSample.delete(location);

        Path path = Paths.get(location);

        assertFalse(Files.exists(path));
    }

    @Test
    public void testDeleteFile(){
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\files\\samples.txt";
        FileSample.delete(location);

        Path path = Paths.get(location);

        assertFalse(Files.exists(path));
    }

}