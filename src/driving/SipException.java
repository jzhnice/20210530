package driving;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-29 15:02
 */
public class SipException extends Exception {
    public SipException(String msg){
        super(msg);
        System.out.println(msg);
    }
}
