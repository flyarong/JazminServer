/**
 * 
 */
package jazmin.driver.mq;


/**
 * @author yama
 *
 */
public abstract class TopicQueue {
	protected String id;
	protected String type;
	//
	public String getId(){
		return id;
	}
	//
	public String getType() {
		return type;
	}
	//
	public void start(){
	}
	//
	public abstract int length();
	public abstract void subscribe(short id);
	public abstract void publish(Object obj);
	public abstract Message take();
	public abstract void reject(String id);
	public abstract void accept(String id);
		
}