package tiengrill.tretto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrettoApplication

fun main(args: Array<String>) {
	runApplication<TrettoApplication>(*args)
}
