package racingcar.utils;

import java.util.List;

public class Validator {
    public void isCarNameBlank(String input) {
        if (input.isBlank()) { throw new IllegalArgumentException(); }
    }

    public void hasDuplicateName(List<String> inputNames) {
        long distinctCount = inputNames.stream().distinct().count();
        if (inputNames.size() != distinctCount) { throw new IllegalArgumentException(); }
    }

    public Integer isValidRound(String round) {
        if (round == null || round.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int roundInt;
        if (isNumber(round)) {
            roundInt = Integer.parseInt(round);
        } else {
            throw new IllegalArgumentException();
        }

        if (roundInt <= 0) {
            throw new IllegalArgumentException();
        }

        return roundInt;
    }

    private Boolean isNumber(String round) {
        try {
            Integer.parseInt(round);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
