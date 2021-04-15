package com.example.demo;

import com.example.demo.model.Department;
import com.example.demo.model.Worker;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=
        SpringApplication.run(DemoApplication.class, args);
        DepartmentRepository departmentRepository = configurableApplicationContext.getBean(DepartmentRepository.class);
        Department depMaintenance = new Department("Maintenance");
        Department depBladeRepair = new Department("Blade repair");
        Department depOffshore = new Department("Offshore");
        Department depPainting = new Department("Painting");


        Worker andrew = new Worker("Andrew","Smith",27,"English",depMaintenance);
        Worker mikey = new Worker("Mikey","Gonzalez",35,"Mexican",depMaintenance);
        Worker arnold = new Worker("Arnold","Schmalz",42,"German",depBladeRepair);
        Worker rafal = new Worker("Rafal","Kowalski",32,"Polish",depBladeRepair);
        Worker boris = new Worker("Boris","Vodka",30,"Russian",depOffshore);
        Worker ivan = new Worker("Ivan","Kviatkovski",45,"Ukrainian",depOffshore);
        Worker adrian = new Worker("Adrian","Frost",20,"French",depPainting);
        Worker vladimir = new Worker("Vladimir","Dracula",30,"Romanian",depPainting);

        List<Worker> workersMaintenence = Arrays.asList(andrew,mikey);
        List<Worker> workersBlade = Arrays.asList(arnold,rafal);
        List<Worker> workersOffshore = Arrays.asList(boris,ivan);
        List<Worker> workersPainting = Arrays.asList(adrian,vladimir);
        depMaintenance.setWorkers(workersMaintenence);
        depBladeRepair.setWorkers(workersBlade);
        depOffshore.setWorkers(workersOffshore);
        depPainting.setWorkers(workersPainting);

        departmentRepository.save(depMaintenance);
        departmentRepository.save(depBladeRepair);
        departmentRepository.save(depOffshore);
        departmentRepository.save(depPainting);

    }

}
