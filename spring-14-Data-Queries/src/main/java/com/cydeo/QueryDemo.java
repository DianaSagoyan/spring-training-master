package com.cydeo;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public QueryDemo(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryOrderByRegion: " + regionRepository.findByCountryContainsOrderByRegionDesc("United"));
        System.out.println("findTop2ByRegion: " + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByRegionCountry: " + regionRepository.findTopByCountryContainsOrderByRegion("United States"));
    }
}
