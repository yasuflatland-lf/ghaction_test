package studio.admin.test2

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class ApplicationTest extends Specification {

    @AutoCleanup
    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client

    @Unroll("Smoke Test")
    def "Smoke Test"() {
        expect:
        client.toBlocking()
                .retrieve(HttpRequest.GET('/hello/test')) == "Hello test!"
    }
}
