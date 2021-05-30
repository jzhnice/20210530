package driving;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-30 16:47
 */
public class InjuryException  extends  Exception{

    public InjuryException(String inj) {
        super(inj);
        System.out.println(inj);
    }
}
