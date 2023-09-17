package test;
import java.time.LocalDate;

public class Invoice {

	public static void main(String[] args) {
		String regNo = "C026-01-0940/2022";
		String name = "Njuguna Samwel Mugo";
		LocalDate myObj = LocalDate.now();
		int contact = 0100100100;
		int Qty = 4;
		String item ="Pencil";
		int price =20;
		float Amount =price*Qty;
		float total = 80;
		System.out.println("**************************Adamson Computers Ltd*************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("                 VAT REG. TIN 098-765-4321-0000");
		System.out.println("                         SALES INVOICE");
		System.out.println("");
		System.out.println("");
		System.out.println("Sold to:"+regNo +"                                     "+ "Date:" + myObj);
		System.out.println("Address:"+name +"                                   "+ "Contact Number:" + contact);
		System.out.println("");
		System.out.println("");
		String hyphen = new String(new char[80]).replace('\0','-');
		String equal = new String(new char[80]).replace('\0','=');
		System.out.println(equal);
		System.out.println("Qty    |       Item Description      |        Unit Price      |Amount");
		System.out.println(equal);
		System.out.println( Qty + "     " +" |" +"              "+item  +"         " +"|" + price+"                      "+"|" +Amount);
		System.out.println(hyphen);
		Qty = 10;
		item = "Duster";
		price = 50;
		Amount =price*Qty;
		total += Amount;
		System.out.println( Qty + "    " +" |" +"              "+item  +"         " +"|" + price+"                      "+"|" +Amount);
		System.out.println(hyphen);
		Qty = 9;
		item = "Pens";
		price = 30;
		Amount =price*Qty;
		total += Amount;
		System.out.println( Qty + "     " +" |" +"                "+item  +"         " +"|" + price+"                      "+"|" +Amount);
		System.out.println(hyphen);
		Qty = 10;
		item = "Crayon";
		price = 80;
		Amount =price*Qty;
		total += Amount;
		double VAT = 0.16* total;
		double totalAmount = total + VAT;
		System.out.println( Qty + "    " +" |" +"              "+item  +"         " +"|" + price+"                      "+"|" +Amount);
		System.out.println(equal);
		System.out.println("                                               "+ "|Sub Total     |" +total);
		System.out.println("                                               "+  "=================================");
		System.out.println("                                               "+ "|VAT(16%)      |" +VAT);
		System.out.println("                                               "+  "=================================");
		System.out.println("                                               "+ "|Total Amount  |" +totalAmount);
		System.out.println("                                               "+  "=================================");
		
		
		
	}

}
