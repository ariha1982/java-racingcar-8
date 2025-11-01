package racingcar.view;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

public class InputView {
    private static final Validator validator = new Validator();

    public static List<String> readCarNames() {
        System.out.println("경주를 진행할 자동차 목록을 적어주세요.(`,`로 구분)");
        String input = Console.readLine();
        validator.isCarNameBlank(input);
        return parseCarNames(input);
    }

    private static List<String> parseCarNames(String inputString) {
        List<String> parseList = Arrays.asList(inputString.split(","));
        validator.hasDuplicateName(parseList);
        return parseList;
    }

    public static Integer readRounds() {
        System.out.println("총 몇 라운드를 진행할까요?");
        String input = Console.readLine();
        return validator.isValidRound(input);
    }
}
