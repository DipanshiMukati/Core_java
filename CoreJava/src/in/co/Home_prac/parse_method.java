package in.co.Home_prac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class parse_method {

	public static void main(String[] args) throws ParseException {
       String str = ("01/05/2024");
       SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
       Date date = sdf.parse(str);
	System.out.println(date);
	}
}
//String str = ("07/10/2023");
//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//Date date = sdf.parse(str);
//System.out.println(date);