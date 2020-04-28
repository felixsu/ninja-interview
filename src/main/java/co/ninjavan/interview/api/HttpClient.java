package co.ninjavan.interview.api;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public interface HttpClient<T> {

    /**
     * Execute HTTP GET operation for given URL
     * @param url HTTP url
     * @return HTTP Response
     */
    T get(String url);

    /**
     * @see HttpClient#get(String) with HTTP headers
     * @param url HTTP url
     * @param header HTTP header
     * @return HTTP Response
     */
    T get(String url, Map<String, String> header);

    T post(String url, JsonNode payload);

    T post(String url, JsonNode payload, Map<String, String> header);

    T put(String url, JsonNode payload);

    T put(String url, JsonNode payload, Map<String, String> header);

    T delete(String url, JsonNode payload);

    T delete(String url, JsonNode payload, Map<String, String> header);

}
