import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat form = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(form.format(d));
	}

}