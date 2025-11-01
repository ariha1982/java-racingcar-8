package racingcar.utils;

import java.util.List;

public class Validator {
    public static void isCarNameBlank(String input) {
        if (input.isBlank()) { throw new IllegalArgumentException(ErrorCode.INPUT_CANT_BLANK); }
    }

    public static void isNameLengthValid(List<String> names) {
        names.forEach(name -> {
            if (name.length() >= 6) {
                throw new IllegalArgumentException(ErrorCode.NAME_TOO_LONG);
            }
        });
    }

    public static void hasDuplicateName(List<String> inputNames) {
        long distinctCount = inputNames.stream().distinct().count();
        if (inputNames.size() != distinctCount) { throw new IllegalArgumentException(ErrorCode.DUPLICATE_NOT_ALLOWED); }
    }

    public static Integer isValidRound(String round) {
        if (round == null || round.isEmpty()) {
            throw new IllegalArgumentException(ErrorCode.INPUT_CANT_BLANK);
        }

        int roundInt;
        if (isNumber(round)) {
            roundInt = Integer.parseInt(round);
        } else {
            throw new IllegalArgumentException(ErrorCode.INVALID_ROUND);
        }

        if (roundInt <= 0) {
            throw new IllegalArgumentException(ErrorCode.INVALID_ROUND);
        }

        return roundInt;
    }

    private static Boolean isNumber(String round) {
        try {
            Integer.parseInt(round);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
