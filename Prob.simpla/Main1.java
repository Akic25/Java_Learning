void main(String[] args ) {
    System.out.println("Hello world!");

    String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
    for(int i=0;i< languages.length;i++)
        System.out.print(languages[i]+ " ");

    System.out.println();
    int n = (int) (Math.random() * 1_000_000);
    System.out.println(n );
    n *= 3;
    n += Integer.parseInt("10101", 2);
    n += Integer.parseInt("FF", 16);
    n *= 6;
    System.out.println(n);
    int sum = 0;
    int result = 0;
    do {
        while(n!=0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        n = sum;
        result = sum;
        sum = 0;
    }while(result>=10);

    n = result;
    System.out.println(n);
    System.out.println("\nWilly-nilly, this semester I will learn " + languages[result]);
}