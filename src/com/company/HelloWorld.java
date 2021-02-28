public class HelloWorld {
    public static void main(String[] args) { //1
        System.out.println("Hello, World!");
        //2
        String[] languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        //3
        int n = (int) (Math.random() * 1000000);
        System.out.println("Random number: " + n);
        //4
        n = n * 3;
        n = n + 0b10101;
        n = n + 0xFF;
        n = n * 6;

        int result = n;
        while (result > 9)
        {
            int n1 = result;
            result = 0;
            while ( n1 > 0) {
                result = result + n1 % 10;
                n1 = n1 / 10;
            }
        }
        System.out.println("Willy-nilly, this semester i will learn " + languages[result] + ".");
    }

}