package mn.hello.world

import io.micronaut.function.client.FunctionClient
import io.reactivex.Single

import javax.inject.Named

@FunctionClient
interface MnHelloWorldClient {

    @Named("mn-hello-world")
    Single<String> mnHelloWorld()
}
