package test.powercargo;

/**
 * @author ʯ����
 * ȼ�ͳ�����
 */
public class FuelVachile extends Vachile {
	
	/**
	 * �����Ƿ�ر�
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
