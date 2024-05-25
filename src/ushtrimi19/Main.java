package ushtrimi19;

public class Main {
    //Create three instances of Poem class, fill them with data (using constructor
    //and/or setters) and store them in array
    public static void main(String[] args) {

        Autor autor = new Autor("Kadare","Shqiptar");
        Autor autor2 = new Autor("Kafka","German");

        Poem poem1 = new Poem(autor2,650);
        Poem poem2 = new Poem(autor,150);
        Poem poem3 = new Poem(autor,800);

        Poem[] poems = new Poem[]{poem1,poem2,poem3};

        //fund pika 1

        //fillimisht gjej poemen me te gjate
        int maxCountStropheNumbers = 0;
        String mbiemriAutorit = "";

        for (int i=0 ; i < poems.length ; i++){
            if (maxCountStropheNumbers < poems[i].getStropheNumbers()){
                maxCountStropheNumbers = poems[i].getStropheNumbers();
                mbiemriAutorit = poems[i].getAutor().getSurname();
            }
        }

        //pastaj gjej cili ka qene autori qe e ka shkruar kete poem

        System.out.println("Mbiemri autorit: " + mbiemriAutorit + "," +
                " nurmi i rrjeshtave max: " + maxCountStropheNumbers);
    }
}
