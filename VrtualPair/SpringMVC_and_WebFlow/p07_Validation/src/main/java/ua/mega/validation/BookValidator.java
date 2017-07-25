package ua.mega.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.mega.domain.Book;

@Component
public class BookValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(Book.class);
    }

    @Override
    public void validate(Object actualObject, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "isbn", "isbn.invalid");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "errors.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "author", "errors.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "errors.double");

        Book book = (Book) actualObject;
        String isbn = book.getIsbn();

        if (!isValidIsbn(isbn)) {
            errors.rejectValue("isbn", "isbn.invalid");
        }

    }

    // note - not industrial strength implementation!
    public boolean isValidIsbn(String raw)
    {
        if (raw.length() != 10) {
            return false;
        }
        int total = 0;
        for (int i = 0; i < 9; i++) {
            char c = raw.charAt(i);
            int digit = Character.digit(c, 10);
            total += (10 - i) * digit;
        }
        int checksum = Character.digit(raw.charAt(9), 10);
        if (checksum == -1 && raw.charAt(9) == 'X')
        {
            checksum = 10;
        }
        int modulo = total % 11;
        return modulo == 11 - checksum;
    }
}
