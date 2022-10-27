package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryOrderByRegion: " + regionRepository.findByCountryContainsOrderByRegionDesc("United"));
        System.out.println("findTop2ByRegion: " + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByRegionCountry: " + regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("department: "+ departmentRepository.findByDepartment("Furniture"));
        System.out.println("departmentDivision: " + departmentRepository.findByDivision("Health"));
        System.out.println("divisionEndIncludes: "+ departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("divisionIncludesDistinct: "+ departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));
    }
}
