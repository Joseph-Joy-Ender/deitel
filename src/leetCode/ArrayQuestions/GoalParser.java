package leetCode.ArrayQuestions;

public class GoalParser {
    public String interpret(String command){
        String bracket = "()";
        String word = "(al)";
        if (command.contains(bracket)){
           command = command.replace(bracket, "o");
        }
        if (command.contains(word)) {
            command = command.replace(word, "al");

        }
        return command;
    }

    public static void main(String[] args) {
        GoalParser goalParser = new GoalParser();
        String command = "(al)G(al)()()G";
        System.out.println(goalParser.interpret(command));
    }
}
