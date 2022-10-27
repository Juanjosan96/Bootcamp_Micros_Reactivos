package Controller;
import java.time.Duration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.webfluxappmicro.Person;

import reactor.core.publisher.Flux;

@RestController
@ResponseStatus(value = HttpStatus.NOT_FOUND)
//@ComponentScan(basePackages = "com.example.Controller")
public class PersonController {

	@GetMapping(path="/prueba")
	public String personList(){
		return "prueba";
	}
	
	@GetMapping(path="/person-list1")
	public Flux<Person> personList1(){
		Person p1=new Person("Uno","A",20);
		Flux<Person> flux = Flux.just(p1).delayElements(Duration.ofSeconds(5));
		return flux;
	}
	@GetMapping("/person-list2")
	public Flux<Person>personList2(){
		Person p1=new Person("Dos","B",20);
		Flux<Person> flux = Flux.just(p1).delayElements(Duration.ofSeconds(5));
		return flux;

	}
	@GetMapping("/person-list3")
	public Flux<Person>personList3(){
		Person p1=new Person("Tres","C",20);
		Flux<Person> flux = Flux.just(p1).delayElements(Duration.ofSeconds(5));
		return flux;

	}
	@GetMapping("/person-list4")
	public Flux<Person>personList4(){
		Person p1=new Person("Cuatro","D",20);
		Flux<Person> flux = Flux.just(p1).delayElements(Duration.ofSeconds(5));
		return flux;

	}
}
