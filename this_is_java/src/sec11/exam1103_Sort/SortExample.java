package sec11.exam1103_Sort;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] scores = {99, 98, 97};
        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++){
            System.out.println("scores[" + i + "] =" + scores[i]);

        }
        System.out.println();

        String[] names = {"홍길동", "박동수", "김민수"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] =" + names[i]);

        }
        System.out.println();

        Member m1 = new Member("김민수");
        Member m2 = new Member("박동수");
        Member m3 = new Member("홍길동");
        Member[] member = {m1, m2, m3};
        Arrays.sort(member);
        for (int i = 0; i < member.length; i++){
            System.out.println("member[" + i + "] =" + String.valueOf(member[i]));

        }
        System.out.println();
    }
}
