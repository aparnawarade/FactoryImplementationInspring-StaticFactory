package beans;

public class carFactory {
	
	public static String carname;
	public static void setCarname(String carname) {
		carFactory.carname = carname;
	}
	
	public static Car getInstance() throws Exception 
	{
		Car c=(Car)Class.forName(carname).newInstance();
		return c;
	}

}
