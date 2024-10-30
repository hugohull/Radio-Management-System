package co2103.hw1.controller;

import co2103.hw1.domain.Station;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;

public class StationValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Station.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Station s = (Station) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "host", "", "Host can't be empty.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "producer", "", "Host can't be empty.");

        List<String> accepted_genres = Arrays.asList("Pop music", "Rock music", "Classical music");
        int accepted = 0;

        for (String genre: accepted_genres){
            if (s.getGenre().equals(genre)){
                accepted ++;
            }
        }

        if (accepted != 1){
            errors.rejectValue("genre", "", "Genre has to be 'Pop music', 'Rock music', or 'Classical music'.");
        }

        if (s.getFrequency() < 90 || s.getFrequency() > 130){
            errors.rejectValue("frequency", "", "Frequency has to be between 90 and 130.");
        }
    }
}
