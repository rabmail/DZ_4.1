public class BonusMilesService {

    public int calculate(int price) {
        int limit = 20;

        int round = price / limit;

        return round;// возвращаем рассчитанный bonus

    }
}
