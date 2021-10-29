package sec11.exam0304_deep_clone;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("홍길동", 25, new int[] {90,90},new Car("소나타"));

        Member cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜져";

        System.out.println("[복체객체의 필드값]");
        System.out.println("cloned.name = " + cloned.name);
        System.out.println("cloned.age = " + cloned.age);
        System.out.println("scores: {");
        for (int i = 0; i < cloned.scores.length; i++){
            System.out.println(cloned.scores[i]);
            System.out.print((i==(cloned.scores.length-1))?"":",");

        }
        System.out.println("}");
        System.out.println("cloned.car.model = " + cloned.car.model);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("original.name = " + original.name);
        System.out.println("original.age = " + original.age);
        System.out.println("scores: {");
        for (int i = 0; i < original.scores.length; i++){
            System.out.println(original.scores[i]);
            System.out.print((i==(original.scores.length-1))?"":",");

        }
        System.out.println("}");
        System.out.println("original.car.model = " + original.car.model);
    }
}
