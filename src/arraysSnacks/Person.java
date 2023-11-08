package arraysSnacks;

import java.util.ArrayList;

public class Person {
    private final ArrayList<Problem> problems = new ArrayList<>();

    public void addProblem(Problem problem){
        problems.add(problem);

    }

    public void solve(Problem problem) {
        problems.remove(problem);

    }

    public ArrayList<Problem> unSolvedProblem() {
        return problems;
    }


}
