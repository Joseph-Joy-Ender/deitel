package moocJavaProgrammingExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private final Dog dog = new Dog();

    @Test
    public void testThatDogHasAName(){
          dog.setName("Bingo");
          assertEquals("Bingo", dog.getName());

    }

    @Test
    public void testThatDogHasBreed(){
        dog.setBreed("German Shepherd");
        assertEquals("German Shepherd", dog.getBreed());
    }

    @Test
    public void testThatDogHasAnAge(){
        dog.SetAge(3);
        assertEquals(3, dog.getAge());
    }

    @Test
    public void testThatDogHasColour(){
        dog.setColour("Black");
        assertEquals("Black", dog.getColour());
    }

    @Test
    public void testThatDogHasSize(){
        dog.setSize(12);
        assertEquals(12, dog.getSize());
        }
    }

