package Stream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
       // LocalDateTime now=LocalDateTime.now();
       // System.out.println(now);

       // LocalDateTime a=LocalDateTime.parse("2026-01-13T15:07:23.476729");
       // System.out.println(a);

      //  LocalDateTime start=LocalDateTime.of(2002,3,9,10,10);
        //LocalDateTime end=LocalDateTime.now();

        ZonedDateTime a=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(a);


    }   
}
