package Chapters.Chapter10.VolkanHocaExercises;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        System.out.println(s1 == s2);//False
        System.out.println(s1 == s3);//True

        System.out.println("Java is Fun".matches("Java.*"));
        System.out.println("Java is Cool".matches("Java.*"));
        String s = "Mehmet";
        System.out.println(s.replaceAll("[h+m]", "aaa"));
        String tokens = String.valueOf("Java,C?C#,C++".split("[.,M:;?]"));
        for (int i = 0; i <tokens.length() ; i++) {
           // System.out.println(tokens[i]);
        }
        StringBuilder n =new StringBuilder("mehmet");
        n.append("Merhaba");
      /*  for (int i = 0; i < 1_000_000; i++) {
            n.append("a");
        }*/
        StringBuilder a= new StringBuilder("Welcome");
        StringBuilder b= new StringBuilder("Welcome");
        StringBuilder c= new StringBuilder("Welcome");
        StringBuilder d= new StringBuilder("Welcome");
        a.append(b).append(c).append(d);
        a.insert(5,"ali");
        System.out.println(a);
        System.out.println(a.reverse());
        System.out.println(a.delete(5,7));
        a.deleteCharAt(12);
        System.out.println(a);
        a.replace(3,5,"Ahmet").reverse();
        System.out.println(a);
        System.out.println(a.capacity());
        System.out.println(a.length());
        System.out.println(a.toString());
        a.trimToSize();
        System.out.println(a);
        System.out.println(a.capacity());
        System.out.println(a.length());

    }
}
