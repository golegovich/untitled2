package Module6.Citizen;

/**
 * Created by Georgii Tarasenko
 * on 29/03/2017
 */
public class CitizenMain {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++ ){
            CitizenFactory.generateCitizen();
        }
        CitizenFactory.showCitizens();
        CitizenFactory.citizenTalking();
    }


}
