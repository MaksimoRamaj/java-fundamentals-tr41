public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++){
            if (i == 2 || i == 3){
                continue;
            }
            if (i == 5){
                return;
            }
            System.out.println(i);
        }

        System.out.println("Dole nga cikli!");
        //0 1 4

    }

    public static void A(){
        System.out.println("Kod ....");
        B();
        System.out.println("Pas ekzekutimit te metodes B");
        return;
    }

    public static void B(){
        System.out.println("Metoda B!");
        C();
        System.out.println("Pas ekzekutimit te metodes C");
        return;
    }

    public static void C(){
        System.out.println("Metoda C!");
        return;
    }
}