package chap15.sec05.exam01_tree_set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수" + score);

        score = scores.last();
        System.out.println("가장 높은 점수" + score);

        score = scores.lower(95);
        System.out.println("95점 아래 점수" + score);


        score = scores.higher(95);
        System.out.println("95점 위의 점수" + score);

        score = scores.floor(95);
        System.out.println("95점 이거나 바로 아래 점수" + score);

        score = scores.ceiling(85);
        System.out.println("95점 이거나 바로 위 점수" + score);

        //객체를 가져오면서 제거
        while(!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score + " 남은 객체 수: " + scores.size());

        }

//        객체를 가져오기만함
        Iterator<Integer> iterator = scores.iterator();
        while (iterator.hasNext()) {
            int s = iterator.next();
            System.out.println(s);
        }
    }
}
