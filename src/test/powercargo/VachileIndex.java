package test.powercargo;

import java.util.Date;


public class VachileIndex {
	public static void main(String[] args) {
		FuelVachile vachile = new FuelVachile();
		vachile.setDriver("ʯ����");
		vachile.enginnnerStart();
		vachile.travle();
		//System.out.println(vachile.pump);//��ʻ�������ǿ�����true
		//System.out.println(vachile.driver);
		Date d1;
		System.out.println(vachile.getDriver()+vachile.getSpeed());		
		
		Vachile abstractVachile = vachile;
		abstractVachile.setDriver("sandy");
		//abstractVachile.enginnnerStart();
		//abstractVachile.travle();
		System.out.println(abstractVachile.getDriver()+abstractVachile.getSpeed());
	}


}
