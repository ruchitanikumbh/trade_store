package TradeStore;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Trademethod tf=new Trademethod();
		Date todaysDate=Calendar.getInstance ().getTime ();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		
		Date maturityDate=sd.parse("10/05/2021");
		Newstore t1=new Newstore("T1",1,"CP-1","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t1);
		
		maturityDate=sd.parse("20/05/2021");
		Newstore t2=new Newstore("T2",2,"CP-2","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t2);
		
		Newstore t4=new Newstore("T3",5,"CP-4","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t4);
		
		maturityDate=sd.parse("20/05/2021");
		Newstore t3=new Newstore("T4",5,"CP-3","B2",maturityDate, todaysDate, 'N');
		tf.addTrade(t3);
		
		System.out.println("\n\n");
		System.out.println("Displaying total number of Trade in the list");
		tf.printTrade();
		System.out.println("\n\n");
		
		System.out.println("Checking for Expired Flag");
		maturityDate=sd.parse("20/05/2020");
		Newstore t6=new Newstore("T2",2,"CP-2","B1",maturityDate, todaysDate, 'N');
		tf.allTrade.replace("T2", t6);
		
		maturityDate=sd.parse("20/05/2020");
		Newstore t7=new Newstore("T4",5,"CP-3","B2",maturityDate, todaysDate, 'N');
		tf.allTrade.replace("T4", t7);
		tf.checkExpiredDates();
		tf.printTrade();
		
	}
}
