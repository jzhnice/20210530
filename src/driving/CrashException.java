package driving;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-30 16:46
 */
public class CrashException extends Exception{

    public CrashException(String  cra) {
        super(cra);
        System.out.println(cra);
    }
}
