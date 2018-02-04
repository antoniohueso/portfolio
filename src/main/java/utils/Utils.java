package utils;

import org.springframework.validation.FieldError;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ahg on 4/2/18.
 */

public class Utils {
    public static List<String> ListErrorsToListOfStrings(List<FieldError> errors) {
        return errors.stream().map( field -> {
            return field.getDefaultMessage();
        }).collect(Collectors.toList());
    }
}
