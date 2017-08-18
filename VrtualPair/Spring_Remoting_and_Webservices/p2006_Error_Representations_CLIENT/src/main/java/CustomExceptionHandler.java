import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

public class CustomExceptionHandler extends DefaultResponseErrorHandler {

    private List<HttpMessageConverter<?>> converters;

    public CustomExceptionHandler(RestTemplate template)
    {
        converters = template.getMessageConverters();
    }

    @Override
    public void handleError(ClientHttpResponse resp) throws IOException {
        // take the body that was returned, and convert into a java class
        MediaType mediaType = resp.getHeaders().getContentType();
        ErrorInformation error = null;
        for (HttpMessageConverter next : converters)
        {
            if (next.canRead(ErrorInformation.class, mediaType))
            {
                error = (ErrorInformation)next.read(ErrorInformation.class, resp);
            }
        }

        if (resp.getStatusCode() == HttpStatus.NOT_FOUND)
        {
            throw new ResourceNotFoundException(error);
        }

        throw new UnknownHttpErrorException();
    }
}
