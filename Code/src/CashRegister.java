import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
	private static CashRegister cashRegister;
	private static ArrayList<String> items;
	private static double total;
	
    public static void createInstance()
    {
        cashRegister = new CashRegister();
        items = new ArrayList<String>();
        total = 0;
    }
    
    public static double getTotal() {
    	return total;
    }
	
	public static Object[] addItem(String barcode) {
        try {
            File myObj = new File("database");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String curBardcode = data.substring(0, data.indexOf(":"));
                
                if (barcode.equals(curBardcode)){                	
                	String name = data.substring(data.indexOf(":")+2, data.indexOf("$")-1);
                	String price = data.substring(data.indexOf("$")+1);
                	items.add(name);
                	total += Double.parseDouble(price);

                	Object[] item = {curBardcode, name, price};
                    return item;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        return new Object[0];
	}
	
	public static void printItems() {
		System.out.println(items.toString());
	}
}
