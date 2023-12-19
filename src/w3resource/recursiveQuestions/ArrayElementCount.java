package w3resource.recursiveQuestions;

public class ArrayElementCount {
    public <T> int countOccurrence(T[] array, T target, int index){
       if (index == array.length) return 0;
       int count = countOccurrence(array, target, index + 1);
       if (array[index].equals(target)) count++;
       return count;
    }

    public <T> int countOccurrence(T[] array, T target){
        return countOccurrence(array, target, 0);
    }
}
