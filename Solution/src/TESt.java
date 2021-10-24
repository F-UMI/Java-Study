public class TESt {
    public static void main(String[] args) {
        String test = "df3r2..f32rfs...f32rfs.4123f";
        String[] test1 = test.split("");
        for (int i = 0; i < test1.length; i++){
            if(test1[i].equals(".")) {
                System.out.println("");
            } else {
                System.out.println(test1[i]);
            }
        }
    }
}
