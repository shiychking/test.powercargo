package test.powercargo;

/**
 * @author ʯ���� 
 * ����������
 */
public abstract class Vachile {
	
	/**
	 * ��ʻԱ
	 */
	private String driver;

	/**
	 * �ٶ�
	 */
	private float speed;

	/**
	 * ���濪ʼ
	 */
	protected abstract void enginnnerStart();

	/**
	 * �������
	 */
	protected abstract void enginnnerEnd();

	/**
	 * ��ʻ
	 */
	protected abstract void travle();

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
}
