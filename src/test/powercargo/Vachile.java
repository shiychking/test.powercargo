package test.powercargo;

/**
 * @author 石永昌 
 * 车辆抽象类
 */
public abstract class Vachile {
	
	/**
	 * 驾驶员
	 */
	private String driver;

	/**
	 * 速度
	 */
	private float speed;

	/**
	 * 引擎开始
	 */
	protected abstract void enginnnerStart();

	/**
	 * 引擎结束
	 */
	protected abstract void enginnnerEnd();

	/**
	 * 驾驶
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
