package racingcar.view;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

public class InputView {

    public List<String> readCarNames() {
        System.out.println("경주를 진행할 자동차 목록을 적어주세요.(`,`로 구분)");
        String input = Console.readLine();
        Validator.isCarNameBlank(input);
        return parseCarNames(input);
    }

    private List<String> parseCarNames(String inputString) {
        List<String> parseList = Arrays.asList(inputString.split(","));
        Validator.isNameLengthValid(parseList);
        Validator.hasDuplicateName(parseList);
        return parseList;
    }

    public Integer readRounds() {
        System.out.println("총 몇 라운드를 진행할까요?");
        String input = Console.readLine();
        return Validator.isValidRound(input);
    }
}
