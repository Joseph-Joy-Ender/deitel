package arraysSnacks;

public class StudentGradeExample1 {

        public static void main(String[] args) {
            int[][] studentGrade = {{67, 21, 49},{98, 62, 56},{93, 34, 27}, {78, 83, 66}};
            //studentsSubjectGrade = {{1,2},{45,56}, {72,48}};
            int x = 0;
            for(int i = 0; i < studentGrade.length; i++) {
                System.out.println("Subject " + (i+1));
                int[] subjectsScores = new int[studentGrade.length];
                int totalSubjectScore = 0;
                int fail = 0;
                int pass = 0;



                for (int j = 0; j < studentGrade.length; j++) {
                    //System.out.println(j + "  " + x);
                    //System.out.println(studentGrade[j][x]); // 00, 10 == 01, 11 == 02, 12
                    if(x < studentGrade.length){
                        subjectsScores[j] = studentGrade[j][x];
                        totalSubjectScore += studentGrade[j][x];
                        if(studentGrade[j][x] < 50) {
                            fail++;
                        } else {
                            pass++;
                        }
                    }

                }

                // Student
                System.out.print("highest scoring student is student " + (getStudentIndex(highest(subjectsScores), subjectsScores) + 1));
                // Score
                System.out.println(" scoring " + highest(subjectsScores));

                // Student
                System.out.print("lowest scoring student is student " + (getStudentIndex(lowest(subjectsScores), subjectsScores) + 1));
                // Score
                System.out.println(" scoring " + lowest(subjectsScores));

                System.out.println("Total score is " + totalSubjectScore);
                System.out.println("Average score is: " + (totalSubjectScore / studentGrade.length));
                System.out.println("Number of passes: " + pass);
                System.out.println("Number of fails: " + fail);
                x++;

            }
        }

        public static int highest(int[] arr) {
            //subjects
            int largest = arr[0];
            for (int i : arr) {
                if (largest < i) {
                    largest = i;
                }
            }
            return largest;
        }

        public static int lowest(int[] arr) {
            int lowest = arr[0];
            for (int i : arr) {
                if (lowest > i) {
                    lowest = i;
                }
            }
            return lowest;
        }

        public static int getStudentIndex(int score, int[] subjectScores) {
            int index = 0;
            for(int i: subjectScores) {
                if(score == i) {
                    break;
                }
                index++;
            }

            return index;
        }

    }

