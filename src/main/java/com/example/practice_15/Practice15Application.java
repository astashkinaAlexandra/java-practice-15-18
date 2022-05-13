package com.example.practice_15;

import com.example.practice_15.model.Manufacture;
import com.example.practice_15.model.Worker;
import com.example.practice_15.repository.ManufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice15Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Practice15Application.class, args);
	}

	@Autowired
	private ManufactureRepository manufactureRepository;

	@Override
	public void run(String... args) throws Exception {
		Manufacture manufacture = new Manufacture("London");

		Worker worker1 = new Worker("John", "Smith", "Hamish");
		Worker worker2 = new Worker("Marry", "Smith", "Jane");
		Worker worker3 = new Worker("Peter", "Johnson", "James");

		manufacture.getWorkers().add(worker1);
		manufacture.getWorkers().add(worker2);
		manufacture.getWorkers().add(worker3);

		this.manufactureRepository.save(manufacture);
	}
}
