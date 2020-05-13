package no.blank.test.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("no.blank.test.micronaut")
                .mainClass(Application.javaClass)
                .start()
    }
}
