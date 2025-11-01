package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    public static Boolean IsMoveable() {
        return randomNumberGenerator() >= 4;
    }
    private static Integer randomNumberGenerator() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
