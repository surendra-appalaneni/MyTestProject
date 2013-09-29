import groovyx.net.http.RESTClient

class TestRestClient {

    private RESTClient client

    void accessRestService() {
        response = client.get(
                path: urlPath,
                requestContentType: "application/json",
                headers: [Accept: "application/json"],
                query: queryParams,
                body: strBody)
        def result = response.data
        //for accesing response..
        // String encryptedValue = result.soapResponse.account.encryptedData
    }

}
