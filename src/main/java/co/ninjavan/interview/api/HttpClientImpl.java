package co.ninjavan.interview.api;

import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

/**
 * rest assured {@link io.restassured.RestAssured} http client implementation
 * @see RestAssured#get()
 * @see RestAssured#post()
 * @see RestAssured#put()
 * @see RestAssured#delete()
 * @see RestAssured#patch()
 *
 * please implement the class by using {@link RestAssured} http client,
 * you may reuse the method
 */
public class HttpClientImpl implements HttpClient<Response> {

    @Override
    public Response get(String url) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response get(String url, Map<String, String> header) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response post(String url, JsonNode payload) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response post(String url, JsonNode payload, Map<String, String> header) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response put(String url, JsonNode payload) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response put(String url, JsonNode payload, Map<String, String> header) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response delete(String url, JsonNode payload) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Response delete(String url, JsonNode payload, Map<String, String> header) {
        throw new UnsupportedOperationException();
    }

}
