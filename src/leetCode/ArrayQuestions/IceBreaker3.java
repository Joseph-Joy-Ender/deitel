package leetCode.ArrayQuestions;

import java.util.ArrayList;

class IceBreaker3 {

    public ArrayList<Integer> multiply(int a, int b, int c) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int count = a; count <= b ; count++) {
            res.add(c * count);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new IceBreaker3().multiply(1, 10, 2);
        System.out.println(res);
    }
}
