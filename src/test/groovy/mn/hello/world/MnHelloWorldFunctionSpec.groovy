package mn.hello.world

import io.micronaut.context.ApplicationContext
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Specification
import javax.inject.Inject

@MicronautTest
class MnHelloWorldFunctionSpec extends Specification {

    @Inject
    MnHelloWorldClient client


    void "test mn-hello-world function"() {
        expect:
        client.mnHelloWorld().blockingGet() == "mn-hello-world"
    }
}
