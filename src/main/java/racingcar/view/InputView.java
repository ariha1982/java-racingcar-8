package racingcar.view;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static List<String> readCarNames() {
        System.out.println("경주를 진행할 자동차 목록을 적어주세요.(`,`로 구분)");
        String input = Console.readLine();
        // TODO: Validator 추가(빈 값인지 확인)
        return parseCarNames(input);
    }

    private static List<String> parseCarNames(String inputString) {
        List<String> parseList = Arrays.asList(inputString.split(","));
        // TODO: Validator 추가(중복 확인)
        return parseList;
    }

    public static Integer readRounds() {
        System.out.println("총 몇 라운드를 진행할까요?");
        String input = Console.readLine();

        // TODO: Validator 추가(자연수인지)
        return Integer.parseInt(input);
    }
}
