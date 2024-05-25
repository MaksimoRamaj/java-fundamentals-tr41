package ushtrimi17;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //marrja e user input
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "*Warning*\n Formats accepted mm/dd/yyyy or mm-dd-yyyy or mm.dd.yyyy"
            );
            System.out.println("Jep daten: ");
        //validimi i inputit
            String data = scanner.next("^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        //kalimi nga string ne int
            //do perdorim splitterin
            String[] splittedData = data.split("[/.-]");

        //krijimi i datave prej inputit
            String muaj = splittedData[0];
            String dita = splittedData[1];
            String viti = splittedData[2];
            Integer.parseInt(muaj); //ben kalimin nga String ne Integer int

        LocalDate nextSdaClazz = LocalDate.of(
                Integer.parseInt(viti),
                Integer.parseInt(muaj),
                Integer.parseInt(dita)
        );

        LocalDate.now(); // per te marr daten aktuale
        //llogaritja e kohes midis datave

        Period period = Period.between(LocalDate.now(),nextSdaClazz);

        long p2 = ChronoUnit.DAYS.between(LocalDate.now(),nextSdaClazz);

        System.out.println("Ditet deri ne klasen e ardhshme: " + p2);
    }
}
