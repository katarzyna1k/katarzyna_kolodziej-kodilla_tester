//package com.kodilla.mockito.homework;
//
//import java.util.*;
//
//public class WeatherService {
//
//    private Map<String, List<WeatherAppClient>> weatherService = new HashMap<>();
//
//    public void addClientToMap(String location, WeatherAppClient weatherAppClient) {
//        List<WeatherAppClient> weatherAppClients = this.weatherService.getOrDefault(location, new ArrayList<>());
//        weatherAppClients.add(weatherAppClient);
//        this.weatherService.put(location, weatherAppClients);
//    }
//
//    public void removeWeatherAppClientFromGivenLocation(String location, WeatherAppClient weatherAppClient) {
//        List<WeatherAppClient> weatherAppClients = this.weatherService.get(location);
//        weatherAppClients.remove(weatherAppClient);
//    }
//
//    public void removeWeatherAppClientFromAllLocations(WeatherAppClient weatherAppClient) {
//        List<WeatherAppClient>weatherAppClients=this.weatherService.get(weatherAppClient);
//        weatherAppClients.remove(weatherAppClient);
//
//    }
//
//    public void sendNotificationLocation(String location) {
//        List<WeatherAppClient> clients = weatherService.get(location); // Pobranie listy klientów dla danej lokalizacji
//        if (clients != null) {
//            for (WeatherAppClient client : clients) {
//                client.notification("Weather update for " + location); // Wysyłanie notyfikacji dla każdego klienta
//            }
//        }
//    }
//
//    public void sendNotificationToWeatherAppClients() {
//
//    }
//
//    public void removeLocation(String location) {
//        this.weatherService.remove(location);
//
//    }
//}
