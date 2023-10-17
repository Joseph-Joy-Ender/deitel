package arraysSnacks;

import java.util.ArrayList;
import java.util.Scanner;

public class MBTI {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        MBTI mbti = new MBTI();
        System.out.println("What is your name: ");
        mbti.name = scanner.nextLine();
        mbti.quest1();

    }
ArrayList<String> answers = new ArrayList<>();

    String name;
    String[] questions = new String[20];
    public void quest1(){
        questions[0] = "A. tough-minded, just     B. tender-hearted, merciful ";
        questions[1] = "A. candid, straight forward, frank     B. tactful, kind encouraging";
        questions[2] = "A. focus on here-and-now     B. look to the future, global perspective, 'big picture' ";
        questions[3] = "A. control, govern     B. latitude, freedom ";
        questions[4] = "A. organized, orderly     B. flexible, adaptable ";
        questions[5] = "A. plan, scheduled     B. unplanned, spontaneous ";
        questions[6] = "A. standard, usual, conventional     B. different, novel, unique ";
        questions[7] = "A. regulated, structured     B. easy-going, live and let live! ";
        questions[8] = "A. preparation, plan ahead     B. go with the flow, adapt as you go";
        questions[9] = "A. active, initiate     B. reflective, deliberate ";
        questions[10] = "A. firm, tend to criticize, hold the line     B. gentle, tend to appreciate, conciliate";
        questions[11] = "A. external, communicative, express yourself     B. internal, reticent, keep to yourself";
        questions[12] = "A. facts, things, what is     B. ideas, dreams, what could be, philosophical";
        questions[13] = "A. matter of fact, issue-oriented     B. sensitive, people-oriented, compassionate";
        questions[14] = "A. seek many tasks, public activities, interaction with others     B. seek private, solitary activities with quiet to concentrate";
        questions[15] = "A. practical, realistic, experimental     B. imaginative, innovative, theoretical ";
        questions[16] = "A. more outgoing, think out loud     B. more reserved, think to yourself";
        questions[17] = "A. logical, thinking, questioning     B. empathetic feeling, accommodating";
        questions[18] = "A. expend energy, enjoy groups     B. conserve energy, enjoy one-on-one";
        questions[19] = "A. Interpret literally     B. look for meaning and possibilities";

        answerEntered();
        aBCounter();

    }

    public void answerEntered(){
        Scanner scanner = new Scanner(System.in);
        String answer;
        for (int i = 0; i <= 19; i++) {
            System.out.println(questions[i]);
            System.out.println("Select (A or B)");
            answer = scanner.nextLine().toUpperCase();
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("Expected A or B as a response");
                System.out.println("I know this is an error, please retry again");
                System.out.println(questions[i]);
                answer = scanner.nextLine().toUpperCase();
            }
            answers.add(answer.toUpperCase());
        }
      //  System.out.println(answers);
    }

    public void aBCounter(){
        System.out.printf("""
                Hello %s you selected
                """,this.name);
        int countA = 0;
        int countB = 0;
        int k = 0;
        int m = 0;
        int n = 5;
        for (int i = 0; i < answers.size() / 5; i++) {
            String[] question;
            for (int j = m; j < n; j++) {
                if(answers.get(j).equals("A")){
                    question = questions[k].split(" {5}");
                    System.out.println(question[0]);
                    countA++;
                }else {
                    question = questions[k].split(" {5}");
                    System.out.println(question[1]);
                    countB++;
                }
                k++;
            }
            m += 5;
            n += 5;
            System.out.println("Numbers of A " + countA);
            System.out.println("Number of B " + countB);
            System.out.println();
            countA = 0;
            countB = 0;


        }

    }



}
