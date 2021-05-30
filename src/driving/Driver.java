/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-29 15:02
 */
package  driving;
public class Driver {
    private boolean isWineDrinked = false;


    public void setWineDrinked(boolean isWineDrinked) {
        this.isWineDrinked = isWineDrinked;
    }



    public void drive(Car car) throws InjuryException {
        try {
            car.run();
        } catch (SipException e) {
            dealWithEmergency(car);
        }
        System.out.println("驾驶员到达目的地");

    }

    public void dealWithEmergency(Car car) throws InjuryException {
        try {
            if (isWineDrinked) {
                car.brakeSharply();
            } else {
                car.decelerate();
            }


        } catch (CrashException e) {
            throw new InjuryException("出现驾驶员被撞伤异常");
        }
    }


    public static void main(String[] args) throws InjuryException {
        Driver driver1 = new Driver();
        driver1.setWineDrinked(false);

        Car car1 = new Car();
        car1.setRoadSippery(false);
        driver1.drive(car1);

        Driver driver2 = new Driver();
        driver2.setWineDrinked(false);

        Car car2 = new Car();
        car2.setRoadSippery(true);
        driver2.drive(car2);

        Driver driver3 = new Driver();
        driver3.setWineDrinked(true);
        Car car3 = new Car();
        car3.setRoadSippery(true);
        driver3.drive(car3);

    }


}
