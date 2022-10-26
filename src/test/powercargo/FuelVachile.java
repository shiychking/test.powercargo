package test.powercargo;

/**
 * @author 石永昌
 * 燃油车的类
 */
public class FuelVachile extends Vachile {
	
	/**
	 * 引擎是否关闭
	 */
	private boolean pump;

	@Override
	protected void enginnnerStart() {
		// TODO Auto-generated method stub
		this.pump =true;

	}

	@Override
	protected void enginnnerEnd() {
		// TODO Auto-generated method stub
		this.pump =false;

	}

	@Override
	protected void travle() {
		// TODO Auto-generated method stub
		if (this.pump && super.getDriver()!=null) {
			super.setSpeed(45f);
		}
		
			

	}

}
