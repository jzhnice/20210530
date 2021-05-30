package driving;

import org.w3c.dom.ls.LSOutput;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-29 15:01
 */
public class Car {
    private  boolean isRoadSippery = false;

    public void setRoadSippery(boolean isRoadSippery) {
        this.isRoadSippery = isRoadSippery;
    }
    public void run() throws SipException {
        System.out.println("车子向前奔驰");
        if(isRoadSippery) {
            throw new SipException("出现车子打滑异常");
        }
    }

    public void brakeSharply() throws CrashException {
        if (isRoadSippery) 
            throw new CrashException("出现车子碰撞异常");

        
        System.out.println("车子孟第停下");
    }

    public void decelerate(){
        System.out.println("松开油门平稳减速");
    }



}
