package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    private Map<String, Set<WeatherAppClient>> weatherService = new HashMap<>();

    public void addClientToMap(String location, WeatherAppClient weatherAppClient) {
        Set<WeatherAppClient> weatherAppClients = this.weatherService.getOrDefault(location, new HashSet<>());
        weatherAppClients.add(weatherAppClient); // Użycie Set, aby uniknąć duplikatów
        this.weatherService.put(location, weatherAppClients);
    }

    public void removeWeatherAppClientFromGivenLocation(String location, WeatherAppClient weatherAppClient) {
        Set<WeatherAppClient> weatherAppClients = this.weatherService.get(location);
        if (weatherAppClients != null) {
            weatherAppClients.remove(weatherAppClient);
        }
    }

    public void removeWeatherAppClientFromAllLocations(WeatherAppClient weatherAppClient) {
        for (Set<WeatherAppClient> clients : weatherService.values()) {
            clients.remove(weatherAppClient);
        }
    }

    public void sendNotificationLocation(String location, String notification) {
        Set<WeatherAppClient> clients = weatherService.get(location);
        if (clients != null && !clients.isEmpty()) {
            for (WeatherAppClient client : clients) {
                client.notification(notification);
            }
        }
    }

    public void sendNotificationToWeatherAppClients(String notification) {
        for (Set<WeatherAppClient> clients : weatherService.values()) {
            for (WeatherAppClient client : clients) {
                client.notification(notification);
            }
        }
    }

    public void removeLocation(String location) {
        this.weatherService.remove(location);
    }

}
