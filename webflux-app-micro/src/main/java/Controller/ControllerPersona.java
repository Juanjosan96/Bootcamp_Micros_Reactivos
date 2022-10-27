package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.webfluxappmicro.Person;

import reactor.core.publisher.Flux;
import service.PersonService;

@ResponseBody
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Controller
@ComponentScan(basePackages = "com.example.Controller")
public class ControllerPersona {

	@Autowired
	PersonService personService;
	
	@GetMapping(path="/prueba")
	public String personList(){
		return "prueba";
	}
	
	@GetMapping(path="/person-list")
	public String personList(final Model model){
		final Flux <Person> personList = personService.allPersons();
		model.addAttribute("personList",personList);
		return "personList";
	}
	
	
	
}
