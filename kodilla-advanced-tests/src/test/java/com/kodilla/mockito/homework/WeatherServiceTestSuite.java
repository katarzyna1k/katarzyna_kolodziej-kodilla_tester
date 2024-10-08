package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {


    WeatherAppClient weatherAppClient = Mockito.mock(WeatherAppClient.class);
    private WeatherService weatherService = new WeatherService();
    String location1 = "Warsaw";
    String location2 = "Lublin";
    String location3 = "Kicznia";

    @Test
    public void weatherAppClientCanAddLocationAndReceiveNotifications() {
        weatherService.addClientToMap(location1, weatherAppClient);
        weatherService.sendNotificationLocation(location1, "test");
        Mockito.verify(weatherAppClient, Mockito.times(1)).notification("test");
    }

    @Test
    public void weatherAppClientCanUnsubscribeFromALocation() {
        weatherService.addClientToMap(location1, weatherAppClient);
        weatherService.removeWeatherAppClientFromGivenLocation(location1, weatherAppClient);
        weatherService.sendNotificationLocation(location1, "test");
        Mockito.verify(weatherAppClient, Mockito.never()).notification(Mockito.anyString());
    }

    @Test
    public void weatherAppClientCanUnsubscribeFromAllLocationsAndReceiveZeroNotifications() {
        weatherService.addClientToMap(location1, weatherAppClient);
        weatherService.addClientToMap(location2, weatherAppClient);
        weatherService.addClientToMap(location3, weatherAppClient);
        weatherService.removeWeatherAppClientFromAllLocations(weatherAppClient);
        weatherService.sendNotificationLocation(location1, "test");
        weatherService.sendNotificationLocation(location2, "test");
        weatherService.sendNotificationLocation(location3, "test");

        Mockito.verify(weatherAppClient, Mockito.never()).notification(Mockito.anyString());
    }

    @Test
    public void onlySubscribersOfGivenLocationReceiveNotifications() {
        WeatherAppClient firstWeatherAppClient = Mockito.mock(WeatherAppClient.class);
        WeatherAppClient secondWeatherAppClient = Mockito.mock(WeatherAppClient.class);
        weatherService.addClientToMap(location1, firstWeatherAppClient);
        weatherService.addClientToMap(location1, secondWeatherAppClient);

        weatherService.sendNotificationLocation(location1, "test");

        Mockito.verify(firstWeatherAppClient, Mockito.times(1)).notification("test");
        Mockito.verify(secondWeatherAppClient, Mockito.times(1)).notification("test");
    }

    @Test
    public void shouldSendNotificationToAllWeatherAppClients() {
        WeatherAppClient firstWeatherAppClient = Mockito.mock(WeatherAppClient.class);
        WeatherAppClient secondWeatherAppClient = Mockito.mock(WeatherAppClient.class);
        weatherService.addClientToMap(location1, firstWeatherAppClient);
        weatherService.addClientToMap(location2, secondWeatherAppClient);

        weatherService.sendNotificationToWeatherAppClients("global notification");

        Mockito.verify(firstWeatherAppClient, Mockito.times(1)).notification("global notification");
        Mockito.verify(secondWeatherAppClient, Mockito.times(1)).notification("global notification");
    }

    @Test
    public void shouldSendNotificationToUniqueClientsInDifferentLocations() {
        WeatherAppClient firstWeatherAppClient = Mockito.mock(WeatherAppClient.class);
        WeatherAppClient secondWeatherAppClient = Mockito.mock(WeatherAppClient.class);

        weatherService.addClientToMap(location1, firstWeatherAppClient);
        weatherService.addClientToMap(location2, secondWeatherAppClient);

        weatherService.sendNotificationLocation(location1, "test notification");
        weatherService.sendNotificationLocation(location2, "test notification");

        Mockito.verify(firstWeatherAppClient, Mockito.times(1)).notification("test notification");
        Mockito.verify(secondWeatherAppClient, Mockito.times(1)).notification("test notification");
    }

    @Test
    public void shouldRemoveLocation() {
        weatherService.addClientToMap(location1, weatherAppClient);
        weatherService.removeLocation(location1);
        weatherService.sendNotificationLocation(location1, "test");
        Mockito.verify(weatherAppClient, Mockito.never()).notification(Mockito.anyString());
    }


}
