package test.powercargo;

public class ElectVachile extends Vachile {

	/**
	 * 电瓶是否接通
	 */
	private boolean battery;
	
	@Override
	protected void enginnnerStart() {
		// TODO Auto-generated method stub
		this.battery =true;
		

	}

	@Override
	protected void enginnnerEnd() {
		// TODO Auto-generated method stub
		this.battery =false;

	}

	@Override
	protected void travle() {
		// TODO Auto-generated method stub
		if (!this.battery || super.getDriver()==null) {
			return;
		}
		super.setSpeed(30f);

	}

}
