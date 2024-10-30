package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Radio;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class RadioValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Radio.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Radio r = (Radio) target;

        for (Radio n : Hw1Application.radios) {
            if (r.getId() == n.getId()) {
                errors.rejectValue("id", "", "Radio ID is already in use.");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "","Name can't be empty.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"format", "", "Field can't be empty." );
    }
}
