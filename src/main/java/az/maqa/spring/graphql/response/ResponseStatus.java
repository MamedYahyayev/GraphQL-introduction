package az.maqa.spring.graphql.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStatus {

    private Double apiVersion;
    private ErrorDetails details;
    private List<Error> errors;


}
