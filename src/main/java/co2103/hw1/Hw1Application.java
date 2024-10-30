package co2103.hw1;

import co2103.hw1.domain.Radio;
import co2103.hw1.domain.Station;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {

    public static List<Radio> radios;

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        radios = new ArrayList<>();
        Radio radio_1 = new Radio();

        Station station_1 = new Station();
        station_1.setFrequency(1);
        station_1.setGenre("Classical");
        station_1.setHost("Mike");
        station_1.setProducer("DJ Khaled");

        Station station_2 = new Station();
        station_2.setFrequency(2);
        station_2.setGenre("Grime");
        station_2.setHost("Kevin");
        station_2.setProducer("Ye");

        ArrayList<Station> stations = new ArrayList<>();
        stations.add(station_1);
        stations.add(station_2);

        radio_1.setName("Radio 1");
        radio_1.setFormat("Music");
        radio_1.setId(1);
        radio_1.setStations(stations);
        radios.add(radio_1);

    }
}