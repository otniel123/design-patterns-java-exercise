package Builder.second;

import java.time.Duration;
import java.util.HashMap;

public class HttpRequest {
    private final String method;
    private final String url;
    private final HashMap<String, String > headers;
    private final String body;
    private final Duration timeOut;

    private HttpRequest(HttpRequestBuilder httpRequestBuilder){
        this.method = httpRequestBuilder.method;
        this.url = httpRequestBuilder.url;
        this.headers = httpRequestBuilder.headers;
        this.body = httpRequestBuilder.body;
        this.timeOut = httpRequestBuilder.timeOut;
    }

    public class HttpRequestBuilder{
        private String method;
        private String url;
        private HashMap<String, String > headers;
        private String body;
        private Duration timeOut = Duration.ofSeconds(10);

        public HttpRequestBuilder get(String url){
            this.method = "get";
            this.url = url;
            return this;
        }

        public HttpRequestBuilder post(String url){
            this.method = "post";
            this.url = url;
            return this;
        }

        public HttpRequestBuilder put(String url){
            this.method = "put";
            this.url = url;
            return this;
        }

        public HttpRequestBuilder delete(String url){
            this.method = "delete";
            this.url = url;
            return this;
        }

        public HttpRequestBuilder headers(String key, String value){
            this.headers.put(key, value);
            return this;
        }

        public HttpRequestBuilder timeOut(Duration timeOut){
            if (timeOut != null){
                this.timeOut = timeOut;
            }
            return this;
        }

        public HttpRequestBuilder body(String body){
            this.body = body;
            return this;
        }

        public HttpRequest build(){
            if (this.method == "get" && this.body != null){
                throw new IllegalStateException("Get methods dont have a body");
            }
            if (!this.url.contains("http")){
                throw new IllegalStateException("no http prefix in URL");
            }
            return new HttpRequest(this);
        }
    }
}
