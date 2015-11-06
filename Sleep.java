package sleepCycle;
import org.joda.time.LocalTime;
import java.util.Scanner;
public class Sleep {
	private static final int SLEEP_CYCLEDURATION = 90;
	private static final int SLEEP_FALLASLEEPTIME = 7;
	public static void main(String[] args) {
		final Scanner inputScanner = new Scanner(System.in);
		System.out.println("Sleep cycle calculator:\n1 - Sleep time from wake time\n2 - Wake times from sleep time");
		int option = inputScanner.nextInt();
		if(option == 1){
			System.out.println("Enter wake time in HH:MM format:");
			String timeInput = inputScanner.next();
			int hour = Integer.valueOf(timeInput.split(":")[0]);
			int min = Integer.valueOf(timeInput.split(":")[1]);
			LocalTime wakeUp = new LocalTime(hour, min);
			System.out.println("Go to bed at:");
			for(int i = 6; i>3;i--){
				System.out.println("\t" + wakeUp.minusMinutes(SLEEP_CYCLEDURATION* i).minusMinutes(SLEEP_FALLASLEEPTIME).toString("HH:mm"));
			}
		}else{
			System.out.println("Enter sleep times: ");
			String timeInput = inputScanner.next();
			int hour = Integer.valueOf(timeInput.split(":")[0]);
			int min = Integer.valueOf(timeInput.split(":")[1]);
			LocalTime wakeUp = new LocalTime(hour, min);
			System.out.println("Wake up at: ");
			for(int i = 6; i>3;i--){
				System.out.println("\t" + wakeUp.plusMinutes(SLEEP_CYCLEDURATION* i).plusMinutes(SLEEP_FALLASLEEPTIME).toString("HH:mm"));
			}
		}
		inputScanner.close();
	}
}
