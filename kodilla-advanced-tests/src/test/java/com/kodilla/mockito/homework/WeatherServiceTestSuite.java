//package com.kodilla.mockito.homework;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//public class WeatherServiceTestSuite {
//
//    WeatherAppClient weatherAppClient = Mockito.mock(WeatherAppClient.class);
//    WeatherService weatherService = new WeatherService();
//    String location1 = "Warsaw";
//    String location2 = "Lublin";
//    String location3 = "Kicznia";
//
//    @Test
//    public void weatherAppClientCanAddLocationAndReceiveNotifications() {
//
//        weatherService.addClientToMap(location1, weatherAppClient);
//        weatherService.sendNotificationLocation(location1);
//        Mockito.verify(weatherAppClient, Mockito.times(1)).notification(Mockito.anyString());
//    }
//
//    @Test
//    public void weatherAppClientCanUnsubscribeToALocation() {
//        weatherService.addClientToMap(location1, weatherAppClient);
//        weatherService.removeWeatherAppClientFromGivenLocation(location1, weatherAppClient);
//        weatherService.sendNotificationLocation(location1);
//        Mockito.verify(weatherAppClient, Mockito.never()).notification(Mockito.anyString());
//    }
//
//    @Test
//    public void weatherAppClientCanUnsubscribeToAllLocationsAndReceiveZeroNotifications() {
//        weatherService.addClientToMap(location1, weatherAppClient);
//        weatherService.addClientToMap(location2, weatherAppClient);
//        weatherService.addClientToMap(location3, weatherAppClient);
//        weatherService.removeWeatherAppClientFromAllLocations(weatherAppClient);
//        weatherService.sendNotificationLocation(location1);
//        weatherService.sendNotificationLocation(location2);
//        weatherService.sendNotificationLocation(location3);
//
//        Mockito.verify(weatherAppClient, Mockito.never()).notification(Mockito.anyString());
//    }
//
//    @Test
//    public void onlySubscribersOfGivenLocationReceiveNotifications() {
//        WeatherAppClient firstWeatherAppClient = Mockito.mock(WeatherAppClient.class);
//        WeatherAppClient secondWeatherAppClient = Mockito.mock(WeatherAppClient.class);
//        weatherService.addClientToMap(location1, firstWeatherAppClient);
//        weatherService.addClientToMap(location1, secondWeatherAppClient);
//
//        weatherService.sendNotificationLocation(location1);
//
//        Mockito.verify(firstWeatherAppClient).notification(Mockito.anyString());
//        Mockito.verify(secondWeatherAppClient).notification(Mockito.anyString());
//
//    }
//
//    @Test
//    public void shouldSendNotificationToAllWeatherAppClients() {
//        WeatherAppClient firstWeatherAppClient = Mockito.mock(WeatherAppClient.class);
//        WeatherAppClient secondWeatherAppClient = Mockito.mock(WeatherAppClient.class);
//
//        weatherService.sendNotificationToWeatherAppClients();
//
//        Mockito.verify(firstWeatherAppClient).notification(Mockito.anyString());
//        Mockito.verify(secondWeatherAppClient).notification(Mockito.anyString());
//    }
//
//    @Test
//    public void shouldRemoveLocation(){
//
//    }
//
//
//}
